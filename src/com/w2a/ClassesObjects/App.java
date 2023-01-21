package com.w2a.ClassesObjects;

public class App {

	public static void main(String[] args) {
		Students s1 = new Students(1, "AJ");
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		
		Students s2 = new Students(2, "Shubham");
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		
		Students s3 = new Students(3, "Ajay", 45545);
		System.out.println(s3.sid);
		System.out.println(s3.sname);
		System.out.println(s3.mobileNo);
		
	}
}
