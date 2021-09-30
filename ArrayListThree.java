package practiceDemo1;

import java.util.ArrayList;

public class ArrayListThree {

//	enforced to store only specific data type;

	public static void main(String[] args) {

		ArrayList<String> ab = new ArrayList<String>();
//		ArrayList basically give 10 slots to store Data. As soon as you put 11th element it doubles the size of array 
//		i.e of 20 size. Similarly as soon as you put 21st element, again it doubles & makes size 40. Hence it's not so
//		optimized. Also if you remove the 1st element of this , all other will be copied to the previous place.
//		For all these reasons LinkedList is better choice than Array List.

		ab.add("Hello");
		ab.add("There");
		ab.add("Guys !!");

		System.out.println(ab);

		for (int i = 0; i < 3; i++) {
			System.out.println(ab.get(i));
			// Array list is faster for retrieval but slower for data manipulation.
		}

	}

}
