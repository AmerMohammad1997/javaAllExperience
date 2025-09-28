package org.example.streamOperation;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {
    public static final List<Employee> employee  = new EmployeeDAO().getEmployee();
    public static List<String> getSoftwareEmployee(){
        return employee.stream().filter(x -> x.getDesignation().equalsIgnoreCase("software engineer")).map(Employee::getEmpName).collect(Collectors.toList());
    }
    public static List<String> getDepartments(){
        return employee.stream().map(Employee::getDesignation).toList();
    }
    public static List<String> dynamicEmployee(String department){
        List<String> employee = EmployeeService.employee.stream().filter(x -> x.getDesignation().equalsIgnoreCase(department)).map(Employee::getEmpName).toList();
        if (employee.isEmpty()) return Collections.singletonList("No matches found");
        else return employee;
    }
    public static List<String> allEmployeeNames(){
        return employee.stream().map(Employee::getEmpName).toList();
    }
    public static Map<String, Map<String, Long>> maleFemaleCountEchDept(){
        Map<String, Map<String, Long>> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDesignation, Collectors.groupingBy(Employee::getGender, Collectors.counting())));
        return collect;
    }
    public static List<String> getEmpNameDescAge(){
        return  employee.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).map(Employee::getEmpName).toList();
    }
    public static Map<String,List<String>> getEmplBydept(){
        return employee.stream().collect(Collectors.groupingBy(Employee::getDesignation, Collectors.mapping(Employee::getEmpName, Collectors.toList())));
    }
    public static Double avergeSlaryWise(String department){
        return employee.stream().filter(x ->x.getDesignation().equalsIgnoreCase(department)).mapToDouble(Employee::getSalary).average().getAsDouble();
    }
    public static Map<String, Double> allDeptAvgSal(){
        return employee.stream().collect(Collectors.groupingBy(Employee::getDesignation, Collectors.averagingDouble(Employee::getSalary)));
    }
    public static String highPaidEmployee(){
        return  employee.stream().max(Comparator.comparingDouble(Employee::getSalary)).map(Employee::getEmpName).get();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // getting software Employees List
        System.out.println("Software Employees are : " + getSoftwareEmployee());
        System.out.println("employee by descending age: "+ getEmpNameDescAge());
        System.out.println("Employee By department wise : "+getEmplBydept());
        System.out.println("Enter department to get names: ");
        List<String> departmentsList = getDepartments();
        for (int i = 0;i< departmentsList.size(); i++){
            System.out.println(i+1 +" : "+departmentsList.get(i));
        }
        System.out.println(" Example: 1, 2, 3... : ");
        int index = scan.nextInt();
        String department = "";
        if (index >= 1 && index <= departmentsList.size()){
            department = departmentsList.get(index-1);
        } else {
            System.out.println("Invalid Index ");
        }
        System.out.println("Employee names in "+department+ ": "+dynamicEmployee(department));

        System.out.println("Average Salary in "+department.toUpperCase()+" deprtment : "+ avergeSlaryWise(department));
        System.out.println("All dept average :" +allDeptAvgSal());
        // all employee names
        System.out.println("All employee name : " + allEmployeeNames());
        System.out.println("High paid employee: " + highPaidEmployee());
        getPartitioedEmploees();

//        System.out.println("female and male count: " );
//        Map<String, Map<String, Long>> maleFemaleCountEchDept = maleFemaleCountEchDept();
//        maleFemaleCountEchDept.forEach((dept, genderMap) -> {
//            System.out.println("deprtments: " + dept.toUpperCase());
//            genderMap.forEach((gender, count) -> {
//                System.out.println("     " + gender+" : " + count);
//            });
//        });
        scan.close();
    }
}
