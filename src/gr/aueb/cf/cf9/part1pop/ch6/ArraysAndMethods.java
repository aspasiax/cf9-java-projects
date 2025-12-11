package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates how to pass arrays as arguments to methods and how to return arrays.
 * Arrays are Reference Types. When passed to a method, the method receives
 * a copy of the reference (pointer), pointing to the <b>same</b> array in memory.
 * Method Overloading: Same method name, different parameter signatures.
 */

public class ArraysAndMethods {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("Print Full Array: ");
        printArray(arr);

        System.out.println("\nPrint Slice (1 to 4)");
        // We pass 'arr.length' as high because high is EXCLUSIVE.
        // Range [0, length) prints indices: 0, 1, 2, 3, 4 (ALL elements).
        printArray(arr, 1, 4); // Will print 2, 3, 4
    }

    /**
     * Prints all elements of an integer array.
     *
     * @param arr the input array
     */
    public static void printArray(int[] arr) {
        if (arr == null) return; // Safety check

        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println(); // Add new line at the end
    }

    /**
     * Prints a slice of the array within the specified range [low, high).
     *
     * @param arr  the input array
     * @param low  the starting index (inclusive)
     * @param high the ending index (exclusive)
     */
    public static void printArray(int[] arr, int low, int high) {
        // Validations
        if (arr == null) return;
        if (low < 0 || high > arr.length) {
            System.out.println("Error: Invalid range indices.");
            return;
        }
        if (low >= high) {
            return; // Empty range or invalid logic
        }

        for (int i = low; i < high; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Factory method that creates and returns a new integer array of size 5.
     *
     * @return a new int array of length 5
     */
    public static int[] getArray5() {
        return new int[5];
    }
}
