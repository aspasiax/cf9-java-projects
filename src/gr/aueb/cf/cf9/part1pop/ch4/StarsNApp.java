package gr.aueb.cf.cf9.part1pop.ch4;

import java.util.Scanner;

/**
 * Generates various star (*) patterns based on a user-defined integer n.
 * The application prompts the user for a number (n) and prints:
 * A horizontal line of n stars.
 * A vertical line of n stars.
 * A square grid of n x n stars.
 * An ascending triangle (1 to n stars).
 * A descending triangle (n to 1 stars).
 */

public class StarsNApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("Please enter the number of stars (n): ");
        n = scanner.nextInt();

        // 1. n stars horizontally
        System.out.println("\nHorizontal");
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println(); // Necessary to move to the next line after horizontal print

        // 2. n stars vertically
        System.out.println("\nVertical");
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }

        // 3. n rows of n stars (Square)
        System.out.println("\nSquare Grid (nxn)");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 4. Ascending Triangle (1 to n)
        System.out.println("\nAscending Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 5. Descending Triangle (n to 1)
        System.out.println("\nDescending Triangle");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
