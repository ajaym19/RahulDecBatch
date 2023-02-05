package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	/*
	 * HashMap
	 * it is not a part of Collection framework
	 * it is a class implementing Map Interface
	 * 
	 * elements are stored in the form of key and value pair
	 * A pair is also called as bucket or Entry
	 * Multiple entries together is called as EntrySet
	 * 
	 * Rules:
	 * 1. Duplicate values are allowed
	 * 2. Multiple null values are allowed
	 * 3. Duplicate key is not allowed, if you add, it will work as an Update
	 * 4. Only one null key is allowed
	 */
	
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Ajay");
		map.put(0, "Ankit");
		map.put(3, "Nikita");
		System.out.println(map);
		map.put(4, "Nikita");
		System.out.println(map);
		map.put(55, null);
		map.put(6, null);
		System.out.println(map);
		map.put(2, "Vijay");
		map.put(null, "Rajeev");
		map.put(null, "Jyothi");
		System.out.println(map);
		
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("Ankit"));
		map.entrySet();
	    Set<Integer> keys = map.keySet();
		System.out.println(map.keySet());
		map.remove(3);
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map);
		System.out.println(map.entrySet());

		for (Map.Entry<Integer, String> abc : map.entrySet()) {
			System.out.println("Key is : "+abc.getKey()+" Value is : "+abc.getValue());
			
		}
		
		map.putIfAbsent(1, "Shweta");
		map.putIfAbsent(11, "Apple");
		
		System.out.println(map);
	}
}
