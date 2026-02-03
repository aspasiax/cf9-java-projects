package gr.aueb.cf.cf9.part2oop.ch18.bankapp.dao;

import gr.aueb.cf.cf9.part2oop.ch18.bankapp.model.Account;
import java.util.List;
import java.util.Optional;

/**
 * Interface defining the Contract for Data Access Operations.
 * This layer is responsible for CRUD (Create, Read, Update, Delete) operations.
 * It hides the details of the storage mechanism (List, Database, File, etc.).
 */
public interface IAccountDAO {

    /**
     * Inserts a new account or updates an existing one.
     *
     * @param account the account to be saved/updated.
     * @return the saved account.
     */
    Account saveOrUpdate(Account account);

    /**
     * Removes an account permanently.
     *
     * @param iban the IBAN of the account to remove.
     */
    void remove(String iban);

    /**
     * Retrieves an account by its IBAN.
     *
     * @param iban the target IBAN.
     * @return an {@link Optional} containing the account if found, or empty otherwise.
     */
    Optional<Account> findByIban(String iban);

    /**
     * Retrieves all registered accounts.
     *
     * @return a List of accounts.
     */
    List<Account> getAllAccounts();

    /**
     * Returns the total number of accounts.
     *
     * @return the count of accounts.
     */
    long count();

    /**
     * Checks if an account exists directly via IBAN.
     * Efficient query method.
     *
     * @param iban the IBAN to check.
     * @return true if exists, false otherwise.
     */
    boolean isAccountExists(String iban);
}