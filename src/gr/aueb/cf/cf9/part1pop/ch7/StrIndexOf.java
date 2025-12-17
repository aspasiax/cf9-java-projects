package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Demonstrates searching inside Strings using indexOf() and lastIndexOf().
 */
public class StrIndexOf {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        // 1. Simple indexOf
        // Searches for "o" starting from the beginning (index 0)
        int positionOfo = cf.indexOf("o");    // Found at index 1
        System.out.println("First 'o': " + positionOfo);

        // 2. indexOf with fromIndex
        // Searches for "o" starting from index 2.
        // It skips the first "o" (at index 1) and finds the next one.
        int positionOfNexto = cf.indexOf("o", 2);   // Found at index 11 (in "Factory")
        System.out.println("Next 'o' (after index 2): " + positionOfNexto);

        // 3. lastIndexOf
        // Searches backwards from the end.
        int positionOfLast = cf.lastIndexOf("o");  // Found at index 11
        System.out.println("Last 'o': " + positionOfLast);

        // Testing File Extension Method
        String file1 = "coding.txt";

        System.out.println("\nExtension of " + file1 + ": " + getExtension(file1));
    }

    /**
     * Extracts the extension from a filename.
     * e.g., "coding.txt" -> "txt"
     * @param fileName the name of the file
     * @return the extension or an empty string if no extension is found
     */
    public static String getExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf(".");

        // Case: No dot found (e.g., "Makefile")
        if (dotIndex == -1) {
            return "";
        }

        // Returns the substring starting AFTER the dot
        return fileName.substring(dotIndex + 1);
    }
}