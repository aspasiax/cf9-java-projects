package gr.aueb.cf.cf9.part1pop.ch5;

import java.util.Scanner;

/**
 * Determines whether an integer is even or odd using boolean methods.
 * This application demonstrates:
 * Defining methods that return boolean (predicates).
 * Method delegation (isOdd calls isEven).
 */

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter an integer to check parity:");
        num = scanner.nextInt();

        if (isEven(num)) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }

    /**
     * Checks if a number is even.
     *
     * @param num the number to check
     * @return {@code true} if the number is even, {@code false} otherwise
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * Checks if a number is odd.
     *
     * @param num the number to check
     * @return true if the number is odd, false otherwise
     */
    public static boolean isOdd(int num) {
        return !isEven(num);
    }
}