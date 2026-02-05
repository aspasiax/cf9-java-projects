package gr.aueb.cf.cf9.part2oop.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates Non-Capturing Groups using the syntax (?:...)
 * Useful when we want to group parts of a regex (e.g., for repetition or OR logic)
 * but we do not want to store the result in a numbered group.
 */
public class NonCapturing {

    public static void main(String[] args) {
        String s = "HelloWorld HelloWorld";

        // (Hello)   -> Capturing Group 1
        // (?:World) -> Non-Capturing Group (Matches "World" but discards it from index)
        Pattern pattern = Pattern.compile("(Hello)(?:World)");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            // This will print "1" because (?:World) is ignored in counting
            System.out.println("Groups found: " + matcher.groupCount());

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.print("Group " + i + ": " + matcher.group(i) + " ");
            }
            System.out.println();
        }
    }
}