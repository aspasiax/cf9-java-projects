package gr.aueb.cf.cf9.part2oop.ch17.enums.week_app;

/**
 * Represents the days of the week.
 * This Enum maps the English constant to its Greek string representation.
 * Fields are marked as {@code final} to ensure Immutability.
 */
public enum WeekDay {
    SUNDAY("Κυριακή"),
    MONDAY("Δευτέρα"),
    TUESDAY("Τρίτη"),
    WEDNESDAY("Τετάρτη"),
    THURSDAY("Πέμπτη"),
    FRIDAY("Παρασκευή"),
    SATURDAY("Σάββατο");

    // Field must be private and final to prevent modification after initialization.
    private final String greekName;

    // Constructor is implicitly private.
    WeekDay(String greekName) {
        this.greekName = greekName;
    }

    // Getter to access the field safely.
    public String getGreekName() {
        return greekName;
    }
}