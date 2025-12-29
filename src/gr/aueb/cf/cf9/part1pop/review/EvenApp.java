package gr.aueb.cf.cf9.part1pop.review;

import java.util.Scanner;

/**
 * Checks if an input number is even (divisible by 2).
 * demonstrates Input Validation and Modular Programming.
 */
public class EvenApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean isEven = false;

        // 1. Validation and Data Binding (Input)
        System.out.println("Please enter an integer: ");

        // Loop until the user provides a valid integer
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Invalid input. Please enter a whole number: ");
            scanner.nextLine(); // Consume the invalid input to avoid infinite loop
        }
        num = scanner.nextInt();

        // 2. Business Logic (Processing)
        isEven = isEven(num);

        // 3. Output
        System.out.printf("Is the number %d even? %b\n", num, isEven);
    }

    /**
     * Checks if a number is even.
     *
     * @param num the number to check
     * @return true if the number is even, false otherwise
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
