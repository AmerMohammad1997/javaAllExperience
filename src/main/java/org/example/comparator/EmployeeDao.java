package org.example.comparator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    public List<Employee> getEmployee(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(100,"amer", 40,"Software Engineer"));
        employeeList.add(new Employee(101,"Rja", 40,"Software Engineer"));
        employeeList.add(new Employee(102,"Prasad", 40,"Software Engineer"));
        employeeList.add(new Employee(103,"Kumar", 40,"Software Engineer"));
        return employeeList;
    }
}
