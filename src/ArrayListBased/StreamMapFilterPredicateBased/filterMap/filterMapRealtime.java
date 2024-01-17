package ArrayListBased.StreamMapFilterPredicateBased.filterMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class filterMapRealtime {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22)
        );

        // Filter people younger than 30 and extract their names
        List<String> result = people.stream()
                .filter(person -> person.age < 30)   // Filter people younger than 30
                .map(person -> person.name)          // Extract names of filtered people
                .collect(Collectors.toList());

        System.out.println("Names of People Younger Than 30: " + result);
    }
}

