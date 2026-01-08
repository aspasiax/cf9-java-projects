package gr.aueb.cf.cf9.part2oop.ch15.skeletal_impl;

public class Main {

    public static void main(String[] args) {
        // Polymorphism: Using the Interface reference
        IRectangle square = new Square(5.0);

        System.out.println("Initial State: ");
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Is Square: " + square.isSquare());

        System.out.println("\nModifying Width only: ");
        // Cast needed because setWidth is not in IRectangle (it's in AbstractRectangle)
        ((AbstractRectangle) square).setWidth(10.0);

        System.out.println(square);
    }
}