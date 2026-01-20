package gr.aueb.cf.cf9.part2oop.ch17.generic;

public class GenericMain {

    public static void main(String[] args) {

        // 1. The Old Way (Java 5+)
        // Explicitly stating the type on both sides. Verbose but clear.
        GenericNode<String> strNode = new GenericNode<String>();
        strNode.setValue("Hello Coding Factory");

        // 2. The Diamond Operator (Java 7+)
        // Empty <> on the right side. The compiler infers <Double> from the left side.
        GenericNode<Double> doubleNode = new GenericNode<>();
        doubleNode.setValue(10.5);

        // 3. Local Variable Type Inference 'var' (Java 10+)
        // The compiler infers the type from the right side.
        // MUST specify <Integer> on the right, otherwise it defaults to <Object>.
        var intNode = new GenericNode<Integer>();
        intNode.setValue(100);

        // Primitives Restriction
        // Generics ONLY work with Reference Types (Classes).
        // GenericNode<int> intNodePrimitive = new GenericNode<>(); // COMPILE ERROR!
        //  Generics perform "Type Erasure" to Object, and 'int' is not an Object.

        // Printing results
        System.out.println("String Node: " + strNode.getValue());
        System.out.println("Double Node: " + doubleNode.getValue());
        System.out.println("Integer Node: " + intNode.getValue());
    }
}