package Q1;

public class SimpleCalculator {

    protected SimpleCalculator() {
    }

    protected int add(int num1, int num2) {
        return num1 + num2;
    }

    protected int subtract(int num1, int num2) {
        return num1 - num2;
    }

    protected int multiply(int num1, int num2) {
        return num1 * num2;
    }

    protected Double divide(int num1, int num2) {
        if (num2 == 0) {
            System.err.println("Error: Division by zero.");
            return null;
        }
        return (double) num1 / num2;
    }
}
