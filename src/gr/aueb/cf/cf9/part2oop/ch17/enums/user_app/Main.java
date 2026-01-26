package gr.aueb.cf.cf9.part2oop.ch17.enums.user_app;

public class Main {

    public static void main(String[] args) {
        // 1. Assignment
        UserRole role = UserRole.ADMIN;

        // 2. Retrieval of Name and Ordinal
        // name(): returns the exact constant name as String ("ADMIN")
        // ordinal(): returns the position (0). Avoid using this for business logic!
        System.out.println("Current Role: " + role.name());
        System.out.println("Ordinal: " + role.ordinal());

        // 3. Using the custom field (Getter)
        System.out.println("Description: " + role.getDescription());

        // 4. String -> Enum Conversion (valueOf)
        // Ideally used when reading from DB or API (String) and converting to logic (Enum).
        String inputRole = "TEACHER";
        try {
            UserRole teacherRole = UserRole.valueOf(inputRole);
            System.out.println("\nConverted String 'TEACHER' to Enum: " + teacherRole);
        } catch (IllegalArgumentException e) {
            System.out.println("Role not found!");
        }

        // 5. Traversal (values())
        System.out.println("\nAll Available Roles: ");
        for (UserRole r : UserRole.values()) {
            System.out.printf("Role: %-10s | Desc: %s%n", r.name(), r.getDescription());
        }
    }
}