package gr.aueb.cf.cf9.part2oop.ch17.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Use ArrayList to ensure mutability (List.of creates an immutable list)
        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 100),
                new Product("Oranges", 8.1, 50),
                new Product("Milk", 2.8, 4),
                new Product("Apples", 22.5, 120) // Same name, different price/qty
        ));

        System.out.println("1. Natural Ordering (Alphabetical): ");
        products.sort(Comparator.naturalOrder());
        products.forEach(System.out::println);

        System.out.println("\n2. Reverse Natural Ordering: ");
        products.sort(Comparator.reverseOrder());
        products.forEach(System.out::println);

        System.out.println("\n3. Sort by Price (Ascending) - Method Reference: ");
        // Comparator.comparing uses Double.compare internally
        products.sort(Comparator.comparing(Product::getPrice));
        products.forEach(System.out::println);

        System.out.println("\n4. Sort by Quantity (Descending) - Lambda: ");
        // Best Practice: Use Integer.compare to avoid Overflow issues with subtraction (a - b)
        products.sort((p1, p2) -> Integer.compare(p2.getQuantity(), p1.getQuantity()));
        products.forEach(System.out::println);

        System.out.println("\n5. Complex Chaining (Qty -> Price -> Desc): ");
        // Sort by Quantity ASC
        // If Quantities are equal, compare by Price ASC
        // If Prices are equal, compare by Description ASC
        products.sort(Comparator.comparing(Product::getQuantity)
                .thenComparing(Product::getPrice)
                .thenComparing(Product::getDescription));

        products.forEach(System.out::println);
    }
}