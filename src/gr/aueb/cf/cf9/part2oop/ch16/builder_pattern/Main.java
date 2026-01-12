package gr.aueb.cf.cf9.part2oop.ch16.builder_pattern;

public class Main {

    public static void main(String[] args) {
        // Case 1: Only required fields
        Book book1 = new Book.Builder(1, "123-456").build();

        // Case 2: Required + All optional fields
        Book book2 = new Book.Builder(2, "987-654")
                .author("Joshua Bloch")
                .title("Effective Java")
                .build();

        // Case 3: Required + Some optional fields (Partial state)
        Book book3 = new Book.Builder(3, "ADF-112")
                .title("Clean Code")
                .build();

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}