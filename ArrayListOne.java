package practiceDemo1;

import java.util.ArrayList;

import javax.xml.crypto.Data;

public class ArrayListOne {

	public static void main(String[] args) {

		ArrayList w = new ArrayList();
		
//		ArrayList basically give 10 slots to store Data. As soon as you put 11th element it doubles the size of array 
//		i.e of 20 size. Similarly as soon as you put 21st element, again it doubles & makes size 40. Hence it's not so
//		optimized. Also if you remove the 1st element of this , all other will be copied to the previous place.
//		For all these reasons LinkedList is better choice than Array List.

		w.add("hello");
		w.add("there");
		w.add("java");
		System.out.println(w);
		
		w.remove(1);
		System.out.println(w);
//-----------------------------------------------------------------------------------------------
		String item1 = (String) w.get(1);
		System.out.println(item1);
		
		Object item2 = w.get(0);
		System.out.println(item2);
		
// Array list is faster for retrieval but slower for data manipulation.
		
		

	}

}
