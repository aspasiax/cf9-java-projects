package gr.aueb.cf.cf9.part2oop.ch17.streams;

import gr.aueb.cf.cf9.part2oop.ch17.sorting.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the usage of {@link java.util.Optional} combined with Streams.
 * {@code findFirst()} and {@code findAny()} return an Optional container
 * to handle the case where the stream might be empty (e.g., no product matches the filter).
 */
public class Optional {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 100),
                new Product("Oranges", 8.1, 50),
                new Product("Milk", 2.8, 4),
                new Product("Apples", 22.5, 120)
        ));

        // 1. findFirst() returns Optional
        java.util.Optional<Product> opt = products.stream()
                .filter(p -> p.getPrice() >= 20)
                .findFirst();

        // 2. Safe Unwrapping (The Handling)

        // A. If Present, do something
        opt.ifPresent(p -> System.out.println("Found: " + p));

        // B. orElse (EAGER) - Avoid for object creation
        // This creates "Default Product" in memory even if a product was found.
        Product p1 = opt.orElse(new Product("Default Product", 0.0, 0));

        // C. orElseGet (LAZY) - Best Practice for defaults
        // The Supplier () -> new ... is executed only if the Optional is empty.
        Product p2 = opt.orElseGet(() -> new Product("Default Lazy Product", 0.0, 0));

        System.out.println("Retrieved: " + p2);

        // D. orElseThrow - Best Practice for validations
        // Throws exception if empty.
        // We catch it here just to prevent the program from crashing in this demo.
        try {
            Product p3 = products.stream()
                    .filter(p -> p.getPrice() >= 100) // Nothing matches
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Product not found"));
        } catch (RuntimeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}