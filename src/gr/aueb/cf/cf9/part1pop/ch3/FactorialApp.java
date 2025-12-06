package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Calculate factorial of a number.
 * n! = 1 * 2 * 3 * ... * n
 * For instance, 5! = 1 * 2 * 3 * 4 * 5 = 120
 */

public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int factorial = 1;
        int i = 1;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        while (i <= num) {
            factorial *= i;
            i++;
        }

        System.out.printf("%d! = %d\n", num, factorial);
    }
}

