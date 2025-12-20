package gr.aueb.cf.cf9.part1pop.ch8;

import java.util.Scanner;

/**
 * Demonstrates Exception Handling using try-catch.
 * Scenario:
 * We handle the {@link ArithmeticException} so the program allows
 * the execution flow to continue instead of crashing.
 */
public class Arithmetic2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        try {
            // If an exception occurs here (num2 is 0)
            result = num1 / num2;

            // This line will not be executed. The flow jumps to catch block.
            System.out.println("This line executes only if no error occurs.");

        } catch (ArithmeticException e) {
            // 1. Print the technical stack trace (useful for debugging)
            e.printStackTrace();

            // 2. Print a user-friendly error message using System.err (usually red text)
            System.err.println("Error: Division by zero is not allowed.");
        }

        // The program did not crash. It continues here.
        // If an error occurred, result remains 0 (initial value).
        System.out.println("The result is: " + result);
    }
}