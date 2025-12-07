package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Determines whether a specific year is a leap year or not.
 * A year is considered a leap year if:
 * It is divisible by 4 AND not divisible by 100, OR
 * It is divisible by 400.
 * For example:
 * 2000 was a leap year (divisible by 400).
 * 2024 was a leap year (divisible by 4 but not 100).
 * 1900 was NOT a leap year (divisible by 100 but not 400).
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        boolean isLeap = false;

        System.out.println("Please insert the year:");
        year = scanner.nextInt();

        isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println("Year: " + year + " is leap: " + isLeap);
    }
}