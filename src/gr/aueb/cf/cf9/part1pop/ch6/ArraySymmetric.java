package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Checks if an array is Symmetric (Palindrome).
 * An array is symmetric if it reads the same forwards and backwards.
 * Examples: [1, 2, 3, 2, 1] and [1, 2, 3, 3, 2, 1] are symmetric. [1, 2, 3] is not.
 * Algorithm: Two-pointer technique. One pointer starts at the beginning (i),
 * the other at the end (j). They move towards the center comparing elements.
 * Time Complexity: O(n/2) -> O(n).
 */
public class ArraySymmetric {

    public static void main(String[] args) {
        int[] symmetricArr = { 1, 2, 3, 2, 1 };
        int[] asymmetricArr = { 1, 2, 3, 4, 5 };

        System.out.println("Is symmetricArr symmetric? " + isSymmetric(symmetricArr));
        System.out.println("Is asymmetricArr symmetric? " + isSymmetric(asymmetricArr));
    }

    /**
     * Determines if an integer array is symmetric (palindrome).
     *
     * @param arr the input array
     * @return true if the array is symmetric, false otherwise
     */
    public static boolean isSymmetric(int[] arr) {
        // Safety check for null arrays
        if (arr == null) return false;

        // Two-pointer Loop:
        // i starts from 0 (head), j starts from length-1 (tail).
        // Loop continues as long as i < j (they haven't met/crossed).
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false; // Found a mismatch, so it's not symmetric.
            }
        }

        // If the loop completes without returning false, the array is symmetric.
        return true;
    }
}
