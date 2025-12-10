package gr.aueb.cf.cf9.part1pop.ch4;

/**
 * Prints a countdown from 10 down to 1.
 * This application demonstrates the usage of a decrementing for loop,
 * where the loop counter is initialized to a high value and decreases
 * by 1 in each iteration until it reaches the lower bound.
 */

public class ReverseCount {

    public static void main(String[] args) {
        System.out.println("Countdown from 10 to 1:");

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
