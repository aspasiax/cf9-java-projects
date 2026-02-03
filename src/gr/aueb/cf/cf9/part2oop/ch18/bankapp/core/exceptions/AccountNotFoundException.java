package gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.exceptions;

/**
 * Thrown when an operation requests an account (by IBAN) that does not exist in the Data Source.
 */
public class AccountNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public AccountNotFoundException(String message) {
        super(message);
    }
}