package gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.exceptions;

/**
 * Thrown specifically when a negative amount is provided for operations
 * that require positive values (Deposit/Withdraw).
 */
public class NegativeAmountException extends Exception {
    private static final long serialVersionUID = 1L;

    public NegativeAmountException(String message) {
        super(message);
    }
}