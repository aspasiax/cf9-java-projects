package gr.aueb.cf.cf9.part1pop.ch3;

import java.util.Scanner;

/**
 * Monitors the fuel level of two tanks and activates warning signals.
 * The application takes two boolean inputs indicating if a tank is low (< 1/4).
 * Orange Signal: Activates if exactly one tank is low (Exclusive OR - XOR).
 * Red Signal: Activates if both tanks are low (AND).
 */

public class TankApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please enter the status of the two tanks.");
        System.out.println("Enter 'true' if the tank level is < 1/4, otherwise 'false'.");

        System.out.println("Is Tank 1 low?");
        isEmptyTank1 = scanner.nextBoolean();

        System.out.println("Is Tank 2 low?");
        isEmptyTank2 = scanner.nextBoolean();

        // XOR (^): Returns true ONLY if the operands are different.
        // (One is true, the other is false).
        isOrange = isEmptyTank1 ^ isEmptyTank2;

        // AND (&&): Returns true ONLY if both operands are true.
        isRed = isEmptyTank1 && isEmptyTank2;

        System.out.println("Orange Signal: " + isOrange + ", Red Signal: " + isRed);
    }
}
