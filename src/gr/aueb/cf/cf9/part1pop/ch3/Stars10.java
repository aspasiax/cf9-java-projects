package gr.aueb.cf.cf9.part1pop.ch3;

/**
 * A simple application that prints 10 horizontal stars twice:
 * 1. Using a while loop that counts upward.
 * 2. Using a while loop that counts downward.
 */

public class Stars10 {

    public static void main(String[] args) {
        int i = 1;
        int j = 10;

        while (i <= 10) {
            System.out.print("*");
            i++;
        }

        System.out.println();

        while (j >= 1) {
            System.out.print("*");
            j--;
        }
    }
}
