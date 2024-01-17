package ArrayListBased.Reducefunction;
import java.util.*;
public class FInd1and0usingStreamReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,0,1,1,1,0,0,1,0,0);

        int sum=numbers.stream().reduce(0,Integer::sum);

        System.out.println("Number of 1s are: "+sum);
        System.out.println("number of 0s are: "+(numbers.size()-sum));
    }
}
