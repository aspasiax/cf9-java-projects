package gr.aueb.cf.cf9.part1pop.challenges;

import java.util.Scanner;

/**
 * Converts a string to alternating Upper/Lower case based on character index.
 * Example: "coding" -> "CoDiNg"
 * Demonstrates: StringBuilder, Character class methods, ternary operator.
 */
public class UpperLower {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        String result = "";

        System.out.println("Enter a string to convert:");
        inputStr = scanner.nextLine();

        // Modularization: Separation of concerns
        result = toAlternatingCase(inputStr);

        System.out.println("Original: " + inputStr);
        System.out.println("Result:   " + result);
    }

    /**
     * Converts the input string to alternating case.
     * Even indices become UpperCase, Odd indices become LowerCase.
     * Non-letter characters are preserved as is.
     *
     * @param s the input string
     * @return the transformed string
     */
    public static String toAlternatingCase(String s) {
        if (s == null || s.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            // If it is a letter, change its case based on index.
            // If it is not a letter (e.g. space), keep it as is.
            if (Character.isLetter(ch)) {
                ch = (i % 2 == 0) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}
