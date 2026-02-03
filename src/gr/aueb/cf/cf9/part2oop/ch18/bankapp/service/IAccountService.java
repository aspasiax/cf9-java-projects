package gr.aueb.cf.cf9.part2oop.ch18.bankapp.service;

import gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto.AccountWithdrawDTO;

import java.math.BigDecimal;
import java.util.List;

/**
 * Service Layer Interface.
 * Defines the business logic contract.
 * It sits between the Controller and the DAO.
 */
public interface IAccountService {

    /**
     * Creates a new account or updates an existing one.
     *
     * @param insertDTO Data Transfer Object with IBAN and Balance.
     * @return A read-only view of the created/updated account.
     */
    AccountReadOnlyDTO createNewAccount(AccountInsertDTO insertDTO);

    /**
     * Deposits money into an account.
     *
     * @param depositDTO DTO containing IBAN and Amount.
     * @throws AccountNotFoundException if the account does not exist.
     */
    void deposit(AccountDepositDTO depositDTO) throws AccountNotFoundException;

    /**
     * Withdraws money from an account.
     *
     * @param withdrawDTO DTO containing IBAN and Amount.
     * @throws InsufficientBalanceException if balance < amount.
     * @throws AccountNotFoundException     if the account does not exist.
     */
    void withdraw(AccountWithdrawDTO withdrawDTO) throws InsufficientBalanceException, AccountNotFoundException;

    /**
     * Gets the current balance of an account.
     *
     * @param iban The account IBAN.
     * @return The balance as BigDecimal.
     * @throws AccountNotFoundException if the account does not exist.
     */
    BigDecimal getBalance(String iban) throws AccountNotFoundException;

    /**
     * Retrieves all accounts.
     *
     * @return A list of Read-Only DTOs.
     */
    List<AccountReadOnlyDTO> getAllAccounts();
}