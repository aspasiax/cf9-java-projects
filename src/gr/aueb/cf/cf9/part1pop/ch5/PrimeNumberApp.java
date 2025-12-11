package gr.aueb.cf.cf9.part1pop.ch5;

import java.util.Scanner;

/**
 * Checks if an integer is a Prime Number.
 * A Prime Number is a number greater than 1 that has no positive divisors other than 1 and itself.
 * Examples: 2, 3, 5, 7, 11, 13...
 */

public class PrimeNumberApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter an integer: ");
        num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
    }

    /**
     * Validates if the input number is prime.
     *
     * @param num the number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int num) {
        if (num <= 1) return false;      // Numbers <= 1 are not prime
        if (num == 2) return true;       // 2 is the only even prime number
        if (num % 2 == 0) return false;  // Exclude all other even numbers

        // Check only odd numbers up to the square root of num
        // We increment by 2 to skip even numbers (3, 5, 7, 9...)
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
