package com.CoreJava.Day2;

public class OperatorsInJava {

	public static void main(String[] args) {
		
		System.out.println("*****************Arithmatic Operators************");
		
		int a =20, b=10;
		System.out.println("Addition is: " + (a+b));
		System.out.println("Sustraction is: " + (a-b));
		System.out.println("Dividation is: " + (a/b));
		System.out.println("Multiplication is: " + (a*b));
		System.out.println("Modulus is: " + (a%b));
		
		
		
		//Unary Operators
		/*
		 * ++ Increment
		 * -- Decrement
		 * a=73
		 * a++ (Post Increment)
		 * a-- (Pre Increment)
		 * 
		 * a++ = a=a+1
		 */
		
		int a1 =100;
		System.out.println(a1);
		System.err.println(a1++);
		System.out.println(a1);
		
		int b1=100;
		int c1= b1++;
		System.out.println(b1);
		System.out.println(c1);

		int b2=678;
		int c2= b2++;
		System.out.println(b2);
		System.out.println(c2);
		
		int b3= 58;
		int c3 = ++b3;
		System.out.println(b3);
		System.out.println(c3);
		
		int k= 89;
		int y= k++;
		System.out.println(y);
		System.out.println(k);
		
		
		int h= 3879;
		int j= ++h;
		System.out.println(h);
		System.out.println(j);
	 
		
		System.out.println("**************Relational Operator****************");
		
	 int o=29;
	 int t=29;
	 int u=44;
	 int q=77;
	 int i1=91;
	 int i2=91;
		System.out.println("Less Than<: " + (u<i1)); //true
		System.out.println("Grater Than<: " + (i2<t)); //false
		System.out.println("Grater Than Equal To : " + (i1>=i2)); //true
		System.out.println("Less Than Equal To : " + (i1<=i2)); //true
		System.out.println(i1!=i2); //false
		System.out.println(i1==i2); //true
		
	}

}
