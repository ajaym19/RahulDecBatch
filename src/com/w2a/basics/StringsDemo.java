package com.w2a.basics;

import InheritanceDemo.Students;

public class StringsDemo {

	/*
	 * String:
	 * is a non primitive data type
	 * 
	 * Rules:
	 * string objects are immutable
	 * 
	 * Usage:
	 * 1. String Literal
	 * 		objects are created inside SCP
	 * 		new object is not created if an object with the same value is present in SCP
	 * 2. new keyword
	 * 		objects are created inside heap memory
	 * 		everytime new object is created, irrespective of the value
	 * 
	 * final keyword as an assignment
	 * 
	 */
	
	public static void main(String[] args) {
		//String Literal
		String name = "Ajay";
		System.out.println(name); //Ajay
		name = name.concat("Trainer");
		System.out.println(name); //Ajay
		String empName = "Ajay";
		
		//new keyword
		String s1 = new String("Hello");
		System.out.println(s1);
		String s2 = new String("Java");
		System.out.println(s2);
		String s3 = new String("Hello");
		System.out.println(s3);
		s1 = s1.concat("India");
		System.out.println(s1);
		
		//String Buffer and SB
		//.equals and ==
		
		
		
	}
}
