package gr.aueb.cf.cf9.part2oop.ch17.enums.user_app;

/**
 * Represents the Role of a User in the system.
 * This is a "Rich Enum" containing fields and methods.
 * We avoid relying on {@code ordinal()} for logic.
 */
public enum UserRole {
    ADMIN("Administrator"),   // Calls the Constructor
    TEACHER("Teacher"),
    STUDENT("Student");

    // Enums can have final fields
    private final String description;

    // Constructor must be private (or package-private by default).
    // You cannot say 'new UserRole()'. JVM creates these instances.
    UserRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}