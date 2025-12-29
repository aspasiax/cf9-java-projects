package gr.aueb.cf.cf9.part1pop.review;

import java.util.Scanner;

/**
 * Demonstrates String concatenation using String.format.
 * Separation of Data (variables) from Representation (Template).
 */
public class StrConCat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname = "";
        int age = 0;
        String message = "";

        // 1. Get String Input
        System.out.println("Please enter your first name: ");
        firstname = scanner.nextLine();

        // 2. Get Integer Input with Validation
        System.out.println("Please enter your age: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number (integer).");
            scanner.nextLine(); // Discard invalid input
        }
        age = scanner.nextInt();

        // Consume the leftover newline character from the buffer
        scanner.nextLine();

        // 3. Business Logic
        message = createMessage(firstname, age);

        // 4. Output
        System.out.println(message);
    }

    /**
     * Creates a formatted message combining name and age.
     * Uses {@link String#format} for cleaner syntax compared to '+' operator.
     *
     * @param firstname the user's first name
     * @param age       the user's age
     * @return the formatted string
     */
    public static String createMessage(String firstname, int age) {
        // %s -> String placeholder
        // %d -> Decimal (integer) placeholder
        return String.format("Hello, my name is %s and I am %d years old.", firstname, age);
    }
}
