package gr.aueb.cf.cf9.part1pop.ch2;

import java.util.Scanner;

/**
 * Converts a user's age from years to days.
 * 1 year = 365 days.
 * Example: If the user inputs 20 years, the output will be 7300 days.
 */
public class YearsToDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DAYS_IN_YEAR = 365;
        int inputAgeInYears = 0;
        int ageInDays = 0;

        System.out.println("Please enter your age in years: ");
        inputAgeInYears = scanner.nextInt();

        ageInDays = inputAgeInYears * DAYS_IN_YEAR;

        System.out.printf("Age in years: %d, Age in days: %d%n", inputAgeInYears, ageInDays);
    }
}

