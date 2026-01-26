package gr.aueb.cf.cf9.part2oop.ch17.streams;

import gr.aueb.cf.cf9.part2oop.ch17.sorting.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates the usage of the Stream API {@code map} operation.
 * Key concept:
 * {@code map} is an Intermediate Operation that transforms elements.
 * It applies a Function<T, R> to each element of the stream.
 */
public class Map {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 10.50, 100),
                new Product("Oranges", 8.50, 50),
                new Product("Milk", 2.50, 4),
                new Product("Apples", 20.50, 120)
        ));

        // 1. Simple Transformation (Integer -> Integer)
        System.out.println("Squares: ");
        List<Integer> squares = numbers.stream()
                .map(num -> num * num)
                .toList();

        squares.forEach(System.out::println);

        // 2. Object Transformation (Product -> String)
        System.out.println("\nProduct Names (List): ");
        // We extract only the 'description' field from the Product objects
        List<String> productNames = products.stream()
                .map(Product::getDescription)
                .toList();

        productNames.forEach(System.out::println);

        // 3. Collecting to String (Joining)
        System.out.println("\nProduct Names (Joined String): ");
        // Useful for creating CSV-like strings or UI display texts
        String joinedNames = products.stream()
                .map(Product::getDescription)
                .collect(Collectors.joining(", "));

        System.out.println(joinedNames);

        // Mapping to Primitives (Product -> double)
        // Calculate total value of warehouse (Price * Quantity)
        System.out.println("\nTotal Warehouse Value: ");
        double totalValue = products.stream()
                .mapToDouble(p -> p.getPrice() * p.getQuantity()) // Returns DoubleStream
                .sum(); // Efficient summation without boxing

        System.out.printf("Total Value: %.2f€%n", totalValue);
    }
}