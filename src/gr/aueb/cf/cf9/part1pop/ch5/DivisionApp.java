package gr.aueb.cf.cf9.part1pop.ch5;

import java.util.Scanner;

/**
 * Demonstrates floating-point division and modulo operations.
 * Division (/): Dividing a non-zero double by 0.0 results in Infinity.
 * Dividing 0.0 by 0.0 results in NaN (Not a Number).
 * Modulo (%): Works with decimals too.
 */

public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0.0;
        double num2 = 0.0;
        double result = 0.0;
        double remainder = 0.0;

        System.out.println("Please enter two double numbers (numerator, denominator):");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        // Floating-point division by zero does NOT throw an exception.
        result = num1 / num2;

        remainder = num1 % num2;

        System.out.printf("Division: %.2f / %.2f = %.2f%n", num1, num2, result);
        System.out.printf("Modulo:   %.2f %% %.2f = %.2f%n", num1, num2, remainder);
    }
}
