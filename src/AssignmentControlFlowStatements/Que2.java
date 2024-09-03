package AssignmentControlFlowStatements;

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		/*
		 * 2. Write a Java program that calculates the discount based on the amount spent. The discount 
criteria are:
a. Above $500: 20% discount
b. Above $200 but less than or equal to $500: 10% discount
c. $200 or less: 5% discount
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the amount");
		
		int amt = sc.nextInt();
		
		if(amt>500) {
			double dis1 = amt*0.20;
			System.out.println("20% discount is applied 3"+ dis1);
		}
		else if (amt>200 & amt<=500) {
			double dis2 = amt*0.10;
			System.out.println("10% discount is applied " + dis2);
		}
		else  {
			double dis3 =amt*0.05;
			System.out.println("5% discount is applied " +dis3);
		}
	}

}
