package gr.aueb.cf.cf9.part1pop.ch4;

/**
 * Demonstrates the usage of the {@code char} primitive data type.
 * This application shows:
 * How to declare and initialize characters.
 * How to print characters.
 * How to cast a char to an int to reveal its underlying Unicode/ASCII (ordinal) value.
 */

public class CharApp {

    public static void main(String[] args) {
        final char EMPTY_CHAR = ' ';
        char chA = 'A';
        char star = '*';

        // Printing using standard concatenation
        System.out.println("char: " + chA);
        System.out.println("char: " + star);

        // We cast (int) chA to get the numeric representation (ASCII code point).
        System.out.printf("Char: %c, Ordinal: %d%n", chA, (int) chA);
        System.out.printf("Char: %c, Ordinal: %d%n", star, (int) star);
    }
}
