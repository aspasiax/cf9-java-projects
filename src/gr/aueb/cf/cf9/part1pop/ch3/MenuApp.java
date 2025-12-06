package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Displays a user menu repeatedly until the 'Exit' option is selected.
 * This class demonstrates the use of a do-while loop, ensuring
 * that the menu is shown at least once before checking the user's choice.
 */

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one of the following:");
            System.out.println("1. Insert Request");
            System.out.println("2. Delete Request");
            System.out.println("3. Exit");

            choice = scanner.nextInt();

        } while (choice != 3);

        System.out.println("Thanks for using the program");
    }
}