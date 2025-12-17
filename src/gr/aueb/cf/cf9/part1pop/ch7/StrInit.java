package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Demonstrates String declaration and initialization.
 * String Literal (""): Stored in the "String Constant Pool". Memory efficient.
 * new String(): Forces a new object in the Heap. Less efficient.
 * null vs empty: "null" means no object exists. "" is an object with length 0.
 */
public class StrInit {

    public static void main(String[] args) {

        // 1. String Literal
        // Java checks the Pool. If "Athens" exists, it returns the reference.
        // If not, it creates it in the Pool.
        String s1 = "Athens";

        // 2. New Keyword
        // Creates a brand-new object in the Heap, even if "Athens" exists in the Pool.
        String s2 = new String("Athens");

        // 3. Empty String
        // This is an object, but it holds 0 characters.
        String s3 = "";

        // 4. Null String
        // This is NOT an object. It points to nothing.
        String s4 = null;

        System.out.println("s1: " + s1);
        System.out.println("s1 length: " + s1.length());

        // s3.isEmpty() is equivalent to s3.length() == 0
        System.out.println("Is s3 empty? " + s3.isEmpty());
    }
}
