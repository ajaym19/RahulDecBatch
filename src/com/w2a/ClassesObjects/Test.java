package com.w2a.ClassesObjects;

public class Test {

	int id;
	int batch;
	static String collegeName = "IIM";
	
	public void m1() {
		int a = 0;
		System.out.println(a);
		System.out.println(id); //
	}
	
	public static void main(String[] args) {
		Test obj = new Test();
		obj.m1();
		notice();
	}
	
	public static void m2() {
		//System.out.println(id);
		//m1();
		notice();
	}
	
	public static void notice() {
		System.out.println("This is a simple notice");
	}
	
	public static void printCollegeName() {
		System.out.println(collegeName);
	}
	
	public void printId() {
		System.out.println(id);
		System.out.println(collegeName);
		notice();
		m1();
	}
	
	
	
	
}
