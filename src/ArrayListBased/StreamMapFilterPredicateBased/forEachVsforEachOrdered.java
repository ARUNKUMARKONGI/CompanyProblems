package ArrayListBased.StreamMapFilterPredicateBased;

import java.util.Arrays;

public class forEachVsforEachOrdered {
    public static void main(String[] args) {
        // Creating an array of numbers
        Integer[] numbersArray = {1, 2, 3, 4, 5};

        // Creating a parallel stream from the array
        Arrays.stream(numbersArray).parallel()
                .forEach(System.out::print); // May print: 13245 or 14235, etc.

        System.out.println(); // Adding a new line for clarity

        // Creating a parallel stream from the array
        Arrays.stream(numbersArray).parallel()
                .forEachOrdered(System.out::print); // Always prints: 12345
    }
}

