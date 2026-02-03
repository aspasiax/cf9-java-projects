package gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.exceptions;

/**
 * Thrown when input data fails validation rules (e.g. invalid IBAN format, negative amounts).
 */
public class ValidationException extends Exception {
    private static final long serialVersionUID = 1L;

    public ValidationException(String message) {
        super(message);
    }
}