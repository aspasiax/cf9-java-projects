package gr.aueb.cf.cf9.part1pop.ch4;

/**
 * Demonstrates various star (*) printing patterns using for loops.
 * This application generates the following patterns:
 * Horizontal line of 10 stars.
 * Vertical line of 10 stars.
 * 10x10 Grid.
 * Ascending Right Triangle (1 to 10 stars).
 * Descending Right Triangle (10 to 1 stars).
 */

public class StarsApp {

    public static void main(String[] args) {

        // 1. Horizontal stars
        System.out.println("\n1. Horizontal line of 10 stars: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 2. Vertical stars
        System.out.println("\n2. Vertical line of 10 stars: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }

        // 3. 10x10 Grid (Nested Loops)
        System.out.println("\n10x10 Grid: ");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 4. Ascending Triangle (1 to 10)
        System.out.println("\n4. Ascending Right Triangle (1 to 10 stars): ");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 5. Descending Triangle (10 to 1)
        System.out.println("\n5. Descending Right Triangle (10 to 1 stars):");
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}