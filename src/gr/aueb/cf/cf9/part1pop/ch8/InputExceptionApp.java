package gr.aueb.cf.cf9.part1pop.ch8;

import java.util.Scanner;

/**
 * Demonstrates how to handle {@link java.util.InputMismatchException} using State-Testing.
 * Instead of using try-catch, we use scanner.hasNextInt() to check
 * if the next token in the buffer is a valid integer.
 */
public class InputExceptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter a number: ");

        // Loop while the next input is not an integer
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Invalid input. Please enter an integer.");

            // Consume the invalid input
            // If we skip this, scanner keeps looking at the same invalid token ("abc")
            // and the loop runs forever.
            scanner.nextLine();

            System.out.println("Please enter a number: ");
        }

        // Now we are safe to read the integer
        num = scanner.nextInt();

        System.out.println("Number: " + num);
    }
}