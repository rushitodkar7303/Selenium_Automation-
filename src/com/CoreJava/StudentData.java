package com.CoreJava;

public class StudentData {

	int id;
	String name;

	public void display() {

		System.out.println("Student id is " + id);
		System.out.println("Student name is " + name);
	}

	public static void main(String args[]) {

		StudentData s1 = new StudentData();
//		s1.display();
		s1.id = 101;
		s1.name = "Raju";
		s1.display();

		System.out.println("****************************************");
		StudentData s2 = new StudentData();
		s2.id = 102;
		s2.name = "Reena";
		s2.display();
	}

}
