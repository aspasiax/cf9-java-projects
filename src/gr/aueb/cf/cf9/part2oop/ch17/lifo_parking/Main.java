package gr.aueb.cf.cf9.part2oop.ch17.lifo_parking;

public class Main {

    public static void main(String[] args) {
        LifoParking parking = new LifoParking();

        // 1. Simulation: Cars arriving (Push)
        System.out.println("Arrivals: ");
        parking.addCar("IAE-3989"); // Bottom of the stack
        parking.addCar("BMW-1234");
        parking.addCar("VWI-9876"); // Top of the stack

        // 2. Simulation: Cars leaving (Pop)
        System.out.println("\nDepartures: ");

        // The last one (VWI) leaves first
        parking.removeCar();

        // The second one (BMW) leaves next
        parking.removeCar();

        // 3. Check remaining
        System.out.println("\nRemaining Cars: ");
        parking.traverse();
    }
}