package gr.aueb.cf.cf9.part1pop.ch4;

import java.util.Scanner;

/**
 * Evaluates a student's grade and prints a corresponding qualitative description.
 * This class demonstrates the fall-through feature of the switch statement.
 * Multiple cases are grouped together to share the same execution block.
 */
public class GradeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please enter a grade (1-10):");
        grade = scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                // Cases 1 through 4 "fall through" to here
                System.out.println("Fail");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very Good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Error: Grade must be between 1 and 10.");
                break;
        }
    }
}
