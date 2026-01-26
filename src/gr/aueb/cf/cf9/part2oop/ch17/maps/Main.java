package gr.aueb.cf.cf9.part2oop.ch17.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Demonstrates the usage of {@link Map} interface and {@link HashMap} implementation.
 * Key Concepts:
 * 1. Key-Value pairs storage.
 * 2. Keys must be unique (based on equals/hashCode).
 * 3. Fast retrieval O(1).
 */
public class Main {

    public static void main(String[] args) {
        // Declaration: Map<KeyType, ValueType>
        Map<String, String> countries = new HashMap<>();

        // 1. Insert (put)
        countries.put("GR", "Greece");
        countries.put("USA", "United States");
        countries.put("IT", "Italy");

        // 2. Update (Overwrite)
        // Since "GR" already exists, this replaces "Greece" with "Germany".
        // This is standard Map behavior.
        countries.put("GR", "Germany");

        // 3. Safer Insert (putIfAbsent) - Java 8+
        // Only inserts "France" if "FR" key is NOT present.
        countries.putIfAbsent("FR", "France");
        countries.putIfAbsent("GR", "Greece"); // Won't happen, "GR" is already "Germany"

        // 4. Get (Retrieval)
        // Returns the value or null if key is not found.
        String country = countries.get("GR");
        System.out.println("GR stands for: " + country); // Prints Germany

        // 5. Get with Default (Safer Retrieval)
        // If "CN" (China) is not found, return "Unknown" instead of null.
        String china = countries.getOrDefault("CN", "Unknown Country");
        System.out.println("CN stands for: " + china);

        // 6. Remove
        countries.remove("USA");

        // 7. Traversal (Iterating)

        System.out.println("\nTraversing Map: ");
        // Modern approach using BiConsumer (Key, Value)
        countries.forEach((key, value) -> System.out.println(key + ": " + value));

        // 8. Stream API on Maps
        // We cannot stream a Map directly. We must stream its entrySet().
        System.out.println("\nFiltering Keys <= 2 chars: ");

        var filteredEntries = countries.entrySet().stream()
                .filter(entry -> entry.getKey().length() <= 2)
                .collect(Collectors.toSet()); // Returns Set<Map.Entry<String, String>>

        filteredEntries.forEach(System.out::println);
    }
}