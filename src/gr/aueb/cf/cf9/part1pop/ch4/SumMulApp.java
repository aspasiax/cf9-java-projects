package gr.aueb.cf.cf9.part1pop.ch4;
/**
 * Calculates and prints the sum and product of the first 10 integers.
 * This application demonstrates how to perform aggregate calculations
 * within a single for loop.
 */
public class SumMulApp {

    public static void main(String[] args) {
        int sum = 0;    // Initialized to 0 (additive identity)
        int mul = 1;    // Initialized to 1 (multiplicative identity)

        for (int i = 1; i <= 10; i++) {
            sum += i;   // sum = sum + i;
            mul *= i;   // mul = mul * i;
        }

        System.out.println("Sum of the first 10 integers: " + sum);
        System.out.println("Product of the first 10 integers: " + mul);
    }
}