package ArrayListBased.Reducefunction;
import java.util.*;

public class ReduceCognizantArraySum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,1,6,5);
        int sum = numbers.stream().reduce(0,Integer::sum);
        System.out.println(sum);
        List<Integer> result = numbers.stream()
                .map(x->x+sum)
                .toList();

        System.out.println("Final Result: "+result);
    }
}