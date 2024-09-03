package com.CoreJava;

public class Employee {
	int empid;
	String empname;
	public void show() {
		System.out.println("Employee Id is: " + empid);
		System.out.println("Employee Name: " + empname);
	}
	public static void main(String args[]) {
		Employee e1 = new Employee();
		System.out.println("EMPLOYEE 01");
		e1.empid = 7303;
		e1.empname = "Rushi";
		e1.show();
		System.out.println("EMPLOYEE 02");
		Employee e2 = new Employee();
		e2.empid = 4151;
		e2.empname = "Ajit";
		e2.show();
		System.out.println("EMPLOYEE 03");
		Employee e3 = new Employee();
		e2.empid = 2423;
		e2.empname = "Akash";
		e2.show();
		System.out.println("EMPLOYEE 04");
		Employee e4 = new Employee();
		e2.empid = 7005;
		e2.empname = "Sunil";
		e2.show();
		System.out.println("EMPLOYEE 05");
		Employee e5 = new Employee();
		e2.empid = 1545;
		e2.empname = "Dinesh";
		e2.show();
	}
}


