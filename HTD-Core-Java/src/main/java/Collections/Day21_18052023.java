package Collections;

import java.util.ArrayList;

public class Day21_18052023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Add
		ArrayList al = new ArrayList();
		al.add("Kohhx");
		al.add(100);
		al.add('z');
		al.add(0, "Singapore");
		System.out.println(al);

		// AddAll
		ArrayList al2 = new ArrayList();
		al2.add("apple");
		al2.add("orange");
		al2.add("pear");
		al.addAll(al2);
		System.out.println(al);
		ArrayList al3 = new ArrayList();
		al3.add("sabrina");
		al3.add(0.45);
		al.addAll(1, al3);
		System.out.println(al);

		// remove by index
		al.remove(3);
		System.out.println(al);
		// Remove by element
		al.remove("sabrina");
		System.out.println(al);

		// Remove a collection (All)
		al.removeAll(al2);
		System.out.println(al);

		// Clear
//		al.clear();
//		System.out.println(al);
//		
		// Retain all
		ArrayList al4 = new ArrayList();
		al4.add("pikachu");
		al4.add("charmander");
		al.addAll(3, al4);
		System.out.println(al);
		al.retainAll(al4);
		System.out.println(al);

		System.out.println(al.isEmpty());
		System.out.println(al.size());

	}

}
