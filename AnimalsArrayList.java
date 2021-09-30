package practiceDemo1;

import java.util.ArrayList;

public class AnimalsArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Lion");
		animals.add("tiger");
		animals.add("jaguar");
		animals.add("Leopard");
		animals.add("elephant");
		
		System.out.println("All the animals are ... ");
		for (int i=0; i<animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		System.out.println("--------------------------------");
		
		for (String anm : animals) {
			System.out.println(anm);
		}
	}

}
