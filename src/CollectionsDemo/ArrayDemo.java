package CollectionsDemo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {
	
	public static void main(String[] args) {
		/*
		 * Array:
		 * used to store multiple elements of similar data type
		 * 
		 * 3 parts
		 * 1. Declaration
		 * 2. Instantiation
		 * 3. Initialization
		 * 
		 * Rules:
		 * 1. While instantiating, it is compulsory to define the size of an array
		 * 2. Elements are stored in contagious memory location
		 * 3. Indexing is maintained
		 * 4. All the elements are initialized by default to 0 or null
		 * 5. Duplicate elements are allowed
		 */
		
		int[] id;
	//	int a[];
		
		id = new int[5];
		
		id[0] = 5;
		id[2] = 25;
		//last index = size -1
		System.out.println(id[0]);
		System.out.println(id[1]); //
		System.out.println(id[2]); //
		System.out.println(id[3]); //
		System.out.println(id[4]); //
		System.out.println(id);
		System.out.println("Length of Array is ==> "+ id.length);
		
	//	System.out.println(id[5]); 
		
		for (int i = 0; i < id.length; i++) {
			System.out.println(id[i]);
		}
		
		//create an array of size 10
		//add value as 1, 2, 3, 4...10
		//add value as 10, 20, 30...100
		//identify the maximum, minimum, sum and average
		
		for (int i = 0; i < id.length; i++) {
			id[i] = 12;
		}
		System.out.println("Printing again");
		for (int i = 0; i < id.length; i++) {
			System.out.println(id[i]);
		}
		
		//Dec + Inst
		int[] a = new int[5];
		
		//Dec + Inst + Init
		int[] b = {10, 30, 20};
		System.out.println(b.length);
		

	}

}
