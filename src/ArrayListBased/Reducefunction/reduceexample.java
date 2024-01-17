package ArrayListBased.Reducefunction;
import java.util.*;
public class reduceexample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Virat", " ", "Kohli", "100");
        String result = strings.stream().reduce("", String::concat);
        System.out.println("Concatenated String: " + result);

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);

        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        int prod = numbers.stream().reduce(1,(a,b)->a*b);
        System.out.println("Product: "+prod);

        List<Double> doubles = Arrays.asList(2.5, 1.8, 3.2, 4.0);
        double max = doubles.stream().reduce(Double.MIN_VALUE, Double::max);
        System.out.println("Maximum Value: " + max);

        List<String> words = Arrays.asList("Java", "is", "awesome");
        String joinedString = words.stream().reduce("", (a, b) -> a + " " + b);
        System.out.println("Joined String: " + joinedString);




    }
}
