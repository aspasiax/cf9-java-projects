package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates Circular Rotation (Shift) of an array.
 * This example uses the modulo operator (%) to wrap indices around,
 * avoiding the need for complex conditional logic when indices exceed array bounds.
 * Right Shift: Elements move to the right. The last element moves to the start.
 * Left Shift: Elements move to the left. The first element moves to the end.
 */
public class ArrayCircularRotation {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // Perform Left Shift by 1
        int[] arrLeft = shiftLeftBy(arr, 1);
        System.out.println("Original:  1 2 3 4 5");
        System.out.print("Left (1):  ");
        printArray(arrLeft);

        // Perform Right Shift by 2
        int[] arrRight = shiftRightBy(arr, 2);
        System.out.print("\nRight (2): ");
        printArray(arrRight);
        System.out.println();
    }

    /**
     * Rotates the array to the right by a given offset.
     * Logic: New position = (old position + offset) % length.
     *
     * @param arr    the source array
     * @param offset the number of positions to shift
     * @return a new array with shifted elements
     */
    public static int[] shiftRightBy(int[] arr, int offset) {
        // Prevent ArithmeticException (division by zero) if length is 0
        if (arr == null || arr.length == 0) return new int[0];
        if (offset < 0) return new int[0]; // Or handle negative offset as left shift

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // Place the current element (i) into its new calculated position
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    /**
     * Rotates the array to the left by a given offset.
     * Logic: Fetch value from (current position + offset) % length.
     *
     * @param arr    the source array
     * @param offset the number of positions to shift
     * @return a new array with shifted elements
     */
    public static int[] shiftLeftBy(int[] arr, int offset) {
        if (arr == null || arr.length == 0) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // Fill current position (i) with the element from the shifted position
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
