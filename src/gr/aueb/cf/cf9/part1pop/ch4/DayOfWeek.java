package gr.aueb.cf.cf9.part1pop.ch4;

import java.util.Scanner;

/**
 * Converts a numeric input (1-7) into the corresponding day of the week.
 * This application demonstrates the use of the modern Switch Expression,
 * which returns a value directly, making the code more concise and readable
 * compared to traditional switch statements.
 */
public class DayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayName;
        int day = 0;

        System.out.print("Please enter a day number (1-7): ");
        day = scanner.nextInt();

        dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println("Day: " + dayName);
    }
}
