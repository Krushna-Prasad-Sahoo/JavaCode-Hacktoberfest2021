package practiceDemo1;

import java.util.LinkedList;

public class LinkedListOne {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		
//		LinkedList is more dynamic & better way to store data than ArrayList. 
// 		LinkedList uses doubly linked list data structure.
		ll.add(1);
		ll.add(5);
		ll.add(90);
		ll.add(399);
		System.out.println(ll);

		int item1 = ll.get(0);
		int item2 = ll.get(1);
		int item3 = ll.get(3);
		System.out.println(item1 + item2 + item3);
		
		System.out.println("------------------------");
		
		for(int num : ll) {
			System.out.println(num);
			
			// Array list is faster for retrieval but slower for data manipulation.
			// LinkedList is faster for data manipulation but slower for retrieval.
		}

		
	}

}
