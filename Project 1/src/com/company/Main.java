package com.company;

public class Main {

    public static void main(String[] args) {
    Manager m1 = new Manager("mohammad" , 1230 , 54 , 120000 , "modir foruosh" , "foroush");
	Employee e1 = new Employee("ali" , 1231  , 30 , 20000 , "karmand foroush" , "sandogh");
	Employee e2 = new Employee("sara" , 1232 , 25 , 32000 , "hesabdar" , "mali");
	m1.emp.add(e1);
	m1.emp.add(e2);
	m1.l.add(e1.idnum);
	m1.l.add(e2.idnum);
	System.out.println("employees' information : ");
	e1.printEmployee();
	e2.printEmployee();
	System.out.println("---------------------------------------------------------------------------------");
	System.out.println("New salary  of " + e1.name + " with 1000 addition =" + e1.changeSalary( 1000));
	System.out.println("New salary of " + e2.name + " with 1.2 percentage =" + e2.changeSalary( 1.2));
	System.out.println("---------------------------------------------------------------------------------");
	System.out.println("managers' informations : ");
	m1.printManager(m1);
	m1.printEmpID(m1);
	System.out.println("---------------------------------------------------------------------------------");
	Executive exe1 = new Executive("hasan" , 1111 ,58 , 4000000 , "manager" , "sale" , 1200000);
	exe1.printExecutive();
	exe1.Bonus(2000000);
	System.out.println("salary after bonus : " + exe1.getSalary());

    }
}
