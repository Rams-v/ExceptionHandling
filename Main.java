package Assignment7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        // Creating instances of Calculator and Input classes
        Calculator calculator = new Calculator();
        Input input = new Input();
        // Creating Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Flag to control the loop
        boolean exit = false;

        // Main loop
        while (!exit) {
            try {
                // Displaying calculator operations menu
                System.out.println("Calculator Operations:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Array Addition");
                System.out.println("6. Array Subtraction");
                System.out.println("7. Variance of an Array");
                System.out.println("8. Standard Deviation");
                System.out.println("9. Exit");
                System.out.print("Enter the number corresponding to the operation: ");
                // Reading user choice
                int choice = scan.nextInt();

                switch (choice) {
                    case 1: {
                        // Perform addition
                        double numbers[] = input.inputNumbers();
                        double n1 = numbers[0];
                        double n2 = numbers[1];
                        System.out.println("The Addition of " + n1 + " and " + n2 + " is " + calculator.addition(n1, n2));
                        break;
                    }
                    case 2: {
                        // Perform subtraction
                        double numbers[] = input.inputNumbers();
                        double n1 = numbers[0];
                        double n2 = numbers[1];
                        System.out.println("The Subtraction of " + n1 + " and " + n2 + " is " + calculator.subtraction(n1, n2));
                        break;
                    }
                    case 3: {
                        // Perform multiplication
                        double numbers[] = input.inputNumbers();
                        double n1 = numbers[0];
                        double n2 = numbers[1];
                        System.out.println("The Multiplication of " + n1 + " and " + n2 + " is " + calculator.multiplication(n1, n2));
                        break;
                    }
                    case 4: {
                        // Perform division
                        double numbers[] = input.inputNumbers();
                        double n1 = numbers[0];
                        double n2 = numbers[1];
                        if (n2 == 0) {
                            throw new ArithmeticException("Cannot divide by zero!");
                        }
                        System.out.println("The Division of " + n1 + " and " + n2 + " is " + calculator.division(n1, n2));
                        break;
                    }
                    case 5: {
                        // Perform array addition
                        System.out.print("Enter the number of elements: ");
                        int n = scan.nextInt();
                        double arr1[] = new double[n];
                        double arr2[] = new double[n];
                        double arr3[] = new double[n];
                        System.out.println("Enter the elements of the first array: ");
                        arr1 = input.inputArray(n);
                        System.out.println("Enter the elements of the second array:");
                        arr2 = input.inputArray(n);
                        if (arr1.length != arr2.length) {
                            throw new IllegalArgumentException("Array lengths are not equal!");
                        }
                        arr3 = calculator.aradd(arr1, arr2, n);
                        System.out.print("\nThe resultant array is: ");
                        for (int i = 0; i < n; i++) {
                            System.out.print(arr3[i] + " ");
                        }
                        break;
                    }
                    case 6: {
                        // Perform array subtraction
                        System.out.print("Enter the number of elements: ");
                        int n = scan.nextInt();
                        double arr1[] = new double[n];
                        double arr2[] = new double[n];
                        double arr3[] = new double[n];
                        System.out.println("Enter the elements of the first array: ");
                        arr1 = input.inputArray(n);
                        System.out.println("Enter the elements of the second array:");
                        arr2 = input.inputArray(n);
                        if (arr1.length != arr2.length) {
                            throw new IllegalArgumentException("Array lengths are not equal!");
                        }
                        arr3 = calculator.arsub(arr1, arr2, n);
                        System.out.print("\nThe resultant array is: ");
                        for (int i = 0; i < n; i++) {
                            System.out.print(arr3[i] + " ");
                        }
                        break;
                    }
                    case 7: {
                        // Calculate variance of an array
                        System.out.print("Enter the number of elements: ");
                        int n = scan.nextInt();
                        double arr1[] = new double[n];
                        System.out.println("Enter the elements of the array: ");
                        arr1 = input.inputArray(n);
                        double var = calculator.arvar(arr1, n);
                        System.out.println("\nThe variance of the array is " + var);
                        break;
                    }
                    case 8: {
                        // Calculate standard deviation of an array
                        System.out.print("Enter the number of elements: ");
                        int n = scan.nextInt();
                        double arr1[] = new double[n];
                        System.out.println("Enter the elements of the array: ");
                        arr1 = input.inputArray(n);
                        double var = calculator.arvar(arr1, n);
                        double stdDev = Math.sqrt(var);
                        System.out.println("\nThe Standard Deviation of the array is " + stdDev);
                        break;
                    }
                    case 9: {
                        // Exit the program
                        exit = true;
                        System.out.println("Exiting the program.");
                        break;
                    }
                    default: {
                        System.out.println("Please enter a valid input");
                    }
                }
            } catch (ArithmeticException e) {
                // Handle arithmetic exception
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                // Handle illegal argument exception
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                // Handle input mismatch exception
                System.out.println("Error: Invalid input type");
                // Clear the input buffer
                scan.nextLine();
            } catch (Exception e) {
                // Handle any other exception
                System.out.println("Error: Something went wrong");
            }
        }

        // Close the Scanner object
        scan.close();
    }
}
