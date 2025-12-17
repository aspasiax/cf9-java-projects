package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Demonstrates miscellaneous String operations:
 * Conversion to char array (for-each traversal)
 * Unicode characters
 * Replacement
 * Concatenation (+ operator vs concat method)
 */
public class StrEtc {

    public static void main(String[] args) {
        String s = "Coding Factory";

        // 1. Traverse using toCharArray()
        // Creates a copy of the underlying array (Heap allocation).
        // Good for readability, slightly heavier on memory than charAt().
        for (char ch : s.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // 2. UTF-8 Characters
        // Java uses Unicode (UTF-16) internally.
        System.out.println("Unicode Heart: \u2764");

        // 3. Replace
        // Remember: Strings are immutable. replace() returns a NEW String.
        String firstname = "Maria-Eleni";
        String simpleName = firstname.replace("-", " ");

        System.out.println("Original: " + firstname);
        System.out.println("Replaced: " + simpleName);

        // 4. Concat
        String lastname = "Smith";

        // Option A: Using + operator (Readable, recommended)
        String fullName1 = firstname + " " + lastname;

        // Option B: Using concat() method (Method chaining)
        // concat() throws NullPointerException if the argument is null.
        String fullName2 = firstname.concat(" ").concat(lastname);

        System.out.println("Concat (+):      " + fullName1);
        System.out.println("Concat (method): " + fullName2);
    }
}