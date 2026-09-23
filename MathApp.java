package mathapp;

import java.util.Scanner;

public class MathApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=== Math App Menu ===");
            System.out.println("1. Addition of two numbers");
            System.out.println("2. Subtraction of two numbers");
            System.out.println("3. Multiplication of two numbers");
            System.out.println("4. Division of two numbers");
            System.out.println("5. Factorial of a number");
            System.out.println("6. Power (x^y)");
            System.out.println("7. Sum of number 1 to N");
            System.out.println("8. Check if a number is prime");
            System.out.println("9. Greatest common divisor (GCD)");
            System.out.println("10. Absolute value of a number");
            System.out.println("11. Average of N numbers (stored in an array)");
            System.out.println("12. Maximum of N numbers (stored in an array)");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number. ");

                input.next();
                System.out.print("Enter your choice: ");
            }

            choice = input.nextInt();

            switch (choice) {

                //1. ADDITION
                case 1:
                    double num1;
                    double num2;
                    double result;

                    System.out.println("== ADDITION OF TWO NUMBERS ==");
                    System.out.print("Enter first number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter first number: ");
                    }

                    num1 = input.nextDouble();

                    System.out.print("Enter second number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter second number: ");
                    }

                    num2 = input.nextDouble();

                    result = num1 + num2;
                    System.out.println("Eesult: " + result);
                    break;

                //2. SUBTRACTION
                case 2:

                    System.out.println("== SUBTRACTION OF TWO NUMBERS ==");
                    System.out.print("Enter first number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter first number: ");
                    }

                    num1 = input.nextDouble();

                    System.out.print("Enter second number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter second number: ");
                    }

                    num2 = input.nextDouble();

                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                //3. MULTIPLICATION
                case 3:

                    System.out.println("== MULTIPLICATION OF TWO NUMBERS ==");
                    System.out.print("Enter first number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter first number: ");
                    }

                    num1 = input.nextDouble();

                    System.out.print("Enter second number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter second number: ");
                    }

                    num2 = input.nextDouble();

                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                // 4. DIVISION
                case 4:

                    System.out.println("== DIVISION OF TWO NUMBERS ==");
                    System.out.print("Enter numerator: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter numerator: ");
                    }

                    num1 = input.nextDouble();

                    System.out.print("Enter denominator: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter denominator: ");
                    }

                    num2 = input.nextDouble();

                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by Zero. ");
                    } else {
                        result = num1 / num2;

                        System.out.println("Result: " + result);
                    }
                    break;

                //5. FACTORIAL
                case 5:

                    int n;
                    long factorial = 1;

                    System.out.println("== FACTORIAL OF A NUMBER ==");
                    System.out.print("Enter a number: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter a number: ");
                    }

                    n = input.nextInt();

                    if (n < 0) {
                        System.out.println("Error: Factorial is not defined for negative numbers");

                    } else {
                        for (int i = 1; i <= n; i++) {
                            factorial = factorial * i;
                        }
                        System.out.println("Factorial: " + factorial);
                    }
                    break;

                // 6. POWER
                case 6:
                    double x;
                    double y;

                    System.out.println("== POWER (x^y)");
                    System.out.print("Enter base x: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter base x: ");
                    }

                    x = input.nextDouble();

                    System.out.print("Enter exponent y: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter exponent y:");
                    }

                    y = input.nextDouble();

                    result = Math.pow(x, y);

                    System.out.println("Result: " + result);
                    break;

                //7. SUM FROM 1 TO N
                case 7:
                    int sum = 0;

                    System.out.println("== SUM OF NUMBERS 1 TO N ==");
                    System.out.print("Enter N: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter N: ");
                    }

                    n = input.nextInt();

                    if (n < 1) {
                        System.out.print("Error: N must be atleast 1. ");

                    } else {
                        for (int i = 1; i <= n; i++) {
                            sum = sum + i;
                        }

                        System.out.println("Sum from 1 to " + n + ": " + sum);
                    }
                    break;

                //8. PRIME NUMBER
                case 8:

                    int number;
                    int prime = 1;

                    System.out.println("== PRIME NUMBER CHECKER ==");
                    System.out.print("Enter a number: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter a number: ");
                    }

                    number = input.nextInt();

                    if (number < 2) {
                        prime = 0;

                    } else {
                        for (int i = 2; i < number; i++) {

                            if (number % i == 0) {
                                prime = 0;

                            }
                        }
                    }
                    if (prime == 1) {
                        System.out.println(number + " is a prime number.");

                    } else {
                        System.out.println(number + " is not a prime number.");
                    }
                    break;

                //9. GCD
                case 9:
                    int a,
                     b,
                     remainder;

                    System.out.println("== GREATEST COMMON DIVISOR (GCD) ==");
                    System.out.print("Enter first number: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter first number: ");
                    }

                    a = input.nextInt();

                    System.out.print("Enter second number: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter second number: ");
                    }

                    b = input.nextInt();

                    if (a < 0) {
                        a = -a;
                    }

                    if (b < 0) {
                        b = -b;
                    }

                    if (a == 0 && b == 0) {
                        System.out.println("GCD is undefined");
                    } else {

                        while (b != 0) {
                            remainder = a % b;
                            a = b;
                            b = remainder;
                        }
                        System.out.println("GCD: " + a);
                    }
                    break;

                // 10. ABSOLUTE VALUE
                case 10:

                    System.out.println("== ABSOLUTE VALUE  OF A NUMBER ==");
                    System.out.print("Enter a number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number. ");

                        input.next();
                        System.out.print("Enter a number: ");
                    }

                    num1 = input.nextDouble();

                    result = Math.abs(num1);

                    System.out.println("Absolute Value: " + result);
                    break;

                //11. AVERAGE
                case 11:

                    System.out.println("== AVERAGE OF N NUMBERS ==");
                    System.out.print("How many numbers? ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number. ");

                        input.next();
                        System.out.print("How many numbers? ");
                    }

                    n = input.nextInt();

                    if (n <= 0) {
                        System.out.println("Error: N must be greater than 0");

                    } else {
                        double[] numbers = new double[n];
                        double sumNumbers = 0;
                        double average;

                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter a number: " + (i + 1) + ": ");

                            while (!input.hasNextDouble()) {
                                System.out.println("Invalid input." + "Please enter a number. ");

                                input.next();
                                System.out.print("Enter a number: " + (i + 1) + ": ");
                            }

                            numbers[i] = input.nextDouble();
                            sumNumbers = sumNumbers + numbers[i];
                        }

                        average = sumNumbers / n;
                        System.out.println("Average: " + average);
                    }
                    break;

                //12. MAXIMUM
                case 12:

                    System.out.println("== MAXIMUM OF N NUMBERS ==");
                    System.out.print("How many numbers? ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number. ");

                        input.next();
                        System.out.print("How many numbers? ");
                    }

                    n = input.nextInt();

                    if (n <= 0) {
                        System.out.println("Error: N must be greater than 0");

                    } else {
                        double[] numbers = new double[n];

                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter number: " + (i + 1) + ": ");

                            while (!input.hasNextInt()) {
                                System.out.println("Invalid input. " + "Please enter a number. ");

                                input.next();
                                System.out.print("Enter number: " + (i + 1) + ": ");
                            }

                            numbers[i] = input.nextDouble();
                        }

                        double maximum = numbers[0];
                        for (int i = 1; i < n; i++) {

                            if (numbers[i] > maximum) {
                                maximum = numbers[i];
                            }
                        }
                        System.out.println("Maximum: " + maximum);
                    }
                    break;

                //0. EXIT
                case 0:

                    System.out.println("THANK YOU!");
                    break;

                default:
                    System.out.println("Invalid choice. " + "Please choose from 0 to 12. ");
            }

        } while (choice != 0);

        input.close();
    }
}
