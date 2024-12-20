package Q2;

class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("hello").trim());

    }

    static String reverseString(String input) {
        // Convert to array to loop and swap
        String[] myArray = input.split("");
        for (int i = 0; i < (myArray.length) / 2; i++) {
            String tempChar = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = tempChar;
        }
        // join to convert array to string
        return String.join("", myArray);
    }
}