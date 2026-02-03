package gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto;

import java.math.BigDecimal;

/**
 * Data Transfer Object (DTO) for Withdraw operations.
 * Contains only the necessary information to perform a withdrawal:
 * the source IBAN and the amount.
 *
 * @param iban   The source account IBAN.
 * @param amount The amount to withdraw.
 */
public record AccountWithdrawDTO(String iban, BigDecimal amount) {
}