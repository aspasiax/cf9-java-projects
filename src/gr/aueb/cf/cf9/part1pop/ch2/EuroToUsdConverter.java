package gr.aueb.cf.cf9.part1pop.ch2;

package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Converts a user input amount in euros to US dollars and cents
 * based on a fixed exchange rate.
 * Example: If the user enters 100 euros and the rate is 1 euro = 99 USD cents,
 * the program calculates 9900 cents, which equals 99 USD dollars and 0 USD cents.
 */
public class EuroToUsdConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EUROS_TO_USD = 99;
        int inputEuros = 0;
        int usaDollars = 0;
        int totalUsaCents = 0;
        int usaCents = 0;

        System.out.println("Please enter an amount in euros: ");
        inputEuros = scanner.nextInt();

        // Calculate total USD cents
        totalUsaCents = inputEuros * EUROS_TO_USD;

        // Convert total cents to dollars and remaining cents
        usaDollars = totalUsaCents / 100; // integer division
        usaCents = totalUsaCents % 100;   // remainder using modulo

        System.out.printf("%d euros = %d USD dollars & %d USD cents%n", inputEuros, usaDollars, usaCents);
    }
}
