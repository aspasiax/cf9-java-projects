package gr.aueb.cf.cf9.part1pop.ch4;

import java.util.Scanner;

/**
 * Demonstrates a flexible for loop implementation.
 * Unlike standard loops with fixed bounds, this application reads the
 * start value, end value, and step from the standard input.
 * It then iterates through the range, printing
 * each value and calculating the total number of iterations.
 */

public class ForFlexApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step = 0;
        int iterations = 0;

        System.out.println("Please enter start value, end value, and step:");
        startValue = scanner.nextInt();
        endValue = scanner.nextInt();
        step = scanner.nextInt();

        for (int i = startValue; i <= endValue; i += step) {
            iterations++;
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Total iterations: " + iterations);
    }
}
