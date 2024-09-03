package AssignmentControlFlowStatements;

import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		/*
		 * Write a Java program that checks if a given year is a leap year or not. A
		 * leap year is divisible by 4, but not divisible by 100 unless also divisible
		 * by 400.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Year");
		int Year = sc.nextInt();

		if (Year % 4 == 0) {
			if (Year % 100 == 0) {
				System.out.println(Year + "Leap Year");
			}
		}
	}
}
