package Q3;

import java.util.HashSet;
import java.util.Set;

public class HelperFunctions {

    // Convert list to set to remove duplicates if any
    // must two distinct elements at least two distinct elements
    public static boolean isDistinct(int listOfNumbers[]) {
        Set<Integer> union = new HashSet<>();

        for (int number : listOfNumbers) {
            union.add(number);
        }
        return union.size() > 1;
    }
}
