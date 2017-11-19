//        (Temperature Conversions) Implement the following integer methods:
//        a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the
//        calculation
//        celsius = 5.0 / 9.0 * (fahrenheit - 32);
//        b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
//        the calculation
//        fahrenheit = 9.0 / 5.0 * celsius + 32;
//        c) Use the methods from parts (a) and (b) to write an application that enables the user either
//        to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a
//        Celsius temperature and display the Fahrenheit equivalent.

import java.util.Scanner;

public class Exercise22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char temperatureUnit;

        do {
            System.out.print("Choose what temperature unit you want to enter(C/F): ");
            temperatureUnit = Character.toLowerCase(scanner.next().charAt(0));
        } while (temperatureUnit != 'c' && temperatureUnit != 'f');

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        if (temperatureUnit == 'c') {
            System.out.printf("%.2f degrees Celsius equivalent in Fahrenheit is equal to %.2f", temperature, toFahrenheit(temperature));
        } else {
            System.out.printf("%.2f degrees Fahrenheit equivalent in Celsius is equal to %.2f", temperature, toCelsius(temperature));
        }
    }

    public static double toCelsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double toFahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}
