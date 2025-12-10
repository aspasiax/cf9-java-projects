package gr.aueb.cf.cf9.part1pop.ch5;

/**
 * Demonstrates the definition and usage of a simple method.
 * This class defines a static method add that calculates the sum
 * of two integers and returns the result to the caller.
 */

public class AddApp {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = 0;

        // Method Invocation (Call)
        // Arguments (num1, num2) are passed by value.
        sum = add(num1, num2);

        // Fully qualified name call (optional within the same class):
        // sum = AddApp.add(num1, num2);

        System.out.println("Sum = " + sum);
    }

    /**
     * Calculates the sum of two integers.
     *
     * @param a the first integer to add
     * @param b the second integer to add
     * @return the sum of a and b
     */
    public static int add(int a, int b) {
//        int sum = 0;
//
//        sum = a + b;
//
//        return sum;

        // We can directly return the result of the expression.
        return a + b;
    }
}
