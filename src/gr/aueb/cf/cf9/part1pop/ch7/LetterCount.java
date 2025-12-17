package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Calculates the frequency (count) of a specific character within a String.
 */
public class LetterCount {

    public static void main(String[] args) {
        String s = "Coding Factory";
        char searchChar = 'o';
        char searchChar2 = 'z';

        int count = getLetterCount(s, searchChar);
        int count2 = getLetterCount(s, searchChar2);

        System.out.println("Count of 'o' in " + s + ": " + count);  // 1 (only lowercase 'o')
        System.out.println("Count of 'z' in " + s + ": " + count2); // 0
    }

    /**
     * Iterates through the string to count occurrences of a char.
     *
     * @param str    the input string
     * @param letter the character to search for
     * @return the frequency of the character
     */
    public static int getLetterCount(String str, char letter) {
        // Safety check
        if (str == null) return 0;

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}