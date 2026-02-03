package gr.aueb.cf.cf9.part2oop.ch18.bankapp.dao;

import gr.aueb.cf.cf9.part2oop.ch18.bankapp.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Implementation of {@link IAccountDAO} using an in-memory {@link ArrayList}.
 * This acts as a mock database.
 */
public class AccountDAOImpl implements IAccountDAO {

    // The "Database" table
    private final List<Account> accounts = new ArrayList<>();

    @Override
    public Account saveOrUpdate(Account account) {
        // Relies on Account.equals() which checks IBAN only
        int index = accounts.indexOf(account);

        if (index == -1) {
            // INSERT: Account does not exist, add it
            accounts.add(account);
            return account;
        }

        // UPDATE: Account exists, replace it with the new state
        accounts.set(index, account);
        return accounts.get(index); // Return the stored instance
    }

    @Override
    public void remove(String iban) {
        accounts.removeIf(a -> a.getIban().equals(iban));
    }

    @Override
    public Optional<Account> findByIban(String iban) {
        return accounts.stream()
                .filter(a -> a.getIban().equals(iban))
                .findFirst();
    }

    @Override
    public List<Account> getAllAccounts() {
        // Returns an unmodifiable snapshot
        // This ensures the caller cannot modify the DAO's internal list directly.
        return List.copyOf(accounts);
    }

    @Override
    public boolean isAccountExists(String iban) {
        return accounts.stream()
                .anyMatch(a -> a.getIban().equals(iban));
    }

    @Override
    public long count() {
        return accounts.size();
    }
}