package gr.aueb.cf.cf9.part1pop.ch5;

import java.util.Scanner;

/**
 * Converts a user-provided temperature from Celsius to Fahrenheit using a method.
 * F = (C * 9/5) + 32
 */

public class CelsiusToFahrenheitApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsiusTemp = 0.0;
        double fahrenheitTemp = 0.0;

        System.out.println("Please enter temperature in Celsius: ");
        celsiusTemp = scanner.nextDouble();

        fahrenheitTemp = celsiusToFahrenheit(celsiusTemp);

        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit%n", celsiusTemp, fahrenheitTemp);
    }

    /**
     * Converts Celsius degrees to Fahrenheit.
     *
     * @param celsiusTemp the temperature in Celsius
     * @return the temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsiusTemp) {
        return (celsiusTemp * 9.0 / 5.0) + 32;
    }
}
