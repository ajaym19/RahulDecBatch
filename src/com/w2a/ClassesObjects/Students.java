package com.w2a.ClassesObjects;

public class Students {

	/*
	 * Constructor:
	 * used to initialize the variables
	 * 1. Same as class Name
	 * 2. Does not return anything
	 * 3. It is not compulsory to create a constructor, there is default constructor also
	 * 4. There can be multiple constructor
	 */
	
	int sid;
	String sname;
	long mobileNo;
	String gender;
	String courseName;
	static String schoolName;
	
	
	public Students(int sid, String sname) {
		//at this place, there are 2 variables with the same name
		System.out.println(sid);
		this.sid = sid;
		this.sname = sname;
	}

	public void attendSessions() {
		System.out.println(sid);
		System.out.println("Students are attending sessions");
	}
	
	public void projectWork() {
		int i=7;
		System.out.println(sname);
		System.out.println(i);
		System.out.println("Students are working on projects");
	}
	
	public void doHomework() {
		System.out.println("Students are doing homework");
	}
	
	public void lunchTime() {
		System.out.println("Students lunch time for 1 hour");
	}
	
	public static void main(String[] args) {
		//Create an object
		//class_name ref_var_name = new_keyword constructor_call();
		Students s1 = new Students();
		s1.sid = 1;
		s1.sname = "Ankit";
		//s1.schoolName = "W2A"; not recommended
		Students.schoolName = "W2A";
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.schoolName); //w2a
		System.out.println(Students.schoolName); //w2a
		
		Students s2 = new Students();
		s2.sid = 2;
		s2.sname = "Deepak";
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.schoolName); //
		
		
		
		System.out.println(Test.collegeName);
		Test.m2();
		
		Test.notice();
		Test.printCollegeName();
		Test obj = new Test();
		obj.printId();

		
		
	}
	
}
