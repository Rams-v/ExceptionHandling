# Java Calculator Program

This is a simple command-line calculator program written in Java. It allows users to perform basic arithmetic operations, as well as operations on arrays such as addition, subtraction, variance, and standard deviation.

## Files

- `Main.java`: Contains the main logic of the calculator program. It displays a menu of operations, takes user input, and calls appropriate methods from the `Calculator` and `Input` classes to perform calculations.
- `Calculator.java`: Defines the `Calculator` class, which contains methods for performing arithmetic operations like addition, subtraction, multiplication, division, array addition, array subtraction, variance, and standard deviation.
- `Input.java`: Defines the `Input` class, which handles user input for numbers and arrays.

## Features

- **Basic Arithmetic Operations**:
  - Addition
  - Subtraction
  - Multiplication
  - Division

- **Array Operations**:
  - Array Addition
  - Array Subtraction
  - Variance of an Array
  - Standard Deviation of an Array

## Exception Handling

- **ArithmeticException**: Thrown when attempting to divide by zero.
- **IllegalArgumentException**: Thrown when array lengths are not equal in array addition and subtraction operations.
- **InputMismatchException**: Thrown when user enters invalid input type, for example, non-numeric characters when expecting numbers.
- **Exception**: A generic catch-all exception to handle any unforeseen errors or issues during program execution.
