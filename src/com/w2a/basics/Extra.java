package com.w2a.basics;

import FileHandlingExceptionHandling.ExcelReader;

public class Extra {
	static ExcelReader obj;

	public static void main(String[] args) {
		printArray(new int[] {1,2,3});
		System.out.println(obj);
		
		int[] arr = new int[5];
		arr[0] = 20;
		for (int i : arr) {
			System.out.println(i);
		}
		
		Integer[] abc = new Integer[5];
		abc[0] = 70;
		for (Integer x : abc) {
			System.out.println(x);
		}
	}
	
	public static void printArray(int[] a) {
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	
	
	
	
	
	
	
}
