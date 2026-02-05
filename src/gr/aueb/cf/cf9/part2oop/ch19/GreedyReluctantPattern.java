package gr.aueb.cf.cf9.part2oop.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates Greedy vs. Reluctant (Lazy) Pattern Matching.
 * Greedy (*): Consumes as much as possible.
 * Reluctant (*?): Consumes as little as possible.
 */
public class GreedyReluctantPattern {

    public static void main(String[] args) {
        String str = "login;alice;pass;12345;";

        // 1. GREEDY Match
        // ".*;" matches the longest possible string ending with ';'
        Pattern greedyPattern = Pattern.compile(".*;");
        Matcher greedyMatcher = greedyPattern.matcher(str);

        System.out.println("Greedy Match (.*;): ");
        while (greedyMatcher.find()) {
            System.out.println(greedyMatcher.group());
        }

        // 2. RELUCTANT (Lazy) Match
        // ".*?;" matches the shortest possible string ending with ';'
        // We add '?' after '*' to make it lazy.
        Pattern reluctantPattern = Pattern.compile(".*?;");
        Matcher reluctantMatcher = reluctantPattern.matcher(str);

        System.out.println("\nReluctant Match (.*?;): ");
        while (reluctantMatcher.find()) {
            System.out.println(reluctantMatcher.group());
        }
    }
}