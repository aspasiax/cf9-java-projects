package gr.aueb.cf.cf9.part2oop.ch17.streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Demonstrates the usage of the Stream API {@code filter} operation.
 * Key concepts:
 * 1. Declarative style (What, not How).
 * 2. Intermediate Operations (Lazy evaluation).
 * 3. Terminal Operations (Trigger execution).
 */
public class Filter {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Source -> Filter -> Terminal(Print)
        numbers.stream()
                .filter(num -> num % 2 == 0)   // Intermediate Op (Lazy)
                .forEach(System.out::println);        // Terminal Op (Eager)

        // 2. Collecting Results to Lists
        List<Integer> unmodifiableList = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();

        List<Integer> mutableList = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // 3. Collecting to Array
        // From List<Integer> to Integer[]
        // We must pass the array constructor, otherwise toArray() returns Object[]
        Integer[] integerArray = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toArray(Integer[]::new);

        // 4. Complex Collection (HashSet)
        List<String> cities = List.of("Athens", "Berlin", "Paris", "Tokyo", "Toronto");
        System.out.println("\nFilter Cities containing 'T' into a Set: ");
        Set<String> uniqueCitiesWithT = cities.stream()
                .filter(city -> city.contains("T"))
                .collect(Collectors.toCollection(HashSet::new)); // Specific implementation

        uniqueCitiesWithT.forEach(System.out::println);

        // 5. Primitive Streams (IntStream)
        // Specialized streams for primitives (int, long, double) for performance.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] filteredPrimitiveArr = Arrays.stream(arr) // Creates IntStream
                .filter(n -> n % 2 == 0)
                .toArray(); // Returns int[] directly

        System.out.println("\nPrimitive Array: " + Arrays.toString(filteredPrimitiveArr));
    }
}