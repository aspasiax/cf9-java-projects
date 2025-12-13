package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates the Logical XOR (Exclusive OR) operation.
 * XOR Logic:
 * True if inputs are different (True/False or False/True).
 * False if inputs are the same (True/True or False/False).
 */
public class XorApp {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("XOR Truth Table:");
        System.out.println("T ^ T = " + xor(true, true));   // Expected: false
        System.out.println("T ^ F = " + xor(true, false));  // Expected: true
        System.out.println("F ^ T = " + xor(false, true));  // Expected: true
        System.out.println("F ^ F = " + xor(false, false)); // Expected: false
    }

    /**
     * Calculates the result of Exclusive OR (XOR) between two booleans.
     *
     * @param b1 the first boolean
     * @param b2 the second boolean
     * @return true if exactly one operand is true; otherwise false
     */
    public static boolean xor(boolean b1, boolean b2) {
        // Long way (Conceptual definition):
        // return (b1 && !b2) || (!b1 && b2);

        // Short way (Java Operator):
        return b1 ^ b2;
    }
}
