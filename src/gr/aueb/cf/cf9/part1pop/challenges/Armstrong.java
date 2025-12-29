package gr.aueb.cf.cf9.part1pop.challenges;

import java.util.Scanner;

/**
 * Checks if a number is an Armstrong number.
 * An Armstrong number is a number that is equal
 * to the sum of its own digits each raised to
 * the power of the number of digits.
 * Example: 153 = 1^3 + 5^3 + 3^3
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Armstrong Number Checker");
        System.out.print("Please enter a positive integer: ");

        // Validation: Ensure input is an integer
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.nextLine(); // consume garbage
        }
        num = scanner.nextInt();

        // Check and Print
        if (isArmstrong(num)) {
            System.out.printf("%d is an Armstrong number.\n", num);
        } else {
            System.out.printf("%d is NOT an Armstrong number.\n", num);
        }
    }

    /**
     * Determines if a number is an Armstrong number.
     *
     * @param num the number to check
     * @return true if Armstrong, false otherwise
     */
    public static boolean isArmstrong(int num) {
        // Armstrong numbers are typically defined for positive integers.
        if (num < 0) return false;

        String strNum = String.valueOf(num);
        int numberOfDigits = strNum.length();
        int originalNum = num;
        int sum = 0;
        int digit;

        while (num > 0) {
            digit = num % 10; // Get the last digit

            // Raise digit to the power of total digits and add to sum
            sum += (int) Math.pow(digit, numberOfDigits);

            num /= 10; // Remove the last digit
        }

        return sum == originalNum;
    }
}
