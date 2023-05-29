package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add("100");
		ll.add("Kohhx");
		ll.add(true);
		ll.add("Kohhx");
		System.out.println(ll);
		ll.add(2, "Sabrina");
		System.out.println(ll);

		LinkedList ll2 = new LinkedList();
		ll2.add("pikachu");
		ll2.add("charmander");

		ll.addAll(ll2);
		System.out.println(ll);
		ll.addAll(0, ll2);
		System.out.println(ll);

		ll.addFirst("JAVA");
		System.out.println(ll);

		ll.addLast("Javascript");
		System.out.println(ll);

		ll.remove("Kohhx");
		System.out.println(ll);
//
		ll.removeAll(ll2);
		System.out.println(ll);

		System.out.println(ll);

		ll.remove(0);
		System.out.println(ll);

		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

		ll.add(1, "Kohhx");

		ll.add(3, "Kohhx");

		ll.add(4, "Kohhx");

		System.out.println(ll);

		ll.removeFirstOccurrence("Kohhx");
		System.out.println(ll);

		ll.removeLastOccurrence("Kohhx");
		System.out.println(ll);

		// Remove all occurences
		ll.removeAll(List.of("Kohhx"));
		System.out.println(ll);

//		ll.remove("Kohhx");
//		System.out.println(ll);

	}

}
