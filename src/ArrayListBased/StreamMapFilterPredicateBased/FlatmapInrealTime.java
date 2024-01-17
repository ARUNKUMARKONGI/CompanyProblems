package ArrayListBased.StreamMapFilterPredicateBased;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

class Cricketers {
    String name;
    List<String> Roles;

    public Cricketers(String name, List<String> Roles) {
        this.name = name;
        this.Roles = Roles;
    }
}

public class FlatmapInrealTime {
    public static void main(String[] args) {
        List<Cricketers> list = Arrays.asList(
                new Cricketers("Arun", Arrays.asList("Bowling","fielding")),
                new Cricketers("Akash", Arrays.asList("Batting","keeping")),
                new Cricketers("Sanju",Arrays.asList("keeping","batting"))
        );

        /*List<String> distinctRoles = list.stream()
                .flatMap(c -> c.Roles.stream())
                .distinct() // Fetch distinct roles
                .toList();*/

        Set<String> uniqueRoles = list.stream()
                .flatMap(c -> c.Roles.stream())
                .map(String::toLowerCase) // Convert roles to lowercase
                .collect(Collectors.toSet()); // Use Set to ensure unique roles

        System.out.println("Unique Roles overall: " + uniqueRoles);
    }
}