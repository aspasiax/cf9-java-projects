package gr.aueb.cf.cf9.part1pop.ch5;

import java.util.Scanner;

/**
 * Checks if a triangle is a Right-Angled Triangle.
 * According to the Pythagorean theorem, a triangle is right-angled if the square
 * of the hypotenuse (a) is equal to the sum of the squares of the other two sides (b, c).
 * a^2 = b^2 + c^2
 */
public class RightTriangleApp {
    static final double EPSILON = 0.000005;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0.0; // Hypotenuse
        double b = 0.0;
        double c = 0.0;

        System.out.println("Please enter the hypotenuse (a) and the two sides (b, c): ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if (isRightTriangle(a, b, c)) {
            System.out.println("The triangle is Right-Angled (Orthogonal).");
        } else {
            System.out.println("The triangle is NOT Right-Angled.");
        }

        scanner.close();
    }

    /**
     * Determines if a triangle is right-angled based on the input sides.
     * Assumes 'a' is the hypotenuse.
     *
     * @param a the hypotenuse
     * @param b the first side
     * @param c the second side
     * @return true if a^2 is approximately equal to b^2 + c^2
     */
    public static boolean isRightTriangle(double a, double b, double c) {
        // Check if |a^2 - (b^2 + c^2)| is very close to 0
        return Math.abs(a * a - b * b - c * c) <= EPSILON;
    }
}
