package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Calculates the absolute value of an integer using the ternary operator.
 * The absolute value of a number x is the non-negative value of x regardless of its sign.
 * Examples:absolute of 5 is 5 and absolute of -5 is 5
 */

public class AbsTernary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        abs = (num >= 0) ? num : -num;

        System.out.println("The absolute value of " + num + " is: " + abs);
    }
}