package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Users iteratively guess a secret number until they succeed.
 * This class demonstrates the use of the continue statement
 * to skip the remainder of the loop iteration when the guess is incorrect,
 * and the {@code break} statement to exit the infinite loop upon success.
 */
public class SecretIterativeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 80;
        int num = 0;

        while (true) {
            System.out.println("Please guess the secret number: ");
            num = scanner.nextInt();

            if (num != SECRET) {
                System.out.println("Try again!");
                continue;
            }

            System.out.println("Congratulations! You guessed the secret number!");
            break;
        }
    }
}
