package gr.aueb.cf.cf9.part1pop.ch5;

/**
 * Demonstrates the correct way to compare floating-point numbers using an Epsilon.
 * Due to representation errors, we rarely use the equality operator (==).
 * Instead, we check if the absolute difference between the two numbers is less than
 * a very small threshold (EPSILON).
 */

public class EpsilonApp {

    public static void main(String[] args) {
        // EPSILON represents the margin of error we are willing to accept.
        final double EPSILON = 0.000005;

        double actual = 0.0;
        double expected = 1.0;

        // Perform calculation prone to precision errors
        for (int i = 1; i <= 10; i++) {
            actual += 0.1;
        }

        System.out.printf("Actual:   %.20f%n", actual);
        System.out.printf("Expected: %.20f%n", expected);

        // SAFE COMPARISON: |actual - expected| <= EPSILON
        if (Math.abs(actual - expected) <= EPSILON) {
            System.out.println("Result: EQUAL (Within epsilon range)");
        } else {
            System.out.println("Result: NOT EQUAL");
        }
    }
}
