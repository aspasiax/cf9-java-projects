package gr.aueb.cf.cf9.part1pop.ch7;

import java.util.Scanner;

/**
 * String Input/Output using Scanner.
 */
public class StrIO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "";
        String str2 = "";

        System.out.println("Enter two strings: ");

        // reads until it finds whitespace (spaces, tab, new line)
        str1 = scanner.next();

        // reads until it finds a new line character
        // (consumes the rest of the line)
        str2 = scanner.nextLine();

        System.out.println("String 1 (next): " + str1);
        System.out.println("String 2 (nextLine): " + str2);
    }
}
