package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Calculates the number of digits in an integer provided by the user.
 * This application works by repeatedly dividing the input number by 10
 * until the number becomes 0.
 * The do-while loop ensures that even the number 0 is counted as having 1 digit.
 * Example: Input: 178   -   Output: 3
 */

public class DigitsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int digits = 0;
        int inputNum = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        inputNum = num;

        do {
            digits++;
            num /= 10; // Equivalent to: num = num / 10;
        } while (num != 0);

        System.out.printf("The number of digits of %d is: %d%n", inputNum, digits);
    }
}
