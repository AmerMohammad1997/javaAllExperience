package org.example.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {
    public List<Employee> getBooksSorted(){
        List<Employee> myBook = new EmployeeDao().getEmployee();
        Collections.sort(myBook, new MyComparator());
        return myBook;
    }

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        System.out.println(employeeService.getBooksSorted());
    }

}

class MyComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}
