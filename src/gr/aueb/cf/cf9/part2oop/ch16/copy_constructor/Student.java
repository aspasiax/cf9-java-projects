package gr.aueb.cf.cf9.part2oop.ch16.copy_constructor;

/**
 * Represents an Immutable Student.
 * To ensure immutability when dealing with mutable fields like {@link City},
 * we must perform Deep Copies in constructors and getters.
 */
public final class Student {
    private final String name;
    private final City city;

    public Student() {
        this.name = "";
        this.city = new City(""); // Initialize to avoid null
    }

    /**
     * Copy Constructor (Deep Copy).
     * We create a new city object based on the source student's city.
     * If we did 'this.city = student.city', it would be a Shallow Copy.
     */
    public Student(Student student) {
        this.name = student.name;
        // Deep Copy: Create a new object with the same content
        this.city = new City(student.city);
    }

    /**
     * Constructor (Deep Copy).
     * @param name student's name
     * @param city student's city
     */
    public Student(String name, City city) {
        this.name = name;
        // Defensive Copy: We protect our internal state from the outside world
        this.city = new City(city);
    }

    public String getName() {
        return name;
    }

    /**
     * Returns a copy of the city to preserve immutability.
     * If we returned 'this.city', the caller could modify it.
     */
    public City getCity() {
        return new City(this.city);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', city=" + city + '}';
    }
}