package gr.aueb.cf.cf9.part2oop.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates Zero-Length Assertions (Lookaheads).
 * Password Validation.
 * 1. At least 8 characters long (. {8,})
 * 2. At least one lowercase letter (?=.*?[a-z])
 */
public class LowerCaseAssert {

    public static void main(String[] args) {
        // Test cases
        String[] passwords = {
                "aaaf",             // Invalid: Too short (< 8 chars)
                "XAGDGGDGDGDGGDa",  // Valid: > 8 chars AND has lowercase 'a'
                "XAGDGGDGDGDGGD"    // Invalid: > 8 chars but NO lowercase
        };

        // Breakdown of the Regex:
        // (?=.*?[a-z]) : Positive Lookahead. Checks if a lowercase letter exists ahead.
        // ^            : Start of line
        // .{8,}        : Any character, at least 8 times
        // $            : End of line
        Pattern pattern = Pattern.compile("(?=.*?[a-z])^.{8,}$");

        System.out.println("Password Validation: ");

        for (String password : passwords) {
            Matcher matcher = pattern.matcher(password);

            if (matcher.find()) {
                System.out.println("VALID: " + matcher.group());
            } else {
                System.out.println("INVALID: " + password);
            }
        }
    }
}