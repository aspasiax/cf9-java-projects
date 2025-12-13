package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Finds the first (low) and last (high) index of a target element (key)
 * in a sorted< array containing duplicates.
 */
public class LowHighIndexApp {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8 };
        int key = 8;

        int[] result = getLowAndHighIndexOf(arr, key);

        if (result[0] == -1) {
            System.out.println("Key not found.");
        } else {
            System.out.printf("Key %d found in positions: {%d, %d}%n", key, result[0], result[1]);
            // Output: {7, 11}
        }
    }

    /**
     * Returns an array of size 2 with the low and high indices.
     *
     * @param arr the sorted input array
     * @param key the value to search for
     * @return an int array where index 0 is low and index 1 is high.
     * Returns {-1, -1} if key is not found.
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        if (arr == null) return new int[] { -1, -1 };

        int low = -1;
        int high = -1;

        // 1. Find the first occurrence (Low Index)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                break; // Found the first one, stop here.
            }
        }

        // If not found, return immediately
        if (low == -1) {
            return new int[] { -1, -1 };
        }

        // 2. Find the last occurrence (High Index)
        // Start scanning from 'low' since the array is sorted.
        high = low; // Initialize high to low (in case there's only 1 element)

        for (int i = low + 1; i < arr.length; i++) {
            if (arr[i] == key) {
                high = i;
            } else {
                break; // Since it's sorted, once we see a different number, we are done.
            }
        }

        return new int[] { low, high };
    }
}
