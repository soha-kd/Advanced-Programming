package com.company;

public class Executive extends Manager {
    protected double bonus;
    public Executive(String name, int idnum, int age, double salary, String title, String dName , double bonus) {
        super(name, idnum, age, salary, title, dName);
        this.bonus = bonus;
    }
    public void Bonus(double b) {
        this.bonus = b;
        return;
    }
    public double getSalary(){
        return this.salary + this.bonus;
    }
    public void printExecutive () {
        System.out.println("Executive's name : " + name + "\t" + " Executive's id : " + idnum + "\t" + " Executive's age : " + age);
        System.out.println("Executive's salary : " + salary + "\t" + " Executive's title : " + title + "\t" + " Executive's department :" + dName);
    }
}
