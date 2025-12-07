package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Checks a user's age to determine voting eligibility.
 * A person is considered eligible if their age is greater than or equal 18.
 */

public class VoteEligibleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int VOTING_AGE = 18;
        boolean isEligible = false;
        int age = 0;

        System.out.println("Please enter your age: ");
        age = scanner.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.println("Voting eligibility status: " + isEligible);
    }
}
