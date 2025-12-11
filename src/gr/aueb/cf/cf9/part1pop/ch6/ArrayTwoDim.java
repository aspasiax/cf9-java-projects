package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates declaration, initialization, and traversal of 2D Arrays.
 * In Java, a 2D array is essentially an array of arrays.
 * Syntax: type[][] name = new type[rows][columns];
 */
public class ArrayTwoDim {

    public static void main(String[] args) {

        // Method 1: Declaration and Memory Allocation (2 rows, 3 columns)
        int[][] grid = new int[2][3];

        // Manual Population (Row-Major order)
        grid[0][0] = 5;
        grid[0][1] = 7;
        grid[0][2] = 10;
        grid[1][0] = 2;
        grid[1][1] = 6;
        grid[1][2] = 8;

        // Method 2: Array Initializer
        int[][] grid2 = {
                { 10, 20, 30 }, // Row 0
                { 40, 50, 60 }  // Row 1
        };

        // Traversal using Standard For Loop (Access by Index)
        System.out.println("Standard For Loop: ");
        for (int i = 0; i < grid.length; i++) {              // Iterate through rows
            for (int j = 0; j < grid[i].length; j++) {       // Iterate through columns of current row
                System.out.print(grid[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        // Traversal using Enhanced For Loop (For-Each)
        System.out.println("\nEnhanced For Loop:");
        for (int[] row : grid2) {       // Each element of a 2D array is a 1D array (row)
            for (int col : row) {       // Iterate through the integers of the row
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
