package gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto;

import java.math.BigDecimal;

/**
 * Data Transfer Object (DTO) for reading Account details.
 * This DTO is returned to the View/Controller layer.
 * It ensures that the internal Entity is not exposed directly.
 *
 * @param iban    The account's IBAN.
 * @param balance The current balance.
 */
public record AccountReadOnlyDTO(String iban, BigDecimal balance) {

    @Override
    public String toString() {
        return "IBAN: " + iban + ", Balance: " + balance;
    }
}