package gr.aueb.cf.cf9.part1pop.ch5;

/**
 * Demonstrates the declaration and initialization of floating-point numbers.
 * Default Literal Type: By default, decimal literals (e.g., 10.5) are of type double.
 * Type Suffix: To assign a literal to a float, you must append 'f' or 'F'.
 * Scientific Notation: Usage of 'e' or 'E' (e.g., 3.0E8).
 */
public class DeclarationsApp {

    public static void main(String[] args) {
        float myFloat = 12.345f;
        float myFloat2 = 12.3456F;

        // Double literals do not require a suffix (though 'd' or 'D' is optional).
        double myDouble = 12.3456789;
        final double PI = 3.14159;

        // Scientific notation example (Scientific E notation)
        // 2.99 * 10^8
        final float LIGHT_SPEED_APPROX = 2.99E8f;

        System.out.printf("myFloat (%%.2f) = %.2f%n", myFloat);
        System.out.printf("myFloat2 (%%e)  = %e%n", myFloat2); // Exponential notation
        System.out.printf("myDouble (%%f)  = %f%n", myDouble);
    }
}
