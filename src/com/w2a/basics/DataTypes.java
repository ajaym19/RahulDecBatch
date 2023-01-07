package com.w2a.basics;

public class DataTypes {

	/*JAVA: is a case sensitive language
	 * 
	 * 
	 * Data Types:
	 * 
	 * variable: is used to store data or value
	 * Keywords: are some reserved words in JAVA
	 * 
	 * It is compulsory to define the data type of the variable
	 * 
	 * Data Type:
	 * the type of data or value which we are going to store
	 * 
	 * Types:
	 * 1. Primitive (8): 
	 * 	Integers: byte, short, int, long
	 * 	Decimal: float, double
	 * 	character: char
	 * 	yes/no: boolean
	 * 
	 * rice: 10kg
	 * sugar: 1kg
	 * 
	 * 2. Non Primitive
	 * String, Array, List, Linkedlist, Hashset
	 * 
	 */
	
	public static void main(String[] args) {
		byte b = 123; //-128 to 127
		System.out.println(b);
		
		short s = 32763; //-32768 to 32767
		System.out.println(s);
		
		int i1=1;
		int i = 4343; //-2^31 to 2^31
		System.out.println(i);
		
		long l = 44554554;
		System.out.println(l);
		
		
		float f = 45.4543543f;
		System.out.println(f);
		
		double d = 34.454546546546d;
		System.out.println(d);
		
		//character: a b c A B C 1 2 3 @ # 
		//char: always use single quotes
		char c = 'a';
		System.out.println(c);
		
		char c1 = '@';
		 System.out.println(c1);
		
		boolean isPresent = false;
		System.out.println(isPresent);
		
		//HW
		//boolean b3 = 1;
		boolean b3 = true;
		System.out.println(b3);
		
		System.out.println("Hello");
		System.out.println(c);
		
		//sequence of character is called as string
		//with String, use double quotes
		String name = "ajay";
		System.out.println(name); //ajay
		System.out.println("name"); //name
		
		//int true;
		
		
	}
}
