package changeTemperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, please in input your value: ");
        int inputValue = sc.nextInt();
        System.out.println("""
               1. Celsius to Fahrenheit
               2. Fahrenheit to Celsius
                """);
        int inputSelectValue = sc.nextInt();
        if (inputSelectValue == 1) {
            celsiusToFahrenheit(inputValue);
        } else if (inputSelectValue == 2) {
            fahrenheitToCelsius(inputValue);
        }
    }
    public static void celsiusToFahrenheit(double value) {
        System.out.println("Fahrenheit is: " + ((9/5)*value+32));
    }
    public static void fahrenheitToCelsius(double value) {
        System.out.println("Celsius is: " + ((value - 32) / (9/5)));
    }
}
