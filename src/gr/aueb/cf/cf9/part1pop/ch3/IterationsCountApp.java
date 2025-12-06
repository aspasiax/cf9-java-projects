package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Counts the number of iterations based on user input.
 * The application continuously accepts integers from the standard input
 * until the user enters the sentinel value (-1).
 * It then displays the total count of valid numbers entered (excluding the sentinel).
 */

public class IterationsCountApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please enter a number (-1 to quit):");

        while ((num = scanner.nextInt()) != -1) {
            iterations++;
            System.out.println("Please enter a number (-1 to quit):");
        }

        System.out.println("The count of iterations is: " + iterations);
    }
}
