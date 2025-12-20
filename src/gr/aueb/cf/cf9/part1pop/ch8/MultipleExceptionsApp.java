package gr.aueb.cf.cf9.part1pop.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Demonstrates handling multiple exceptions based on their hierarchy.
 * Catch specific exceptions first, general exceptions last.
 * Hierarchy: FileNotFoundException -> IOException -> Exception.
 */
public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("non_existent_file.txt");
        char ch = ' ';

        try (Scanner scanner = new Scanner(file)) {
            // Potential FileNotFoundException (from new Scanner)

            System.out.println("File opened successfully.");

            // Potential IOException (from System.in.read)
            System.out.println("Please press a key:");
            ch = (char) System.in.read();

        } catch (FileNotFoundException e) {
            // Catches specific file errors
            System.err.println("Error: The file was not found.");
            e.printStackTrace();
        } catch (IOException e) {
            // Catches general input/output errors (but NOT FileNotFound, as it was caught above)
            System.err.println("Error: Could not read from keyboard.");
            e.printStackTrace();
        } catch (Exception e) {
            // Catches any other unexpected error
            System.err.println("Error: A generic error occurred.");
            e.printStackTrace();
        }
    }
}