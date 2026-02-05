package gr.aueb.cf.cf9.part2oop.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates a Strong Password Validation using Regex.
 * Requirements:
 * 1. At least 12 characters long.
 * 2. At least one lowercase letter.
 * 3. At least one uppercase letter.
 * 4. At least one digit.
 * 5. At least one special character (!@#$%^&*).
 */
public class StrongPassword {

    public static void main(String[] args) {
        // Test cases
        String[] passwords = {
                "mypass",                   // Invalid: Too short, missing types
                "MyPassword123",            // Invalid: Missing special char
                "C0d1ngF@ct0ry"             // Valid: Meets all criteria
        };

        // Regex Explanation:
        // (?=.*?[a-z])       : Lookahead for at least one Lowercase
        // (?=.*?[A-Z])       : Lookahead for at least one Uppercase
        // (?=.*?[0-9])       : Lookahead for at least one Digit
        // (?=.*?[!@#$%^&*])  : Lookahead for at least one Special Char
        // ^.{12,}$           : Start anchor, match any char 12+ times, End anchor
        String regex = "(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&*])^.{12,}$";

        Pattern pattern = Pattern.compile(regex);

        System.out.println("Strong Password Check: ");

        for (String password : passwords) {
            Matcher matcher = pattern.matcher(password);

            if (matcher.find()) {
                System.out.println("VALID: " + password);
            } else {
                System.out.println("INVALID: " + password);
            }
        }
    }
}