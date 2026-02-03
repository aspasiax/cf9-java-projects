package gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.exceptions;

/**
 * Thrown when a withdrawal amount exceeds the current account balance.
 */
public class InsufficientBalanceException extends Exception {
    private static final long serialVersionUID = 1L;

    public InsufficientBalanceException(String message) {
        super(message);
    }
}