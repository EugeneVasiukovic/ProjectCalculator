package app;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Multiply by zero is not possible");
        }
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not possible");
        }
        return (double) a / b;
    }
}