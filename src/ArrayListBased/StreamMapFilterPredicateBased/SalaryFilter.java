package ArrayListBased.StreamMapFilterPredicateBased;
import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class SalaryFilter {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("John", 30000),
                new Employee("Alice", 60000),
                new Employee("Bob", 75000),
                new Employee("Eva", 48000)
        );

        List<Employee> salary = employees.stream()
                .filter(x -> x.salary > 40000)
                .toList();

        System.out.println("High Salary Employees: " + salary);

    }
}
