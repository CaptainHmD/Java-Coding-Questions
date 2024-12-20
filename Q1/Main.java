package Q1;

public class Main {
    public static void main(String[] args) {
        // SimpleCalculator instens
        SimpleCalculator calculator = new SimpleCalculator();
        final int num1 = 10, num2 = 0;
        System.out.printf("Addition: %d \n", calculator.add(num1, num2));
        System.out.printf("Subtraction: %d \n", calculator.subtract(num1, num2));
        System.out.printf("Multiplication: %d \n", calculator.multiply(num1, num2));

        Double result = calculator.divide(num1, num2);
        // null means divided by 0
        if (result != null) {
            System.out.printf("Division: %.2f \n", result);
        }
    }
}
