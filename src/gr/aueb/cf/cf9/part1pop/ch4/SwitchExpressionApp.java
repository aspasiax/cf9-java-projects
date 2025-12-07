package gr.aueb.cf.cf9.part1pop.ch4;

import java.util.Scanner;

/**
 * Evaluates a student's grade using a Switch Expression.
 * Unlike a traditional switch statement, a switch expression returns a value
 * that can be assigned directly to a variable.
 * This class demonstrates:
 * Returning a value from a switch block using the yield keyword.
 * Returning a value directly using the arrow (->) syntax (implicit yield).
 */

public class SwitchExpressionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;
        char classification = ' ';

        System.out.println("Please enter a grade (1-10):");
        grade = scanner.nextInt();

        // Switch Expression: The result is assigned to 'classification'
        classification = switch (grade) {
            case 1, 2, 3, 4 -> {
                System.out.println("Status: Fail");
                // When using a block {}, we must use 'yield' to return the value
                yield 'F';
            }
            case 5, 6 -> 'C';   // Implicit yield (no braces needed for single value)
            case 7, 8 -> 'B';
            case 9, 10 -> 'A';
            default -> 'U';     // U for Unknown/Unclassified
        };

        System.out.println("Classification: " + classification);
    }
}
