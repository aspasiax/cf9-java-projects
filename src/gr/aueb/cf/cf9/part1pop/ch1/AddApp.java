package gr.aueb.cf.cf9.part1pop.ch1;

/**
 * Calculates the sum of two integers and prints
 * the result to the console using different output methods.
 */

public class AddApp {

    public static void main(String[] args) {
        // Variable declaration and initialization
        int num1 = 500_000; // Underscore -> better readability of large numbers.
        int num2 = 10_000;
        int result = 0;

        // Processing
        result = num1 + num2;

        // Print result
        System.out.println("Result: " + result);
        System.out.println("The sum of: " + num1 + " and " + num2 + " is: " + result);
        System.out.printf("The sum of: %,d and %,d is: %,d\n", num1, num2, result);
    }
}
