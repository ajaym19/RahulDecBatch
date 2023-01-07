package com.w2a.basics;

public class DataTypeConversion {

	/*
	 * Bucket Theory
	 * 
	 * Bucket B1: 5L
	 * Bucket B2: 3L
	 * 
	 * Task: transfer all the water from:
	 * B2 to B1: he is good, can do, no problem
	 * B1 to B2: u have a problem, contact the owner, loss of water is possible
	 * 
	 * byte << short <<int << long
	 * float << double
	 * String
	 * 
	 * 42 Cases
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		short s = 34;
		int i = s;
		System.out.println(s);
		System.out.println(i);
		
		int i2 = 23;
		short s2;
		s2 = (short) i2;
		
		System.out.println(i2);
		System.out.println(s2);
		
		
		float f1 = 23.95f;
		int i3 = (int)f1;
		System.out.println(f1); //23.34
		System.out.println(i3); //23
		
		short id;
		int sid=34;
		id = (short) sid;
		
		
		char c1 = 'A';
		int i4 = c1;
		System.out.println(c1);  //a
		System.out.println(i4); //97
		
		int i5 = 65;
		char c2 = (char)i5;
		System.out.println(i5);
		System.out.println(c2);
		
		//boolean
		
		//primitve and non primitive
		//int >> Integer
		String name = "123";
		int i6 = Integer.parseInt(name);
		System.out.println(name);
		System.out.println(i6);
		
		int i7 = 100;
		String s4 = Integer.toString(i7);
		System.out.println(i7);
		System.out.println(s4);
		
		double d3 = 45.56;
		String s5 = Double.toString(d3);
		
		//Integer, Short, Byte, Long, Float, Double, Character, Boolean
		
		
	}
	
}
