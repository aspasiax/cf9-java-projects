package gr.aueb.cf.cf9.part1pop.ch5;

/**
 * Demonstrates mixed-type arithmetic expressions and automatic type promotion.
 * In Java, when different primitive data types are used in the same arithmetic expression,
 * the smaller types are automatically converted (widened) to the largest type present
 * to prevent data loss.
 * Hierarchy: int to long to float to double.
 */

public class FloatingExpressionsApp {

    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 10.5f;
        double doubleNum = 10.56789;

        double result = 0.0;

        // Expression Analysis:
        // 1. intNum is promoted to float to be added to floatNum.
        // 2. The intermediate result (float) is promoted to double to be added to doubleNum.
        // 3. The final result is of type double.
        result = intNum + floatNum + doubleNum;

        System.out.println("Result (println): " + result);
        System.out.printf("Result (printf): %.2f%n", result);
    }
}