package Q3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final int[] numbers = { 3, 5, 7, 2, 8 };
        System.out.println("numbers: " + Arrays.toString(numbers));

        if (HelperFunctions.isDistinct(numbers))
            System.out.println("Second Largest Number: " + findSecondLargest(numbers));
        else
            System.out.println("Error: at least two distinct numbers.");

    }

    // find largest logic
    private static int findSecondLargest(int listOfNumbers[]) {
        int largest = listOfNumbers[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < listOfNumbers.length; i++) {
            if (listOfNumbers[i] > largest) {
                // second largest number
                secondLargest = largest;
                largest = listOfNumbers[i];
            }
        }
        return secondLargest;
    }
}
