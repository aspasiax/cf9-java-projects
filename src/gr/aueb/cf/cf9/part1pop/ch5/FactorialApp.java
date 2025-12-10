package gr.aueb.cf.cf9.part1pop.ch5;

import java.util.Scanner;

/**
 * Calculates the factorial of a number using a method.
 * Mathematical definition: n! = 1 * 2 * ... * n.
 * Special case: 0! = 1.
 */

public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int result = 0;

        System.out.println("Please enter an integer: ");
        num = scanner.nextInt();

        // Method Call (Invocation)
        // 'num' is the ACTUAL parameter (or Argument).
        // Its value is copied and passed to the method.
        result = facto(num);

        System.out.println(num + "! = " + result);
    }

    /**
     * Calculates the factorial of n.
     *
     * @param n the FORMAL parameter that receives the input value
     * @return the calculated factorial
     */

    public static int facto(int n) {
        int factorial = 1;

        // Iterate from 1 to n
        // If n is 0, the loop condition (1 <= 0) is false, so it returns 1 (correct, as 0! = 1).
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
