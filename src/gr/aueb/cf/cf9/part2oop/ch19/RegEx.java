package gr.aueb.cf.cf9.part2oop.ch19;

public class RegEx {

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("Is Hello: " + isHello(s));

        String s2 = "RedCoding";
        System.out.println("Starts with Upper: " + startsWithUppercase(s2));

        String date = "25/12/2024";
        System.out.println("Is Date: " + isDate(date));

        String name = "John Doe";
        System.out.println("Reversed: " + reverse(name));
    }

    // --- Simple Literals ---
    public static boolean isHello(String s) {
        return s.matches("Hello");
    }

    public static boolean isHelloOrHi(String s) {
        return s.matches("Hello|Hi"); // | means OR
    }

    public static boolean isHhello(String s) {
        return s.matches("[Hh]ello"); // [Hh] means 'H' or 'h'
    }

    // Character Classes & Ranges

    /**
     * Checks if string starts with one Uppercase letter followed by "Coding".
     */
    public static boolean startsWithUppercase(String s) {
        return s.matches("[A-Z]Coding");
    }

    public static boolean startsWithUpperOrLowercase(String s) {
        return s.matches("[A-Za-z]Coding");
    }

    public static boolean startsWithLetter(String s) {
        // [a-zA-Z0-9_] is equivalent to \w (word character)
        return s.matches("[a-zA-Z0-9_]Coding");
        // return s.matches("\\wCoding"); // Shorter version
    }

    // Predefined Character Classes (Meta-characters)

    /**
     * Checks for ANY character (.) followed by a Digit (\d).
     */
    public static boolean anyCharAndDigit(String s) {
        return s.matches(".\\d");
    }

    /**
     * Checks for a LITERAL DOT (\.) followed by a Digit.
     * Note: Since '.' is a special char, we escape it as \\.
     */
    public static boolean dotAndDigit(String s) {
        return s.matches("\\.\\d");
    }

    // Quantifiers

    /**
     * Checks format: DD/MM/YYYY
     * \d{2} = exactly 2 digits
     */
    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    /**
     * Checks if string contains two words separated by whitespace.
     * . = any char
     * * = 0 or more times
     * \s+ = 1 or more spaces
     */
    public static boolean twoWords(String s) {
        // Matches anything, then space(s), then anything
        return s.matches(".+\\s+.+");
    }

    // Groups & Replacement

    /**
     * Swaps two words.
     * Input: "John Doe" -> Output: "Doe John"
     */
    public static String reverse(String s) {
        // (.+) -> Group 1 (First word)
        // \\s+ -> Separator (Space)
        // (.+) -> Group 2 (Second word)
        // $2 $1 -> Put Group 2 first, then space, then Group 1
        return s.replaceAll("(.+)\\s+(.+)", "$2 $1");
    }
}