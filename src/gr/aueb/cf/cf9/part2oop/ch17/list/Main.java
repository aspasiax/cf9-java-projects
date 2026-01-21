package gr.aueb.cf.cf9.part2oop.ch17.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Demonstrates the usage of {@link ArrayList}.
 * Key concepts:
 * 1. Random Access is fast (O(1)).
 * 2. Modifications (Insert/Delete) in the middle are slower (O(N)).
 * 3. Iterators allow safe removal during traversal.
 */
public class Main {

    public static void main(String[] args) {
        // 1. Declaration (Polymorphism: Reference is List, Implementation is ArrayList)
        List<String> cities = new ArrayList<>();

        // 2. Add (Append is usually O(1), unless resizing occurs)
        cities.add("Athens");
        cities.add("Berlin");
        cities.add("Paris");

        // 3. Get (O(1) - Constant Time)
        System.out.println("First City: " + cities.get(0));

        // 4. Update (Set)
        // indexOf uses equals() -> O(N)
        int position = cities.indexOf("Paris");
        if (position != -1) {
            cities.set(position, "Tokyo"); // O(1) replacement
            System.out.println("Replaced Paris with Tokyo.");
        }

        // 5. Remove (O(N) - Linear Time due to shifting)
        // remove(Object) uses equals() to find the element first
        if (cities.contains("Tokyo")) {
            cities.remove("Tokyo");
            System.out.println("Removed Tokyo.");
        } else {
            System.out.println("City not found");
        }

        // Traversals

        System.out.println("\n1. Classic For Loop (Index based): ");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        System.out.println("\n2. Enhanced For Loop (Readable): ");
        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println("\n3. Iterator (Safe Removal): ");
        // Add Tokyo back to demonstrate removal via Iterator
        cities.add("Tokyo");

        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            String city = it.next();
            if (city.equals("Tokyo")) {
                // cities.remove("Tokyo"); // Throws ConcurrentModificationException
                it.remove();               // Safely removes current element
                System.out.println("Tokyo removed via Iterator");
            } else {
                System.out.println(city);
            }
        }

        // --- 4. Java 8+ Lambda Removal
        // Equivalent to the Iterator loop above
        cities.removeIf(c -> c.equals("Berlin"));
        System.out.println("\nFinal List after removeIf('Berlin'): " + cities);
    }
}