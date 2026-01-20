package gr.aueb.cf.cf9.part2oop.ch16.equals_hashCode;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(1, 5);

        System.out.println("p1 equals p2? " + p1.equals(p2)); // True
        System.out.println("p1 equals p3? " + p1.equals(p3)); // False

        System.out.println("p1 HashCode: " + p1.hashCode());
        System.out.println("p2 HashCode: " + p2.hashCode());
        System.out.println("p3 HashCode: " + p3.hashCode());

        boolean contractHold = (p1.equals(p2) && p1.hashCode() == p2.hashCode());
        System.out.println("\nContract Validated: " + contractHold);
    }
}