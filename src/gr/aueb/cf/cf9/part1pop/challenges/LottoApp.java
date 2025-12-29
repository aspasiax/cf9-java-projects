package gr.aueb.cf.cf9.part1pop.challenges;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Generates Lotto combinations based on input numbers and applies specific filters.
 * Constraints/Filters:
 * 1. Even Numbers: No more than 4.
 * 2. Odd Numbers: No more than 4.
 * 3. Contiguous: No more than 2 consecutive numbers.
 * 4. Same Ending: No more than 3 numbers with the same last digit.
 * 5. Same Ten: No more than 3 numbers in the same decade.
 */
public class LottoApp {

    public static void main(String[] args) {
        String inputFile = "src/gr/aueb/cf/cf9/part1pop/challenges/numbers.txt";
        String outputFile = "src/gr/aueb/cf/cf9/part1pop/challenges/lotto.txt";

        int[] numbers = new int[49];
        int pivot = 0;

        try (Scanner scanner = new Scanner(new File(inputFile));
             PrintStream ps = new PrintStream(new FileOutputStream(outputFile))) {

            // 1. Read Inputs
            while (scanner.hasNextInt() && pivot < 49) {
                int num = scanner.nextInt();
                if (num >= 1 && num <= 49) {
                    numbers[pivot++] = num;
                }
            }

            // Copy to exact size array and Sort
            int[] actualNumbers = Arrays.copyOf(numbers, pivot);
            Arrays.sort(actualNumbers);

            // 2. Generate Combinations (Nested Loops)
            int n = actualNumbers.length;
            int[] result = new int[6];
            int countCombinations = 0;

            for (int i = 0; i <= n - 6; i++) {
                for (int j = i + 1; j <= n - 5; j++) {
                    for (int k = j + 1; k <= n - 4; k++) {
                        for (int l = k + 1; l <= n - 3; l++) {
                            for (int m = l + 1; m <= n - 2; m++) {
                                for (int p = m + 1; p <= n - 1; p++) {

                                    result[0] = actualNumbers[i];
                                    result[1] = actualNumbers[j];
                                    result[2] = actualNumbers[k];
                                    result[3] = actualNumbers[l];
                                    result[4] = actualNumbers[m];
                                    result[5] = actualNumbers[p];

                                    // 3. Apply Filters
                                    // If not invalid (valid), then write to file
                                    if (!hasTooManyEvens(result) &&
                                            !hasTooManyOdds(result) &&
                                            !hasContiguous(result) &&
                                            !hasSameEnding(result) &&
                                            !hasSameTen(result)) {

                                        ps.printf("%d %d %d %d %d %d\n",
                                                result[0], result[1], result[2], result[3], result[4], result[5]);
                                        countCombinations++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Success! Generated " + countCombinations + " valid combinations in " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // FILTERS
    // Returns true if the combination is invalid

    public static boolean hasTooManyEvens(int[] arr) {
        int count = 0;
        for (int n : arr) if (n % 2 == 0) count++;
        return count > 4; // Invalid if more than 4 evens
    }

    public static boolean hasTooManyOdds(int[] arr) {
        int count = 0;
        for (int n : arr) if (n % 2 != 0) count++;
        return count > 4; // Invalid if more than 4 odds
    }

    public static boolean hasContiguous(int[] arr) {
        // Check for 3 consecutive numbers
        for (int i = 0; i <= 3; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i+1] == arr[i+2] - 1) return true;
        }
        return false;
    }

    public static boolean hasSameEnding(int[] arr) {
        int[] endings = new int[10];
        for (int n : arr) endings[n % 10]++;
        for (int count : endings) if (count > 3) return true;
        return false;
    }

    public static boolean hasSameTen(int[] arr) {
        int[] tens = new int[5]; // 0-9, 10-19, 20-29, 30-39, 40-49
        for (int n : arr) tens[n / 10]++;
        for (int count : tens) if (count > 3) return true;
        return false;
    }
}
