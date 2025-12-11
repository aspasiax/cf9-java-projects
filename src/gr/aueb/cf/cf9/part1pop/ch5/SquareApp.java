package gr.aueb.cf.cf9.part1pop.ch5;

import java.util.Scanner;

/**
 * Calculates the square of an integer using a dedicated method.0
 */
public class SquareApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int result = 0;

        System.out.println("Please enter an integer: ");
        num = scanner.nextInt();

        result = square(num);

        System.out.printf("The square of %d is %d%n", num, result);
    }

    /**
     * Returns the square of a number.
     *
     * @param num the input number
     * @return the square of the input (num * num)
     */
    public static int square(int num) {
        return num * num;
    }
}
