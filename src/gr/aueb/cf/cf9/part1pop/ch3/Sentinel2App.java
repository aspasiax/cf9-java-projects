package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Demonstrates a concise version of the Sentinel Loop logic.
 * Instead of using a "priming read", this implementation reads the input
 * directly inside the while condition. This idiomatic approach
 * combines the assignment and the check in a single expression.
 */

public class Sentinel2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please enter a number (-1 to exit):");

        // Concise Logic:
        // 1. scanner.nextInt() is called.
        // 2. The result is assigned to 'num'.
        // 3. The new value of 'num' is compared to -1.
        while ((num = scanner.nextInt()) != -1) {
            iterations++;
            System.out.println("Please enter a number (-1 to exit):");
        }

        System.out.printf("Total iterations performed: %d%n", iterations);
    }
}