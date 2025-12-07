package gr.aueb.cf.cf9.part1pop.ch4;

/**
 * Demonstrates the usage of the standard  for loop.
 * The for loop is typically used when the number of iterations
 * is known in advance. It consists of three parts:
 * 1. Initialization: Executed once at the beginning (int i = 1).
 * 2. Condition: Checked before each iteration (i <= 10).
 * 3. Update/Step: Executed after each iteration (i++).
 */

public class ForApp {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}