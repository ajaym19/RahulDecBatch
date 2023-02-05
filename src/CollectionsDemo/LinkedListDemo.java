package CollectionsDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(101);
		list.add(78);
		list.add(92);
		list.add(92);
		list.add(null);
		System.out.println(list);
		System.out.println(list.get(1));
		list.remove(4);
		System.out.println(list);
		list.set(1, 178);
		System.out.println(list);
		
		list.addFirst(501);
		list.addLast(1001);
		list.removeFirst();
		
		System.out.println(list);
		
	}
}
