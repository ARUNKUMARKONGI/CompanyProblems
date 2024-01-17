package ArrayListBased.StreamMapFilterPredicateBased;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 2, 4, 6, 8);
        List<Integer> result = numbers.stream()
                .dropWhile(x -> x < 5) // Drop elements until the condition x < 5 becomes false
                        .toList();
                //.collect(Collectors.toList());

        System.out.println("Result after dropWhile: " + result);

        List<String> words = Arrays.asList("apple", "banana", "kiwi", "date", "grape");

        List<String> strResult = words.stream()
                .dropWhile(s -> s.length() > 4) // Drop elements until a string of length 4 is encountered
                .toList();

        System.out.println("Result after dropWhile: " + strResult);

        int[] numbers1 = {3,5,7,8,2,10};

        /*boolean allEven = Arrays.stream(numbers1).allMatch(x -> x % 2 == 0);*/
        boolean allEven = numbers.stream().allMatch(x->x%2==0);
        boolean allEven2=numbers.stream().anyMatch(x->x%2==0);

        System.out.println("All numbers are even: " + allEven);
        System.out.println("Any numbers are even: " + allEven2);

        int firstEven = numbers.stream().filter(x->x%2==0).findFirst().orElse(-1);
        System.out.println(firstEven);


        words.stream().forEach(s->{
            if(s.length()>2){
                System.out.print(s.charAt(2)+" ");
            }
        });
     /* words.stream().flatMap(s->s.length()>2? Stream.of(s.charAt(2)):Stream.empty())
                .forEach(ch->System.out.print(ch+" "));
        //.forEach(System.out::println);*/


    }
}



