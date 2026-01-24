package gr.aueb.cf.cf9.part2oop.ch17.sorting;

/**
 * Represents a Product entity.
 * Implements {@link Comparable} to define the Natural Ordering
 * of products based on their description (alphabetical).
 */
public class Product implements Comparable<Product> {
    private String description;
    private double price;
    private int quantity;

    public Product() {}

    public Product(String description, double price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    /**
     * Defines the Natural Ordering: Alphabetical by Description.
     */
    @Override
    public int compareTo(Product other) {
        return this.description.compareTo(other.description);
    }
}