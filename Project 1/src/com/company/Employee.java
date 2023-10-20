package com.company;

public class Employee {
   static int EID = 0;
   protected String name;
   protected int idnum;
   protected int age;
   protected double salary;
   protected String title;
   protected String dName;
   protected int emplpyeeId;
   public Employee(String name , int idnum , int age , double salary , String title ,String dName){
       EID++;
       this.age = age;
       this.dName = dName;
       this.idnum = idnum;
       this.name = name;
       this.salary = salary;
       this.title = title;
       this.emplpyeeId = EID;
   }
  public double changeSalary(int a){
      this.salary = this.salary + a;
      return this.salary;
  }
  public double changeSalary(double a){
      this.salary = this.salary * a;
      return this.salary;
  }
  public double getSalary() {
      return this.salary;
  }
  public void printEmployee(){
      System.out.println("employee's name : " + name + "\t" + " employee's id : " + idnum + "\t" + " employee's age : " + age);
      System.out.println("employee's salary : " + salary + "\t" + " employee's title : " + title + "\t" + " employee's department : " + dName);
      System.out.println("\n");
  }

}
