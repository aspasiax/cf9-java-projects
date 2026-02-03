package gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto;

import java.math.BigDecimal;

/**
 * Data Transfer Object (DTO) for Deposit operations.
 * Contains only the necessary information to perform a deposit:
 * the target IBAN and the amount.
 *
 * @param iban   The target account IBAN.
 * @param amount The amount to deposit.
 */
public record AccountDepositDTO(String iban, BigDecimal amount) {
}