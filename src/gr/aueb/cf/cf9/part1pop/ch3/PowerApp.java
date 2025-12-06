package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Calculates the power of a number, base^power.
 * base^power = base * base * base * ... * base
 * (power times)
 */

public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int power;
        int result = 1;
        int i = 1;

        System.out.println("Please enter the base and the power:");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power) {
            result *= base;
            i++;
        }

        System.out.printf("%d ^ %d = %d%n", base, power, result);
    }
}
