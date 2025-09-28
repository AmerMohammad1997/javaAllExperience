package org.example.streamOperation;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public List<Employee> getEmployee(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(100, "Amer Mohammad", "Software Engineer", 36000, 29,"male"));
        employees.add(new Employee(100, "Gulshan Kumar", "Software Engineer", 26000, 29,"female"));
        employees.add(new Employee(102, "godrej raju","manager",50000, 40,"female"));
        employees.add(new Employee(103, "Bajaj Anand", "supervisor", 60000, 45,"male"));
        employees.add(new Employee(104, "ratan tata","CEO",1000000, 78,"male"));
        return employees;
    }
}
