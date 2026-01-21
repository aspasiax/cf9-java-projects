package gr.aueb.cf.cf9.part2oop.ch17.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Declaration: We use the Interface 'Set' on the left (Polymorphism)
        // Implementation: HashSet (Uses a Hash Table internally)
        Set<String> bag = new HashSet<>();

        // 1. Add elements
        bag.add("Apple");
        bag.add("Banana");
        bag.add("Orange");

        // 2. Duplicate handling
        // Sets do NOT allow duplicates.
        // The add() method returns 'false' if the element already exists.
        boolean isAdded = bag.add("Apple");
        System.out.println("Was 'Apple' added again? " + isAdded); // Prints: false

        // 3. Performance: Contains / Remove
        // Time Complexity: O(1) - Constant Time.
        // It uses the hashCode() of the key to find the location instantly,
        // without scanning the whole collection (unlike Lists which are O(N)).
        if (bag.contains("Apple")) {
            bag.remove("Apple");
            System.out.println("Successfully removed Apple.");
        } else {
            System.out.println("Apple not found in the bag.");
        }

        // 4. Functional Removal (Java 8+)
        // Removes all elements that satisfy the given predicate (start with 'B')
        bag.removeIf(item -> item.startsWith("B"));

        // 5. Traversal
        // HashSet does NOT guarantee insertion order.
        // The order depends on the HashCode of the elements.
        System.out.println("\nBag Contents: ");
        bag.forEach(System.out::println);
    }
}