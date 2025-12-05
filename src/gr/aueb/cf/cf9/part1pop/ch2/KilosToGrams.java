package gr.aueb.cf.cf9.part1pop.ch2;

import java.util.Scanner;

/**
 * Converts a user's weight from kilograms to grams.
 * Example: If the user inputs 5 kg, the output will be 5000 grams.
 */
public class KilosToGrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int KILOS_TO_GRAMS = 1000;
        int inputKilos = 0;
        int grams = 0;

        System.out.println("Please enter your weight in kilograms: ");
        inputKilos = scanner.nextInt();

        grams = inputKilos * KILOS_TO_GRAMS;

        System.out.printf("Weight of %d kilograms in grams is %,d%n", inputKilos, grams);
    }
}
