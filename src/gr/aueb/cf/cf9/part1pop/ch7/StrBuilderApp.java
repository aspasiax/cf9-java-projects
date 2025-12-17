package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Demonstrates the performance difference between String Concatenation (+)
 * and StringBuilder.
 * StringBuilder is exponentially faster for large loops because
 * it modifies the existing object (Mutable), whereas String concatenation
 * creates a new object in every iteration (Immutable).
 */
public class StrBuilderApp {

    public static void main(String[] args) {
        // Using String
        String concatStr = "";    // Immutable
        long timeStart = 0L;
        long timeEnd = 0L;
        double elapsedTime = 0.0;

        System.out.println("Starting String concatenation test:");
        timeStart = System.currentTimeMillis();

        // Complexity: O(N^2) - Copies the growing string in every iteration
        for (int i = 0; i < 50_000; i++) { // Reduced to 50k to save you waiting time if PC is slow!
            concatStr = concatStr + i;
        }

        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;

        System.out.println("String Result:       " + elapsedTime + " seconds");

        // Using StringBuilder
        StringBuilder sb = new StringBuilder();    // Mutable

        timeStart = System.currentTimeMillis();

        // Complexity: O(N) - Appends to the buffer
        for (int i = 0; i < 50_000; i++) {
            sb.append(i);
        }

        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;

        System.out.println("StringBuilder Result: " + elapsedTime + " seconds");
    }
}