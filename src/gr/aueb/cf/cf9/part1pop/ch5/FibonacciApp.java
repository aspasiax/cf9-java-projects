package gr.aueb.cf.cf9.part1pop.ch5;

import java.util.Scanner;

/**
 * Calculates the n-th Fibonacci number using Recursion.
 * The Fibonacci sequence is defined as:
 * F(0) = 0
 * F(1) = 1
 * F(n) = F(n-1) + F(n-2) for n > 1
 * Example: 0, 1, 1, 2, 3, 5, 8, 13, 21...
 */

public class FibonacciApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int result = 0;

        System.out.println("Please enter n to calculate F(n):");
        n = scanner.nextInt();

        // Check for valid input (Fibonacci is usually defined for non-negative integers)
        if (n < 0) {
            System.out.println("Error: n cannot be negative.");
        } else {
            result = fibo(n);
            System.out.println("Fibonacci(" + n + ") = " + result);
        }
    }

    /**
     * Recursive method to calculate the n-th Fibonacci number.
     *
     * @param n the position in the sequence
     * @return the Fibonacci number at position n
     */
    public static int fibo(int n) {
        // If n is 0, return 0.
        // If n is 1, return 1.
        if (n <= 1) {
            return n;
        }

        // The sum of the two preceding numbers.
        return fibo(n - 1) + fibo(n - 2);
    }
}