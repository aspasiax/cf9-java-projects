package gr.aueb.cf.cf9.part2oop.ch16.builder_pattern;

/**
 * Represents a Book using the Builder Pattern.
 * The class is Immutable (all fields are final).
 * Instantiation is restricted to the inner static {@link Builder}.
 */
public class Book {
    // Required fields
    private final long id;
    private final String isbn;

    // Optional fields
    private final String title;
    private final String author;

    // Private Constructor: Forces usage of the Builder
    private Book(Builder builder) {
        this.id = builder.id;
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.author = builder.author;
    }

    public long getId() { return id; }
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    // --- Static Inner Builder Class ---

    public static class Builder {
        // Required parameters
        private final long id;
        private final String isbn;

        // Optional parameters
        private String title = "";
        private String author = "";

        /**
         * Constructor with required parameters.
         * This enforces that every book MUST have at least an ID and ISBN.
         */
        public Builder(long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }

        // Fluent Setter - returns the Builder object - chaining
        public Builder title(String title) {
            this.title = title;
            return this; // Returns the Builder itself to allow chaining
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        /**
         * Finalizes the construction and returns the immutable Book object.
         */
        public Book build() {
            return new Book(this);
        }
    }
}