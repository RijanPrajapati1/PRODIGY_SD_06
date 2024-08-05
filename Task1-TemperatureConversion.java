// Simple Gradient Half Circle Shape
// Comillas Negras
// Task-01

// ProDigy infotech

// Build a Temperature Conversion Program

// Create a program that converts temperatures between Celsius, Fahrenheit, and Kelvin scales. The program should prompt the user to input a temperature value and the original 
// unit of measurement. It should then convert the temperature to the other two units and display the converted values to the user. For example, if the user enters a temperature 
// of 25 degrees Celsius, the program should convert it to Fahrenheit and Kelvin, and present the converted values as outputs.

import java.util.Scanner;

class Main {

    //to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    //  to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //user input
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Enter the unit of measurement (C/F/K): ");
        char unit = scanner.nextLine().toUpperCase().charAt(0);

        //using switch case
        switch (unit) {
            case 'C':
                double fahrenheitFromCelsius = celsiusToFahrenheit(temperature);
                double kelvinFromCelsius = celsiusToKelvin(temperature);
                System.out.printf("Temperature in Fahrenheit:", fahrenheitFromCelsius);
                System.out.printf("Temperature in Kelvin:", kelvinFromCelsius);
                break;
            case 'F':
                double celsiusFromFahrenheit = fahrenheitToCelsius(temperature);
                double kelvinFromFahrenheit = fahrenheitToKelvin(temperature);
                System.out.printf("Temperature in Celsius: ", celsiusFromFahrenheit);
                System.out.printf("Temperature in Kelvin: ", kelvinFromFahrenheit);
                break;
            case 'K':
                double celsiusFromKelvin = kelvinToCelsius(temperature);
                double fahrenheitFromKelvin = kelvinToFahrenheit(temperature);
                System.out.printf("Temperature in Celsius:", celsiusFromKelvin);
                System.out.printf("Temperature in Fahrenheit:", fahrenheitFromKelvin);
                break;
            default:
                System.out.println("Invalid unit of measurement. Please enter C, F, or K.");
        }

        scanner.close(); 
    }
}
