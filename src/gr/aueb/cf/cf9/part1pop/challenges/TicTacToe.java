package gr.aueb.cf.cf9.part1pop.challenges;

import java.util.Scanner;

/**
 * A Console-based Tic-Tac-Toe game.
 * Features:
 * - 2 Player support (Hotseat).
 * - Input validation (bounds and occupancy check).
 * - Win/Draw detection.
 * - Dynamic board display.
 */
public class TicTacToe {

    // Constants for easier maintenance
    private static final char PLAYER_ONE = 'X';
    private static final char PLAYER_TWO = 'O';
    private static final char EMPTY = ' ';
    private static final int SIZE = 3;

    public static void main(String[] args) {
        char[][] board = createBoard();
        char currentPlayer = PLAYER_ONE;
        boolean gameEnded = false;
        int moves = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Tic-Tac-Toe");
        System.out.println("Player One goes first.");

        while (!gameEnded) {
            printBoard(board);
            System.out.println("Player " + currentPlayer + ", it's your turn.");

            // Get validated input for Row and Column
            // We subtract 1 to convert user input (1-3) to array index (0-2)
            int row = getValidInput(in, "Row (1-3): ") - 1;
            int col = getValidInput(in, "Column (1-3): ") - 1;

            // Check if move is valid (within bounds logic is handled, need to check emptiness)
            if (board[row][col] != EMPTY) {
                System.out.println("Error: This cell is already occupied! Try again.");
                continue; // Skip the rest and restart the loop
            }

            // Execute Move
            board[row][col] = currentPlayer;
            moves++;

            // Check Game State
            if (checkWinner(board, currentPlayer)) {
                printBoard(board);
                System.out.println("\nCONGRATULATIONS! Player " + currentPlayer + " WINS!");
                gameEnded = true;
            } else if (moves == SIZE * SIZE) {
                printBoard(board);
                System.out.println("\nIt's a DRAW! The board is full.");
                gameEnded = true;
            } else {
                // Switch Player
                currentPlayer = (currentPlayer == PLAYER_ONE) ? PLAYER_TWO : PLAYER_ONE;
            }
        }
        in.close();
    }

    /**
     * Initializes the board with empty spaces.
     */
    public static char[][] createBoard() {
        char[][] board = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
        return board;
    }

    /**
     * Prints the game board formatted nicely.
     */
    public static void printBoard(char[][] board) {
        System.out.println("\n   1   2   3");
        System.out.println("-------------");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + "| ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    /**
     * Helper method to ensure user enters an integer between 1 and 3.
     */
    public static int getValidInput(Scanner in, String prompt) {
        int input;
        while (true) {
            System.out.print(prompt);
            if (in.hasNextInt()) {
                input = in.nextInt();
                if (input >= 1 && input <= SIZE) {
                    return input;
                }
            } else {
                in.next(); // consume invalid input
            }
            System.out.println("Invalid input. Please enter a number between 1 and " + SIZE + ".");
        }
    }

    /**
     * Checks all rows, columns, and diagonals for a win.
     */
    public static boolean checkWinner(char[][] b, char p) {
        // Check Rows & Columns
        for (int i = 0; i < SIZE; i++) {
            if ((b[i][0] == p && b[i][1] == p && b[i][2] == p) || // Row i
                    (b[0][i] == p && b[1][i] == p && b[2][i] == p)) { // Col i
                return true;
            }
        }
        // Check Diagonals
        return (b[0][0] == p && b[1][1] == p && b[2][2] == p) || // Main Diagonal
                (b[0][2] == p && b[1][1] == p && b[2][0] == p);   // Anti-Diagonal
    }
}
