package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Calculates the length of a String safely.
 * Null Safety.
 * We check if the string is null before calling .length() to avoid NullPointerException.
 */
public class CharCountApp {

    public static void main(String[] args) {
        String s1 = "Coding Factory";
        String s2 = "";
        String s3 = null;

        System.out.println("Length of \"Coding Factory\": " + countChars(s1)); // 14
        System.out.println("Length of \"\" (empty):       " + countChars(s2)); // 0
        System.out.println("Length of null:             " + countChars(s3));   // 0 (Safe)
    }

    /**
     * Returns the length of the string.
     * If the string is null, it returns 0 instead of throwing an exception.
     *
     * @param str the input string
     * @return the number of characters or 0 if null
     */
    public static int countChars(String str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }
}