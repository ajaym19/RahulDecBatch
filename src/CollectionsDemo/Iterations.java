package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterations {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(34);
		list.add(13);
		list.add(105);
		
		System.out.println("Using for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Using Iterator");
		Iterator<Integer> it = list.iterator();
		//hasNext(): whether next element is there or no
		//next(): will access or give the next element
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Using for each");
		for(Integer a : list) {
			System.out.println(a);
		}
	}
}
