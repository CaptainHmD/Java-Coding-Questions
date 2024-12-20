package Q3;

public class Main {

    public static void main(String[] args) {
        final int[] numbers = { 3, 5, 7, 2, 8 };

        if (HelperFunctions.isDistinct(numbers))
            System.out.println(findSecondLargest(numbers));
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
