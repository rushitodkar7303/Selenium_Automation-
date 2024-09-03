package com.CoreJava;

public class WrapperDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "100";
		System.out.println(300 + s1);

		// int
		int i1 = Integer.parseInt(s1);
		System.out.println(i1 + 300);
		System.out.println("****************************");

		String s2 = "7303.90F";
		System.out.println(s2 + 200);
		float f2 = Float.parseFloat(s2);
		System.out.println(f2 + 202F);
		
		System.out.println("****************************");

		String s3 ="Zero";
		char ch =s3.charAt(2);
		System.out.println(ch);

		System.out.println("****************************");
		
		//int ---> String
		
		int x =90;
		System.out.println(x+10);
		String ss1 = String.valueOf(x);
		System.out.println(ss1+10);
	}

}
