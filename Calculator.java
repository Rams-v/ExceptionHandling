package Assignment7;

public class Calculator {
    // Method to perform addition
    public double addition(double n1, double n2) {
        return n1 + n2;
    }

    // Method to perform subtraction
    public double subtraction(double n1, double n2) {
        return n1 - n2;
    }

    // Method to perform multiplication
    public double multiplication(double n1, double n2) {
        return n1 * n2;
    }

    // Method to perform division
    public double division(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return n1 / n2;
    }

    // Method to add two arrays
    public double[] aradd(double a1[], double a2[], int n) {
        double a3[] = new double[n];
        for (int i = 0; i < n; i++) {
            a3[i] = a1[i] + a2[i];
        }
        return a3;
    }

    // Method to subtract one array from another
    public double[] arsub(double a1[], double a2[], int n) {
        double a3[] = new double[n];
        for (int i = 0; i < n; i++) {
            a3[i] = a1[i] - a2[i];
        }
        return a3;
    }

    // Method to calculate variance of an array
    public double arvar(double a1[], int n) {
        double sum = 0;
        // Calculate sum of array elements
        for (int i = 0; i < n; i++) {
            sum += a1[i];
        }
        // Calculate mean
        double mean = sum / n;
        double variance = 0;
        // Calculate variance
        for (int i = 0; i < n; i++) {
            variance += Math.pow(a1[i] - mean, 2);
        }
        return variance / n;
    }
}