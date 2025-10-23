package org.example.streamOperation.StringsAndNumbers;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return
                "firstName=" + firstName +
                ", lastName=" + lastName ;
    }
}

public class DuplicateEmployeeNames {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Amer", "mohammad"),
                new Employee("Tamma", "mohammad"),
                new Employee("Amer", "mohammad"),
                new Employee("chinna", "mohammad"),
                new Employee("chinna", "mohammad"),
                new Employee("Amer", "mohammad")
        );

        Map<String, List<Employee>> collected =
                employees.stream().collect(Collectors.groupingBy(Employee::getFirstName));


        List<Employee> duplicates = collected.values().stream().filter(list -> list.size() > 1).flatMap(List::stream).collect(Collectors.toList());
        duplicates.forEach(System.out::println);
    }
}
