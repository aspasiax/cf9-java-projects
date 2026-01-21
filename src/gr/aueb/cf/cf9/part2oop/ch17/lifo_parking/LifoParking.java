package gr.aueb.cf.cf9.part2oop.ch17.lifo_parking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Represents a Parking Garage operating on LIFO (Last-In-First-Out) logic.
 * This simulates a generic Stack data structure.
 * We use {@link Deque} as the interface and {@link LinkedList} as the implementation.
 */
public class LifoParking {

    // Deque (Double Ended Queue) is the modern replacement for the legacy 'Stack' class.
    private final Deque<String> parking = new LinkedList<>();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public LifoParking() {}

    /**
     * Adds a car to the garage (Pushes to the stack).
     * @param plateNumber the license plate of the car.
     */
    public void addCar(String plateNumber) {
        parking.push(plateNumber); // Equivalent to addFirst()
        System.out.printf("[%s] Entered: %s%n", LocalDateTime.now().format(formatter), plateNumber);
    }

    /**
     * Removes the last car that entered (Pops from the stack).
     * @return the plate number of the removed car, or null if empty.
     */
    public String removeCar() {
        if (parking.isEmpty()) {
            System.out.println("Parking is empty. No cars to remove.");
            return null;
        }

        String car = parking.pop(); // Equivalent to removeFirst()
        System.out.printf("[%s] Exited:  %s%n", LocalDateTime.now().format(formatter), car);
        return car;
    }

    /**
     * Returns an unmodifiable view of the current parking state.
     */
    public List<String> getParking() {
        return List.copyOf(parking);
    }

    public boolean isEmpty() {
        return parking.isEmpty();
    }

    public void traverse() {
        System.out.println("Parking Status: ");
        parking.forEach(System.out::println);
    }
}