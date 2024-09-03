package AssignmentControlFlowStatements;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Create a Java program that classifies a number as positive, negative, or
		// zero accept number from the user

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("Number is positive");
		} else if (num < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is 0");
		}
	}
}
