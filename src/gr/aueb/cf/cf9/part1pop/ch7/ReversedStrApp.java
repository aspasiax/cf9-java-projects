package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Demonstrates String reversal using:
 * 1. Iterative approach (Manual).
 * 2. StringBuilder API (Automatic).
 */
public class ReversedStrApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        System.out.println("Original: " + s);
        System.out.println("Reversed (Manual): " + reverse(s));
        System.out.println("Reversed (API):    " + reverse2(s));
    }

    /**
     * Reverses a string using a for-loop.
     */
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();

        // Traverse backwards
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    /**
     * Reverses a string using the existing StringBuilder API.
     * This is the preferred way in production code.
     */
    public static String reverse2(String str) {
        // Construct -> Reverse -> Convert back to String
        return new StringBuilder(str).reverse().toString();
    }
}