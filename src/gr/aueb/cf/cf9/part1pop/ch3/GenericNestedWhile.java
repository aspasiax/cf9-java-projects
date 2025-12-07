package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Demonstrates nested while loops.
 * The outer loop determines how many times the application will run (3 times).
 * Inside the outer loop, the user provides a start value, an end value, and a step.
 * The inner loop then calculates and prints the number of iterations required
 * to go from start to end with the given step.
 */
public class GenericNestedWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int count = 0;
        final int TIMES = 3;  // Determines the iterations of the outer loop
        int i = 1;

        // Outer loop: Runs exactly 3 times
        while (i <= TIMES) {
            count = 0; // Reset count for the new session

            System.out.println("Test Case " + i + "/" + TIMES);
            System.out.println("Please enter start value, end value, and step:");
            start = scanner.nextInt();
            end = scanner.nextInt();
            step = scanner.nextInt();

            // Inner loop: Calculates iterations based on user input
            while (start <= end) {
                count++;
                start += step;
            }

            System.out.println("Iteration count: " + count);
            System.out.println();

            i++;
        }
    }
}
