package ArrayListBased.StreamMapFilterPredicateBased.filterMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers and then square them
        List<Integer> result = numbers.stream()
                .filter(x -> x % 2 == 0)        // Filter even numbers
                .map(x -> x * x)                // Square each even number
                .collect(Collectors.toList());

        System.out.println("Filtered and Squared Numbers: " + result);

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Filter words with length greater than 5 and convert them to uppercase
        List<String> result1 = words.stream()
                .filter(word -> word.length() > 5)   // Filter words with length > 5
                .map(String::toUpperCase)           // Convert filtered words to uppercase
                .collect(Collectors.toList());

        System.out.println("Filtered and Uppercase Words: " + result1);
    }
}
