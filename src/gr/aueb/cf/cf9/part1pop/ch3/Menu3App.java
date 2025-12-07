package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Demonstrates a menu application using a do-while loop.
 * The application validates user input to ensure it falls within the range 1-5.
 * It continues to run until the "Exit" option is selected.
 */

public class Menu3App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one of the following:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = in.nextInt();

            if (choice <= 0 || choice >= 6) {
                System.out.println("Invalid Choice. Please try again.");
                continue; // Restart the loop immediately
            }

            if (choice != 5) {
                if (choice == 1) {
                    System.out.println("Selected: Insert");
                } else if (choice == 2) {
                    System.out.println("Selected: Delete");
                } else if (choice == 3) {
                    System.out.println("Selected: Update");
                } else {  // choice == 4
                    System.out.println("Selected: Search");
                }
            }

        } while (choice != 5);

        System.out.println("Exiting... Goodbye!");
    }
}