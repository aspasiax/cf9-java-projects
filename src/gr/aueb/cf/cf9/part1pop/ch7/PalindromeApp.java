package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Checks if a String is a Palindrome (reads the same forwards and backwards).
 * e.g. "MADAM"
 */
public class PalindromeApp {

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "coding";

        System.out.println("Method 1: ");
        System.out.println("Is 'madam' palindrome? " + isPalindrome(s1));
        System.out.println("Is 'coding' palindrome? " + isPalindrome(s2));

        System.out.println("Method 2: ");
        System.out.println("Is 'madam' palindrome? " + isPalindrome2(s1));
        System.out.println("Is 'coding' palindrome? " + isPalindrome2(s2));
    }

    /**
     * Method 1: Two-Pointers Technique (Best Performance).
     */
    public static boolean isPalindrome(String str) {
        int n = str.length();

        // i goes forward, j goes backward
        // Loop runs until pointers meet in the middle
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method 2: Using StringBuilder (Cleanest Code).
     */
    public static boolean isPalindrome2(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}