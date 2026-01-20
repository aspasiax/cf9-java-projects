package gr.aueb.cf.cf9.part2oop.ch17.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    public static void main(String[] args) {
        // 1. Generic Method
        String[] strings = {"Athens", "Berlin", "Paris"};
        Integer[] integers = {1, 2, 3};

        System.out.println("Generic Array Print");
        printArray(strings);
        printArray(integers);

        // 2. Wildcards Demo
        GenericNode<Double> doubleNode = new GenericNode<>(10.5);
        GenericNode<Integer> intNode = new GenericNode<>(5);
        GenericNode<Object> objectNode = new GenericNode<>("Sting");

        System.out.println("\n ? extends Number (Upper Bound)");
        printNumbers(doubleNode); // OK: Double extends Number
        printNumbers(intNode);    // OK: Integer extends Number
        // printNumbers(objectNode); // ERROR: Object does NOT extend Number

        System.out.println("\n? super Integer (Lower Bound)");
        printNumbers2(intNode);       // OK: Integer is Integer
        // printNumbers2(doubleNode); // ERROR: Double is NOT super of Integer
        GenericNode<Number> numNode = new GenericNode<>(99);
        printNumbers2(numNode);       // OK: Number is super of Integer

        // 3. PECS Demo (produceConsume)
        List<Integer> src = Arrays.asList(10, 20, 30); // Producer (extends Integer)
        List<Number> dest = new ArrayList<>();         // Consumer (super Integer)

        produceConsume(dest, src);

        System.out.println("\nPECS Result:");
        System.out.println("Destination List: " + dest);
    }

    // Generic Method
    public static <T> void printArray(T[] array){
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Upper Bound: Accepts Number, Integer, Double, etc.
    // Read-only logic mainly.
    public static void printNumbers(GenericNode<? extends Number> node) {
        System.out.println("Number value: " + node.getValue());
    }

    // Lower Bound: Accepts Integer, Number, Object.
    // Write-logic mainly.
    public static void printNumbers2(GenericNode<? super Integer> node) {
        System.out.println("Super Integer value: " + node.getValue());
    }

    // PECS Principle Implementation
    // src: Producer (we read T from it) -> extends
    // list: Consumer (we write T into it) -> super
    private static <T> void produceConsume(List<? super T> list, Iterable<? extends T> src) {
        for (T item : src) {
            list.add(item);
        }
    }
}