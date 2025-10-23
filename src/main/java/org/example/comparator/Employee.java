package org.example.comparator;

public class Employee {
    private int empId;
    private String empName;
    private int empAge;
    private String designation;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Employee(int empId, String empName, int empAge, String designation) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", designation='" + designation + '\'' +
                '}';
    }
}
