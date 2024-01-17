package ArrayListBased.StreamMapFilterPredicateBased;
import java.util.*;

public class DistinctElements {
    public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(20, 2, 2, 3, 4, 4, 5, 6, 6, 7);

    List<Integer> distinctNumbers = numbers.stream()
            .distinct()
            .toList();

System.out.println("Distinct Numbers: " + distinctNumbers);

}
}