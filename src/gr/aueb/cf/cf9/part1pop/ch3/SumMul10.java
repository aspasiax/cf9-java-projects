package gr.aueb.cf.cf9.part1pop.ch3;
/**
 * A simple application that calculates:
 * 1. The sum of the integers from 1 to 10
 * 2. The product of the integers from 1 to 10
 */
public class SumMul10 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int mul = 1;
        int j = 1;

        // Calculate the sum of numbers from 1 to 10
        while (i <= 10) {
            sum += i;
            i++;
        }

        // Calculate the product of numbers from 1 to 10
        while (j <= 10) {
            mul *= j;
            j++;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + mul);
    }
}
