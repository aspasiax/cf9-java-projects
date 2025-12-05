package gr.aueb.cf.cf9.part1pop.ch1;

/**
 * A simple class that demonstrates the different ways
 * to print data to the standard output (console).
 */

public class HelloWorld {

    public static void main(String[] args) {
        // Prints the text and adds a new line at the end.
        System.out.println("Hello World!");

        /*
         * Prints formatted text.
         * %s: placeholder for a String.
         * \n: inserts a new line character.
         */
        System.out.printf("Hello %s!\n", "World");

        // Prints the text without adding a new line at the end.
        // The cursor remains on the same line.
        System.out.print("Hello World!");
    }
}
