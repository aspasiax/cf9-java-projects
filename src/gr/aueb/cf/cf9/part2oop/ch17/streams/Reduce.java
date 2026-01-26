package gr.aueb.cf.cf9.part2oop.ch17.streams;

import gr.aueb.cf.cf9.part2oop.ch17.sorting.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates the usage of the Stream API {@code reduce} operation
 * and complex pipeline chaining.
 */
public class Reduce {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 100),
                new Product("Oranges", 8.1, 50),
                new Product("Milk", 2.8, 4),
                new Product("Apples", 22.5, 120)
        ));

        // 1. Reduce on Integers
        // Classic Reduce: Initial value 0, operation (sum, num) -> sum + num
        int totalSum = numbers.stream()
                .reduce(0, (sum, num) -> sum + num);

        // Using Method Reference
        int totalSum2 = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Total Sum (Lambda): " + totalSum);
        System.out.println("Total Sum (Method Ref): " + totalSum2);

        // 2. Reduce on Objects (Product -> int)

        // General reduce (Boxing overhead)
        int sumOfQuantities = products.stream()
                .map(Product::getQuantity) // Stream<Integer>
                .reduce(0, Integer::sum);

        // Optimized Primitive Stream
        // mapToInt returns an IntStream, which has a specialized .sum() method.
        int sumOfQuantities2 = products.stream()
                .mapToInt(Product::getQuantity)
                .sum();

        System.out.println("Total Quantity (Reduce): " + sumOfQuantities);
        System.out.println("Total Quantity (IntStream Sum): " + sumOfQuantities2);

        // 3. Complex Pipeline Example
        // Get Uppercase Descriptions of products with Qty >= 100, Sorted by Description

        System.out.println("\nComplex Pipeline Results: ");

        List<String> highQtyProductNames = products.stream()
                .filter(p -> p.getQuantity() >= 100)            // 1. Filter
                .sorted(Comparator.comparing(Product::getDescription))  // 2. Sort
                .map(Product::getDescription)                           // 3. Map to String
                .map(String::toUpperCase)                               // 4. Transform String
                .collect(Collectors.toList());                          // 5. Collect

        // Printing results using Method Reference
        highQtyProductNames.forEach(System.out::println);
    }
}