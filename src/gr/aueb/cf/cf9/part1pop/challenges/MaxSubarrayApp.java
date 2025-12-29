package gr.aueb.cf.cf9.part1pop.challenges;

/**
 * Solves the Maximum Subarray Problem using Kadane's Algorithm.
 * Find the contiguous subarray which has the largest sum.
 * Example: {-2, 1, -3, 4, -1, 2, 1, -5, 4} -> Output: 6 (from [4, -1, 2, 1])
 */
public class MaxSubarrayApp {
    static int globalMax = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Method 1: Recursive (O(n) time, O(n) space due to stack)
        findMaxSumRecursive(arr, arr.length - 1);
        System.out.println("Max Sum (Recursive): " + globalMax);

        // Method 2: Iterative - Kadane's Algorithm (O(n) time, O(1) space)
        int iterativeMax = findMaxSumIterative(arr);
        System.out.println("Max Sum (Iterative): " + iterativeMax);
    }

    /**
     * Recursive implementation.
     * Logic: localMax[i] = max(arr[i], arr[i] + localMax[i-1])
     */
    public static int findMaxSumRecursive(int[] arr, int n) {
        if (n == 0) {
            // Update globalMax in case the array has only one element
            if (arr[0] > globalMax) globalMax = arr[0];
            return arr[0];
        }

        // Recursive Step
        int localMaxOfPrevious = findMaxSumRecursive(arr, n - 1);

        // Start new subarray at arr[n] OR Extend previous subarray
        int currentLocalMax = Math.max(arr[n], arr[n] + localMaxOfPrevious);

        // Update Global Maximum if needed
        if (currentLocalMax > globalMax) {
            globalMax = currentLocalMax;
        }

        return currentLocalMax;
    }

    /**
     * Standard Iterative Kadane's Algorithm.
     */
    public static int findMaxSumIterative(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int localMax = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            localMax = Math.max(arr[i], arr[i] + localMax);

            if (localMax > globalMax) {
                globalMax = localMax;
            }
        }
        return globalMax;
    }
}