package gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.exceptions;

/**
 * Thrown when attempting to create an account with an IBAN that is already registered.
 */
public class AccountAlreadyExistsException extends Exception {
    private static final long serialVersionUID = 1L;

    public AccountAlreadyExistsException(String message) {
        super(message);
    }
}