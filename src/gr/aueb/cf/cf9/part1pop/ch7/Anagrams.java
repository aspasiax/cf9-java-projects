package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Checks if two strings are Anagrams (contain the same characters with the same frequency).
 * Example: "listen" <-> "silent".
 * We use an array of 256 integers to map ASCII character frequencies.
 */
public class Anagrams {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        String s3 = "hello";
        String s4 = "world";

        System.out.println("Are 'listen' and 'silent' anagrams? " + isAnagram(s1, s2));
        System.out.println("Are 'hello' and 'world' anagrams? " + isAnagram(s3, s4));
    }

    /**
     * Determines if two strings are anagrams.
     *
     * @param s1 the first string
     * @param s2 the second string
     * @return true if they are anagrams, false otherwise
     */
    public static boolean isAnagram(String s1, String s2) {
        // Optimization 1: If lengths differ, they cannot be anagrams.
        if (s1.length() != s2.length()) return false;

        // Frequency table for Extended ASCII (0-255).
        // Each index corresponds to a char's ASCII value.
        // The value at that index represents the count.
        int[] frequency = new int[256];

        // 1. Scan 1st string: Increment counts
        for (char c : s1.toCharArray()) {
            frequency[c]++;
        }

        // 2. Scan 2nd string: Decrement counts
        for (char c : s2.toCharArray()) {
            frequency[c]--;

            // Optimization 2: Early Exit
            // If count drops below zero, it means s2 has a character
            // that s1 doesn't have (or has fewer of).
            if (frequency[c] < 0) {
                return false;
            }
        }

        // Since lengths are equal and no count dropped below zero,
        // theoretically all counts MUST be zero now.
        // A final check for safety.
        for (int count : frequency) {
            if (count != 0) return false;
        }

        return true;
    }
}