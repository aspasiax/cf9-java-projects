package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates Array Traversal (Iteration).
 * Traversal is the process of visiting every element of the array exactly once.
 * This class shows two ways to iterate:
 * Standard for-loop: Uses an index. Best when we need to modify elements or know the position.
 * Enhanced for-loop (for-each): Iterates directly over values. Best for read-only operations.
 */

public class ArrayTraverse {

    public static void main(String[] args) {
        // Initialize arrays with values
        int[] grades = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] scores = { 100, 90, 80, 70, 60 };

        // 1. Standard for-loop
        // Useful when we need the index (i)
        System.out.println("Standard For Loop (with Index): ");
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Grade at index %d: %d%n", i, grades[i]);
        }

        // 2. The "Off-by-One" Error Trap
        // Uncommenting the loop below causes ArrayIndexOutOfBoundsException.
        // Reason: The last valid index is length-1. The condition i <= length tries to access arr[length].
        /*
        for (int i = 0; i <= grades.length; i++) {
            System.out.println(grades[i]);
        }
        */

        // 3. Enhanced for-loop (for-each)
        // Cleaner syntax when we don't need the index.
        System.out.println("\nEnhanced For Loop (Values only): ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}
