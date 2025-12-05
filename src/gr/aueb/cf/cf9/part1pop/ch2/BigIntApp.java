package gr.aueb.cf.cf9.part1pop.ch2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Demonstrates basic arithmetic operations with BigInteger class.
 */

public class BigIntApp {

    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("12345678987654321");
        BigInteger bigNum2 = new BigInteger("98765432123456789");
        BigInteger bigSum;
        BigInteger bigSub;
        BigInteger bigMul;
        BigInteger bigDiv;
        BigInteger bigMod;


        // Arithmetic operators (+, -, *, /) are not applicable to BigInteger objects.
        bigSum = bigNum1.add(bigNum2);
        bigSub = bigNum1.subtract(bigNum2);  // negative result
        bigMul = bigNum1.multiply(bigNum2);
        bigDiv = bigNum1.divide(bigNum2);    // Result is 0 because bigNum1 < bigNum2
        bigMod = bigNum1.mod(bigNum2);       // result is bigNum1 because it is smaller than bigNum2

        System.out.printf("Sum: %,d\n", bigSum);
        System.out.printf("Sub: %,d\n", bigSub);
        System.out.printf("Mul: %,d\n", bigMul);
        System.out.printf("Div: %,d\n", bigDiv);
        System.out.printf("Mod: %,d\n", bigMod);
    }
}
