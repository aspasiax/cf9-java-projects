package gr.aueb.cf.cf9.part1pop.ch2;

/**
 * Demonstrates integer overflow.
 * When an operation results in a value larger than the maximum
 * limit of the data type, the value wraps around to the minimum limit.
 */

public class OverflowApp {

    public static void main(String[] args) {
        int num1 = Integer.MAX_VALUE;   // 2,147,483,647
        int num2 = 1;
        int result = 0;

        result = num1 + num2;

        System.out.println("The result is: " + result);
    }
}
