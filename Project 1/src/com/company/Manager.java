package com.company;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    protected ArrayList<Employee> emp;
    protected List l;
    static int ID = 0;
    protected int mID;
    protected int managerid;
    public Manager(String name, int idnum, int age, double salary, String title, String dName) {
        super(name, idnum, age, salary, title, dName);
        ID++;
        emp = new ArrayList<Employee>();
        l = new ArrayList();
        this.managerid = mID;
    }

    public void printManager(Manager m) {
        System.out.println("manager's name : " + name + "\t" + " manager's id : " + idnum + "\t" + " manager's age : " + age);
        System.out.println("manager's salary : " + salary + "\t" + " manager's title : " + title + "\t" + " manager's department :" + dName);
        System.out.println("manager " + name + " epmloyees :");
        while (true) {
            int i = 1;
            for (Employee e : m.emp) {
                e.printEmployee();
                i++;
            }
            break;
        }
    }
    public void printEmpID(Manager m){
        System.out.println("manager " + name + " epmloyees' id :");
        while (true) {
            int i = 1;
            for (Object n : m.l) {
                System.out.println(n);
                i++;
            }
            break;
        }
    }
}
