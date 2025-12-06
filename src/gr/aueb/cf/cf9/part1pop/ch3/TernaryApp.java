package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Demonstrates the usage of the Ternary Operator (conditional assignment).
 * This application accepts two integers from the user and determines
 * the minimum of the two using the ternary operator
 */

public class TernaryApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        // Ternary Operator approach (Syntactic Sugar)
        // Format: (Condition) ? value_if_true : value_if_false;
        min = (num1 < num2) ? num1 : num2;

        System.out.println("The smallest number is: " + min);
    }
}
