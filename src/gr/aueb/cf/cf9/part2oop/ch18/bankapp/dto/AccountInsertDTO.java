package gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto;

import java.math.BigDecimal;

/**
 * Data Transfer Object (DTO) for Account Insertion/Creation.
 * We use Java Records to ensure immutability and reduce boilerplate code.
 * This DTO carries the data required to create or update an account.
 *
 * @param iban    The International Bank Account Number.
 * @param balance The initial balance of the account.
 */
public record AccountInsertDTO(String iban, BigDecimal balance) {

    /**
     * Factory method to create an empty DTO.
     * Useful for initializing forms or tests to avoid null pointers.
     *
     * @return an empty AccountInsertDTO instance.
     */
    public static AccountInsertDTO empty() {
        return new AccountInsertDTO("", BigDecimal.ZERO);
    }
}