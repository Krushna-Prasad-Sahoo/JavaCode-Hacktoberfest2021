package practiceDemo1;

import java.util.ArrayList;

public class ArrayListTwo {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
//		this array list can contain any type of value; that's why java introduced generic's concept.
		
//		ArrayList basically give 10 slots to store Data. As soon as you put 11th element it doubles the size of array 
//		i.e of 20 size. Similarly as soon as you put 21st element, again it doubles & makes size 40. Hence it's not so
//		optimized. Also if you remove the 1st element of this , all other will be copied to the previous place.
//		For all these reasons LinkedList is better choice than Array List.

		a.add("Car");
		a.add("Bike");
		a.add("Cycle");
		a.add(100);
		a.add(555);
		a.add(44.55);
		a.add(true);
		a.add('x');
		a.add('y');

		System.out.println(a);

		Object item1 = a.get(1);
//		Object item2 = a.get(3);	// this will return a object
//		Object item3 = a.get(4);	// this will return a object  -> so integer operation can't be performed
		int item2 = (int) a.get(3); // explicitly you have to make them integer
		int item3 = (int) a.get(4); // explicitly you have to make them integer
		Object item4 = a.get(7);

		System.out.println(item2 + item3);
		// Array list is faster for retrieval but slower for data manipulation.
	}

}
