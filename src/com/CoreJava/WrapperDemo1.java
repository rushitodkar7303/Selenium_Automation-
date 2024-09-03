package com.CoreJava;

public class WrapperDemo1 {

	public static void main(String[] args) {

		/*
		 * Primitive ---> Object ====> Autoboxing Object ---> Primitive ===> Unboxing
		 * 
		 */

//		Primitive  ---> Object ====> Autoboxing
		int x = 90;
		Integer obj1 = Integer.valueOf(x);
		System.out.println(obj1);
		System.out.println("Value of object as int: " + obj1.intValue());

		double d = 7303.7303;
		Double obj2 = Double.valueOf(d);
		System.out.println(obj2);
		System.out.println("Value of object as double: " + obj2.intValue());

//		Object ---> Primitive ===> Unboxing

		Integer i = 100;
		int a = i.intValue();
		System.out.println("Object to Primitive: "+a);
		
		Float f1= 22.02F;
		Float f= f1.floatValue();
		System.out.println("Object to Primitive: "+ f);
		}

}
