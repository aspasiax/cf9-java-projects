package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Demonstrates the usage of break and continue statements.
 * This application calculates the sum of integers entered by the user
 * with two specific rules:
 * If the input is 5, the number is ignored (skipped) using continue.
 * If the input is 10, the number is added to the sum, and then the loop
 * terminates using break.
 */
public class BreakContinueApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("Please enter an integer:");
            num = scanner.nextInt();

            if (num == 5) {
                continue; // Skips the rest of the loop and restarts
            }

            sum += num;

            if (num == 10) {
                break; // Exits the loop immediately
            }
        }

        System.out.println("The sum is: " + sum);
    }
}
