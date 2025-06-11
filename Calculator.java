package Basic;

import java.util.Scanner;

public class Calculator {

    // Method to perform addition
    public double add(double a, double b) {
        return a + b;
    }

    // Method to perform subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to perform multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to perform division
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is undefined.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            System.out.print("Enter first number (a): ");
            double a = scanner.nextDouble();

            System.out.print("Enter second number (b): ");
            double b = scanner.nextDouble();

            System.out.print("Enter operation (add, subtract, multiply, divide, exit): ");
            String operation = scanner.next();

            switch (operation.toLowerCase()) {
                case "add":
                    System.out.println("Result: " + calc.add(a, b));
                    break;
                case "subtract":
                    System.out.println("Result: " + calc.subtract(a, b));
                    break;
                case "multiply":
                    System.out.println("Result: " + calc.multiply(a, b));
                    break;
                case "divide":
                    System.out.println("Result: " + calc.divide(a, b));
                    break;
                case "exit":
                    System.out.println("Exiting calculator. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid operation. Please try again.");
            }

            System.out.println(); // Blank line for readability
        }
    }
}
