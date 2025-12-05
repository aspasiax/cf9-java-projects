package gr.aueb.cf.cf9.part1pop.ch2;

/**
 * Basic arithmetic expressions with integers.
 */

public class ExpressionsApp {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
        int num3 = 153;

        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        int result5 = 0;
        int result6 = 0;

        int ones = 0;
        int tens = 0;
        int hundreds = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;  // Integer division always yields an integer
        // div = num1 / 0;  // Division by zero is prohibited in integers
        mod = num1 % num2;  // The remainder of the division

        System.out.printf("The result of adding %d and %d is: %d\n", num1, num2, sum);
        System.out.printf("The result of subtracting %d and %d is: %d\n", num1, num2, sub);
        System.out.printf("The result of multiplying %d and %d is: %d\n", num1, num2, mul);
        System.out.printf("The result of dividing %d and %d is: %d\n", num1, num2, div);
        System.out.printf("The remainder of dividing %d and %d is: %d\n", num1, num2, mod);

        result1 = result1 + 1; // Changes the value of result1 from 0 to 1
        result2 += 1;          // result2 = result2 + 1
        result3++;             // result3 = result3 + 1

        System.out.printf("Result1 = %d, Result2 = %d, Result3 = %d\n", result1, result2, result3);

        result4 = num1++;      // result4 -> 12, num1 -> 13
        result5 = ++num2;      // result5 -> 6, num2 -> 6

        System.out.printf("Result4 = %d, Result5 = %d\n", result4, result5);

        result6 = (num1 + num2) * (result1 / result2) + (result3 % result4);

        System.out.printf("Result6 = %d\n", result6);

        tens = num3 / 10;      // Get the tens
        hundreds = num3 / 100; // Get the hundreds
        ones = num3 % 10;      // Get the ones

        System.out.printf("The number %d has %d hundreds, %d tens, and %d ones", num3, hundreds, tens, ones);
    }
}

