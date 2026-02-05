package gr.aueb.cf.cf9.part2oop.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates Regular Expression Capturing Groups.
 * This program parses a string containing dates in US format (MM/DD/YYYY),
 * extracts the components (Month, Day, Year) using groups,
 * and transforms them into European format (DD/MM/YYYY).
 */
public class DateMatcher {

    public static void main(String[] args) {
        // Input string with mixed text and dates
        String text = "06/12/2024; aaab 11/05/1999 xxx";

        // Create a Pattern with 3 capturing groups:
        // Group 1: Month (\d{2})
        // Group 2: Day   (\d{2})
        // Group 3: Year  (\d{4})
        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String originalDate = matcher.group(); // The full match (e.g., 06/12/2024)

            // Extracting specific groups
            String month = matcher.group(1);
            String day   = matcher.group(2);
            String year  = matcher.group(3);

            // Transforming to European format (DD/MM/YYYY)
            String euDate = String.format("%s/%s/%s", day, month, year);

            // Output results
            System.out.println("Found US Date: " + originalDate);
            System.out.println("Converted to EU Date: " + euDate);
            System.out.println();
        }
    }
}