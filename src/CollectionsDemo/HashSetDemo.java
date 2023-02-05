package CollectionsDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	/*
	 * HashSet
	 * class implementing Set Interface
	 * 
	 * Rules:
	 * 1. Indexing is not maintained
	 * 2. Getters and Setters is not available
	 * 3. Duplicates are not allowed
	 */
	
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(23);
		set.add(45);
		set.add(34);
		set.add(88);
		set.add(102);
		//set.add("Hello");
		System.out.println(set);
		set.add(102);
		System.out.println(set);
		
		System.out.println(set.contains(102));
		set.remove(88);
		System.out.println(set);
		
		HashSet<String> fruits = new HashSet<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		System.out.println(fruits);
		
		System.out.println(set.size());
		
		/*
		 * ArrayList having duplicates
		 * remove duplicate values
		 * 
		 */
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(101);
		list.add(201);
		list.add(101);
		list.add(345);
		list.add(88);
		list.add(88);
		System.out.println(list);
		
		HashSet<Integer> s1 = new HashSet<>(list);
		System.out.println(s1);
		
		
		
	}
}
