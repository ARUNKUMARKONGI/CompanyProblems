package ArrayListBased.StreamMapFilterPredicateBased;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6, 7);

        List<Integer> nonDuplicateNumbers = numbers.stream()
                .filter(i -> Collections.frequency(numbers, i) == 1)
                .collect(Collectors.toList());
                //.toList();

        System.out.println("Non-Duplicate(Unique) Numbers: " + nonDuplicateNumbers);
    }
}

