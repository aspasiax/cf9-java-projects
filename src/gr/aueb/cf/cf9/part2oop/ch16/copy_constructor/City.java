package gr.aueb.cf.cf9.part2oop.ch16.copy_constructor;

public class City {
    private String description;

    public City() {}

    public City(String description) {
        this.description = description;
    }

    /**
     * Copy Constructor.
     * Creates a new City based on an existing one.
     * @param city the city to copy.
     */
    public City(City city) {
        this.description = city.description;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return description;
    }
}