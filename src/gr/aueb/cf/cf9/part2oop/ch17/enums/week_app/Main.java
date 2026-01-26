package gr.aueb.cf.cf9.part2oop.ch17.enums.week_app;

public class Main {

    public static void main(String[] args) {
        // Iterating through all Enum constants
        for (WeekDay weekDay : WeekDay.values()) {
            // weekDay.name() -> "SUNDAY"
            // weekDay.getGreekName() -> "Κυριακή"
            System.out.println(weekDay.name() + ": " + weekDay.getGreekName());
        }
    }
}