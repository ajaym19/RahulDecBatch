package com.w2a.basics;

public class LoopingDemo {

	public static void main(String[] args) {
		
		int id = 2;
		System.out.println(id);
		int j = ++id;
		System.out.println(j);
		System.out.println(id);
		
		int k=4;
		k = k+1;
		System.out.println(k);
		
		System.out.println("FOr Loop");
		//print numbers from 1 to 10
		for (int i = 10; i >= 1 ;  i-- ) {
			//1, 2, 3......10, 11
			System.out.println(i);
		}
		System.out.println("-----------------");
		int z = 5;
		System.out.println(z);
		z += 1;
		
		System.out.println(z);
		
		//while loop, condition is checked first
		int counter = 12;
		while(counter <= 10) {
			System.out.println("AJay");
			counter++;
		}
		
		//do while loop, first statement is executed, then condition is checked
		System.out.println("Do while loop");
		int number=12;
		do {
			System.out.println("Menu Card");
			number++;
		} while (number<=10);
		
		//= and ==
		//Conditional Statements
		//age more than 18 to be allowed to vote
		
		int age = 12;
		if(age >= 18) {
			System.out.println("Allowed to Vote");
		}else {
			System.out.println("Not allowed to Vote");
		}
		
		
		/*
		 * Marks
		 * 0 to 34: Fail
		 * 35 to 59: Grade C
		 * 60 to 74: Grade B
		 * 75 to 100: Grade A
		 */
		int marks = -12;
		if (marks > 0 && marks < 34) {
			System.out.println("Fail");
		} else if (marks > 34 && marks < 60 ) {
			System.out.println("Grade C");
		} else if (marks > 59 && marks < 75) {
			System.out.println("Grade B");
		} else if(marks > 75 && marks <= 100){
			System.out.println("Grade A");
		} else {
			System.out.println("Please specify marks within 1 to 100");
		}
		
		//Assignment: 
		/*
		 * print day name based on day number
		 * int day = 3;
		 * print day name based on the day
		 * Start from Monday = 1,
		 */
		
		int day = 12;
		if (day == 1) {
			System.out.println("This is monday");
		} else if (day == 2) {
			System.out.println("This is tuesday");
		} else if (day == 3) {
			System.out.println("This is wednesday");
		} else if (day == 4) {
			System.out.println("This is thursday");
		} else if (day == 5) {
			System.out.println("This is friday");
		} else if (day == 6) {
			System.out.println("This is Saturday");
		} else if (day == 7) {

			System.out.println("This is Sunday");
		} else {

			System.out.println("Please Enter the correct value");
		}
		
		
		//Switch
		int dday = 2;
		switch (dday) {
		case 1:
			System.out.println("This is monday");
			break;
		case 2:
			System.out.println("This is Tuesday");
			break;
		case 3:
			System.out.println("This is wednesday");
			break;
		case 4:
			System.out.println("This is thursday");
			break;
		case 5:
			System.out.println("This is friday");
			break;
		case 6:
			System.out.println("This is saturday");
			break;
		case 7:
			System.out.println("This is sunday");
			break;
		default:
			System.out.println("Please Enter the correct value");
			break;
		}
		
		
	}

}
