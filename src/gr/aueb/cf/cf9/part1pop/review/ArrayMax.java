package gr.aueb.cf.cf9.part1pop.review;

import java.util.Scanner;

/**
 * Finds the maximum value in an integer array.
 * Demonstrates Input Validation and Linear Search Algorithm.
 */
public class ArrayMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 5;
        int[] numbers = new int[SIZE];
        int maxPosition;
        int maxValue;

        System.out.println("Please enter " + SIZE + " integers:");

        // 1. Populate Array with Validation
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Consume invalid input
            }
            numbers[i] = scanner.nextInt();
        }

        // 2. Business Logic (Delegation)
        maxPosition = findMaxPosition(numbers);

        // Safety check in case the method returned an error code (-1)
        if (maxPosition == -1) {
            System.out.println("Error: The array was empty or null.");
        } else {
            maxValue = numbers[maxPosition];
            System.out.printf("The maximum value is: %d at position %d.\n", maxValue, (maxPosition + 1));
        }
    }

    /**
     * Finds the index (position) of the maximum value in an array.
     *
     * @param arr the input array
     * @return the index of the max value, or -1 if array is null/empty
     */
    public static int findMaxPosition(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        // Start from i = 1, since we already assume arr[0] is max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
