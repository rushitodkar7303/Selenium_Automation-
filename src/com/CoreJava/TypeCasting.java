package com.CoreJava;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Type of Casting:
		    1. Primitive to Primitive
		        a.Implicit casting (Automatic casting by JVM)
		        b.Explicit casting (Force Full)   
			2.Object to Primitive:
			3.Primitive to Object: 
			
			*/
		
		//Implicit casting : small size data you can convert into large size
		//byte-->short-->char-->int-->long-->float-->double
		
		byte b1= 90;
		int i1= b1;
		System.out.println("Byte to int conversion:  " + i1);
		
		int i2 =900;
		float f1= i2;
		System.out.println("int to float conversion: " + f1);
		
		int i3 = 1245678398;
		long l1=i3;
		System.out.println("int to long conversion: " + l1);
		
		char ch = 'A';
		int i4= ch;
		System.out.println("char to int conversion: " + i4);
			
		long l4=2345678L;
		float f4=l4;
		System.out.println("long to float conversion: " + f4);
		
		
		System.out.println("********************************************************************************************");
		
		//Explicit  casting () :  large size data you can convert into small size
		
		long l6 = 1234567L;
		int i8=(int) l6;
		System.out.println("Long to int conversion: " + i8);
		
		int i7= 99;
		char ch2=(char) i7;
		System.out.println("int to char explicit conversion: "+ ch2);
		
		double d1 = 89098.098;
		int i6 = (int) d1;
		System.out.println("doube to int conversion: "+ i6 );
	}

}
