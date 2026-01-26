package gr.aueb.cf.cf9.part2oop.ch17.streams;

import java.util.List;

/**
 * Demonstrates the usage of Stream API Matching operations.
 * Key concept: Short-circuiting.
 * These terminal operations stop processing as soon as the result is determined,
 * avoiding unnecessary computations.
 */
public class Match {

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Costas");
        List<Integer> numbers = List.of(2, 4, 6, 8);

        // 1. allMatch
        // Checks if ALL elements satisfy the predicate.
        // Returns false immediately if one odd number is found (Short-circuit).
        boolean areAllEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);

        System.out.println("Are all numbers even? " + areAllEven); // true

        // 2. anyMatch
        // Checks if at least one element satisfies the predicate.
        // Returns true immediately once "Alice" is found.
        boolean isAlicePresent = names.stream()
                .anyMatch(name -> name.equals("Alice"));

        System.out.println("Is Alice in the list? " + isAlicePresent); // true

        // 3. allMatch (Fail case)
        // Will return false immediately because "Bob" != "Alice".
        boolean allAreAlice = names.stream()
                .allMatch(name -> name.equals("Alice"));

        System.out.println("Is everyone named Alice? " + allAreAlice); // false

        // 4. noneMatch
        // Checks if no elements satisfy the predicate.
        // Equivalent to: !anyMatch(...)
        boolean noneIsAlice = names.stream()
                .noneMatch(name -> name.equals("Alice"));

        System.out.println("Is Alice absent? " + noneIsAlice); // false
    }
}