package gr.aueb.cf.cf9.part2oop.ch18.bankapp.controller;

import gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.exceptions.ValidationException;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto.AccountWithdrawDTO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.service.IAccountService;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.validation.Validator;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Controller Layer.
 * Orchestrates the interaction between the User Interface (Main class) and the Service Layer.
 * Responsibilities:
 * 1. Receive raw input.
 * 2. Construct DTOs.
 * 3. Validate DTOs.
 * 4. Delegate business logic to the Service.
 */
public class AccountController {

    private final IAccountService accountService;

    // Dependency Injection
    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * Handles the request to create a new account.
     *
     * @param iban    the IBAN provided by the user.
     * @param balance the initial balance.
     * @return a ReadOnly DTO of the created account.
     * @throws ValidationException if input data is invalid.
     */
    public AccountReadOnlyDTO createNewAccount(String iban, BigDecimal balance) throws ValidationException {
        // 1. Create DTO
        AccountInsertDTO insertDTO = new AccountInsertDTO(iban, balance);

        // 2. Validate
        Map<String, String> errors = Validator.validateInsertDTO(insertDTO);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        // 3. Call Service
        return accountService.createNewAccount(insertDTO);
    }

    /**
     * Handles the request to deposit money.
     *
     * @param iban   the target IBAN.
     * @param amount the amount to deposit.
     * @throws AccountNotFoundException if the account does not exist.
     * @throws ValidationException      if input data is invalid.
     */
    public void deposit(String iban, BigDecimal amount) throws AccountNotFoundException, ValidationException {
        AccountDepositDTO depositDTO = new AccountDepositDTO(iban, amount);

        Map<String, String> errors = Validator.validateDepositDTO(depositDTO);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        accountService.deposit(depositDTO);
    }

    /**
     * Handles the request to withdraw money.
     *
     * @param iban   the source IBAN.
     * @param amount the amount to withdraw.
     * @throws AccountNotFoundException     if the account does not exist.
     * @throws InsufficientBalanceException if funds are insufficient.
     * @throws ValidationException          if input data is invalid.
     */
    public void withdraw(String iban, BigDecimal amount) throws AccountNotFoundException, InsufficientBalanceException, ValidationException {
        AccountWithdrawDTO withdrawDTO = new AccountWithdrawDTO(iban, amount);

        Map<String, String> errors = Validator.validateWithdrawDTO(withdrawDTO);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        accountService.withdraw(withdrawDTO);
    }

    /**
     * Handles the request to check balance.
     *
     * @param iban the account IBAN.
     * @return the current balance.
     * @throws AccountNotFoundException if the account does not exist.
     * @throws ValidationException      if the IBAN format is invalid.
     */
    public BigDecimal getBalance(String iban) throws AccountNotFoundException, ValidationException {
        // Direct validation on the input since there is no DTO for simple retrieval
        Map<String, String> errors = Validator.validateIban(iban);

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        return accountService.getBalance(iban);
    }

    /**
     * Handles the request to view all accounts.
     *
     * @return a list of all accounts.
     */
    public List<AccountReadOnlyDTO> getAllAccounts() {
        return accountService.getAllAccounts();
    }
}