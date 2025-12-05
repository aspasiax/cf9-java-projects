package gr.aueb.cf.cf9.part1pop.ch2;

/**
 * Demonstrates type casting in Java.
 * Specifically, it shows how a long value can be cast to an int.
 */

public class TypeCastApp {

    public static void main(String[] args) {
        long myLong = (long) 2_147_483_647;
        int myInt = (int) myLong;

        System.out.println(myLong);
        System.out.println("My long is: " + myLong);
        System.out.printf("My long is: %d", myLong);
        System.out.println("My int is: " + myInt);
    }
}