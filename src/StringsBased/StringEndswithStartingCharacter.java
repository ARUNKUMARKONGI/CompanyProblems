package StringsBased;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class StringEndswithStartingCharacter {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("suhas","shreyas","agatsya","nitin","arun","akash","pratap");
        str.stream()
                .filter(x -> x.length() > 0 && x.endsWith(String.valueOf(x.charAt(0))))
                .forEach(System.out::println);

       /* List<String> result = str.stream()
                .filter(x -> x.length() > 0 && x.endsWith(String.valueOf(x.charAt(0))))
                .collect(Collectors.toList());

        result.forEach(System.out::println);*/
        //System.out.println(result);

        /*String concatenatedString = str.stream()
                .filter(x -> x.length() > 0 && x.endsWith(String.valueOf(x.charAt(0))))
                .collect(Collectors.joining());
        System.out.println(concatenatedString);*/
    }
}
