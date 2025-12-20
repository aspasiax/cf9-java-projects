package gr.aueb.cf.cf9.part1pop.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. Try-with-resources: Automatically closes resources (Scanner/File)
 * that implement the {@link java.lang.AutoCloseable} interface.
 * 2. Multi-catch: Handling multiple exceptions in a single catch block using '|'.
 */
public class FinallyApp {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in); - Resource
        int num = 0;

        File file = new File("C:/tmp/test-file.txt");

//        try {
//            num = scanner.nextInt();
//            System.out.println("number is " + num);
//        } catch (InputMismatchException e) {
//            System.out.println("Error: " + e.getMessage());
//            e.printStackTrace();
//        } finally {
//            try {
//                if (scanner != null) {
//                    scanner.close();
//                }
//            } catch (Exception e) {
//                System.err.println("Error: " + e.getMessage());
//                e.printStackTrace();
//            }
//        }

        // Try-with-resources
        // The Scanner is declared inside the parentheses of try().
        // Java guarantees that scanner.close() will be called at the end,
        // even if an exception occurs inside the block.
        try (Scanner scanner = new Scanner(file)) {

            System.out.println("Attempting to read an integer from file...");
            num = scanner.nextInt();
            System.out.println("Success! Number is: " + num);

        } catch (InputMismatchException | FileNotFoundException e) { // Multi-catch
            System.err.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}