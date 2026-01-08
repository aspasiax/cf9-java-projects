package gr.aueb.cf.cf9.part2oop.ch15.marker;

public class Main {

    public static void main(String[] args) {
        Item book = new Book(1, "Book A");
        Item cd = new CompactDisk(2, "Compact Disk A");
        Product product = new Product();

        deliver(book);
        deliver(cd);
//        deliver(product);     // compile-time safety
    }

    /**
     * Accepts only objects marked as {@link Item}.
     * Uses reflection-style checks (instanceof) to determine specific behavior.
     */
    public static void deliver(Item item) {
        if (item instanceof Book) {
            System.out.println("Booking delivery for Book: " + item);
        } else if (item instanceof CompactDisk) {
            System.out.println("Booking delivery for CD: " + item);
        } else {
            System.out.println("Unknown Item type.");
        }
    }
}
