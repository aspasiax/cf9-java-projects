package gr.aueb.cf.cf9.part2oop.ch18.bankapp.service;

import gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.mapper.Mapper;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dao.IAccountDAO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto.AccountWithdrawDTO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.model.Account;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class AccountServiceImpl implements IAccountService {

    private final IAccountDAO accountDAO;

    // Dependency Injection via Constructor
    public AccountServiceImpl(IAccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public AccountReadOnlyDTO createNewAccount(AccountInsertDTO insertDTO) {
        // 1. Map DTO -> Entity
        Account account = Mapper.mapToModelEntity(insertDTO);

        // 2. Business Logic: Upsert (Insert or Update)
        // Check for existing account here if you want to prevent duplicates instead of updating.
        Account savedAccount = accountDAO.saveOrUpdate(account);

        // 3. Map Entity -> DTO and return
        return Mapper.mapToReadOnly(savedAccount);
    }

    @Override
    public void deposit(AccountDepositDTO depositDTO) throws AccountNotFoundException {
        try {
            // Find account
            Account account = accountDAO.findByIban(depositDTO.iban())
                    .orElseThrow(() -> new AccountNotFoundException("Account with IBAN " + depositDTO.iban() + " not found"));

            // Add amount
            account.setBalance(account.getBalance().add(depositDTO.amount()));

            // Save state
            accountDAO.saveOrUpdate(account);

        } catch (AccountNotFoundException e) {
            System.err.printf("[%s] Error depositing to IBAN %s: %s%n", LocalDateTime.now(), depositDTO.iban(), e.getMessage());
            throw e;
        }
    }

    @Override
    public void withdraw(AccountWithdrawDTO withdrawDTO) throws InsufficientBalanceException, AccountNotFoundException {
        try {
            // Find account
            Account account = accountDAO.findByIban(withdrawDTO.iban())
                    .orElseThrow(() -> new AccountNotFoundException("Account with IBAN " + withdrawDTO.iban() + " not found"));

            // Check Balance
            if (account.getBalance().compareTo(withdrawDTO.amount()) < 0) {
                throw new InsufficientBalanceException("Insufficient balance for IBAN " + withdrawDTO.iban());
            }

            // Subtract amount
            account.setBalance(account.getBalance().subtract(withdrawDTO.amount()));

            // Save state
            accountDAO.saveOrUpdate(account);

        } catch (AccountNotFoundException | InsufficientBalanceException e) {
            System.err.printf("[%s] Error withdrawing from IBAN %s: %s%n", LocalDateTime.now(), withdrawDTO.iban(), e.getMessage());
            throw e;
        }
    }

    @Override
    public BigDecimal getBalance(String iban) throws AccountNotFoundException {
        return accountDAO.findByIban(iban)
                .map(Account::getBalance)
                .orElseThrow(() -> {
                    System.err.printf("[%s] Error getting balance. IBAN %s not found.%n", LocalDateTime.now(), iban);
                    return new AccountNotFoundException("Account with IBAN " + iban + " not found");
                });
    }

    @Override
    public List<AccountReadOnlyDTO> getAllAccounts() {
        return accountDAO.getAllAccounts().stream()
                .map(Mapper::mapToReadOnly)
                .collect(Collectors.toList());
    }
}