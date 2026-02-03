package gr.aueb.cf.cf9.part2oop.ch18.bankapp.model;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Represents a Bank Account Entity.
 * This class is a standard Java Bean (POJO) representing the state of an account.
 * We use {@link BigDecimal} for the balance to ensure financial precision
 * and avoid floating-point rounding errors.
 */
public class Account {
    private String iban;
    private BigDecimal balance;

    public Account() {}

    public Account(String iban, BigDecimal balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }

    /**
     * Checks equality based on the Business Key (IBAN).
     * Two accounts are considered equal if they have the same IBAN,
     * regardless of their balance.
     *
     * @param other the object to compare to.
     * @return true if equal, false otherwise.
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Account account)) return false;
        // Null-safe comparison using Objects.equals
        return Objects.equals(this.getIban(), account.getIban());
    }

    @Override
    public int hashCode() {
        // Generates hash based strictly on the field used in equals()
        return Objects.hash(getIban());
    }
}