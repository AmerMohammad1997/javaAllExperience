package org.example.streamOperation;

public class Employee {
   private long empId;
   private String empName;
   private String designation;
   private double salary;
   private int age;
   private String gender;

   public void setEmpId(long empId){
       this.empId = empId;
   }
   public void setEmpName(String empName){
       this.empName = empName;
   }
   public void setDesignation(String designation){
       this.designation = designation;
   }
   public void setSalary(double salary){
       this.salary = salary;
   }
   public void setAge(int age){
       this.age = age;
   }
   public void setGender(String gender){
       this.gender = gender;
   }

   public long getEmpId(){
       return empId;
   }
   public String getEmpName(){
       return empName;
   }
   public String getDesignation(){
       return designation;
   }
   public double getSalary(){
       return salary;
   }
   public int getAge(){
       return age;
   }
   public String getGender(){
       return gender;
   }

   public Employee(long empId, String empName, String designation, double salary, int age, String gender){
       super();
       this.empId = empId;
       this.empName = empName;
       this.designation = designation;
       this.salary = salary;
       this.age = age;
       this.gender = gender;
   }
   public String toString(){
       return "Employee [emp Id: "+ empId + ", emp Name: "+ empName + ", designation: " + designation + ", salary: " + salary +", age: "+age+", gender: "+gender+" ]";
   }
}
