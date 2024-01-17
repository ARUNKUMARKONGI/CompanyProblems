package ArrayListBased.StreamMapFilterPredicateBased;

import java.util.Arrays;
import java.util.List;

public class FlatMapexample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Training");

        List<String> uniqueCharacters = words.stream()
                .map(word -> word.split("")) // Split each word into an array of characters
                .flatMap(Arrays::stream)     // Flatten the arrays of characters into a single stream
                .distinct()                  // Remove duplicates
                .toList();

        System.out.println("Unique Characters: " + uniqueCharacters);


        int[][] nestedArrays = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[] flattenedArray = Arrays.stream(nestedArrays)
                .flatMapToInt(Arrays::stream) // Flatten the nested arrays
                .toArray();

        System.out.println("Flattened Array: " + Arrays.toString(flattenedArray));
    }
}


