package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	/*
	 * ArrayList:
	 * is a class
	 * implementing List interface
	 * 
	 * to store multiple elements
	 * similar to array, but with dynamic size
	 * 
	 * Rules:
	 * 1. Insertion Order is maintained
	 * 2. Duplicates are allowed
	 * 3. Multiple Null values are allowed
	 * 4. Indexing is maintained
	 * 
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		System.out.println("Size is  ==>> "+list.size());
		
		list.add(23);
		list.add(20);
		list.add(02);
		list.add(42);
		list.add(42);
		list.add(null);
		list.add(null);
		System.out.println(list);
		
		System.out.println(list.get(2));
		System.out.println(list.get(1));
		
		list.set(2, 77);
		System.out.println(list);
		System.out.println("Size is  ==>> "+list.size());
		list.remove(2);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println("Size is  ==>> "+list.size());
		
		list.add(2, 101);
		System.out.println(list);
		System.out.println(list.isEmpty());
		//list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list.contains(101));
		
		//add all the elements of one list to my original list
		//assignment without using inbuilt method, use for loop
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(501);
		list1.add(502);
		list1.add(503);
		
		list.addAll(2,list1);
		System.out.println(list);
		
		//removing all the elements of another list
		list.removeAll(list1);
		System.out.println(list);
		
		/*
		 * Assignments
		 * identify max, min, avg, sum
		 * 
		 * there is a list, sort the list in ascending order
		 * 
		 */
	
		int age = 15;
		if (age>18) {
			System.out.println("Allowed to Vote");
		}else {
			System.out.println("Not allowed");
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		
		
		
	}
}
