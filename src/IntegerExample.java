import java.util.ArrayList;
import java.util.List;

public class IntegerExample {
    public static void main(String[] args) {
        // Using ArrayList to store integers
        List<Integer> integerList = new ArrayList<>();

        // Adding integer values to the list
        integerList.add(5);
        integerList.add(10);
        integerList.add(15);

        // Accessing values from the list
        System.out.println("Values in the list:");
        for (int value : integerList) {
            System.out.println(value);
        }

        // Using Integer class for nullability
        Integer nullableInteger = null;

        // Performing operations with Integer objects
        Integer num1 = 20;
        Integer num2 = 30;
        Integer sum = num1 + num2;

        // Printing the result
        System.out.println("Sum of num1 and num2: " + sum);
    }
}
