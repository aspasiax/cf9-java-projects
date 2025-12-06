package gr.aueb.cf.cf9.part1pop.ch3;

/**
 * Demonstrates a generic while loop based on a range.
 * The user defines a start value, an end value, and a step (increment).
 * The application iterates from the start value up to the end value
 * and calculates the total number of iterations.
 */

public class GenericWhileApp {

    public static void main(String[] args) {
        int i = 1;
        int endVal = 10;
        int step = 1;

        while (i <= endVal) {
            System.out.println("i = " + i);
            i += step;
        }

        System.out.println("Total iterations: " + (i - 1));
    }
}
