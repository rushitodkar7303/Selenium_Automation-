package AssignmentControlFlowStatements;

import java.util.Scanner;

/* *  Create a Java program that assigns a letter grade based on a numerical score. The grading 
scale is:
a. 90-100: A
b. 80-89: B
c. 70-79: C
d. 60-69: D
e. Below 60: F
		 */
public class Que5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your score");
		int score = sc.nextInt();

		char grade;
		if (score < 0 || score > 100) {
			System.out.println("Please enter a number in rage of  (0 to 100)");
		} else if (score >= 90) {
			System.out.println("Grade is A ");
		} else if (score >= 80) {
			System.out.println("Grade is B ");
		} else if (score >= 70) {
			System.out.println("Grade is C ");
		} else if (score >= 60) {
			System.out.println("Grade is D ");
		}
		else if (score < 60) {
			System.out.println("Grade is F ");
		}

	}

}
