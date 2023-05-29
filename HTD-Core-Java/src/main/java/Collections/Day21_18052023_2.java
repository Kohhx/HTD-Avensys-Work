package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day21_18052023_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Creating ArrayList");
		System.out.println("========================");
		ArrayList al = new ArrayList();
		al.add("apple");
		al.add("orange");
		al.add("banana");
		al.add("grapes");
		al.add(100);
		al.add(99);
		al.add("apple");
		al.add("Java");
		al.add("Ruby");
		al.add("Angular");
		System.out.println(al);
		System.out.println();

		System.out.println("Arraylist Methods");
		System.out.println("========================");
		System.out.println(al.contains("Ruby"));
		System.out.println("************************");
		System.out.println(al.indexOf("grapes"));
		System.out.println("************************");
		System.out.println(al.get(7));
		System.out.println("************************");
		System.out.println(al.lastIndexOf("apple"));
		System.out.println("************************");
		ArrayList al2 = (ArrayList) al.clone();
		System.out.println(al2);
		System.out.println();
		System.out.println("================================================================\n");
		System.out.println("Creating LinkedList");
		System.out.println("========================");
		LinkedList ll = new LinkedList();
		ll.addAll(al);
		System.out.println(ll);
		System.out.println();

		System.out.println("Linkedlist Methods");
		System.out.println("========================");
		System.out.println(ll.getLast());
		System.out.println("************************");
		ll.push("GoLang");
		System.out.println(ll);
		System.out.println("************************");
		System.out.println(ll.pop());
		System.out.println("************************");
		System.out.println(ll.equals(al));
		System.out.println("************************");
		ll.set(5, "JAVASCRIPT");
		System.out.println(ll);
		System.out.println("************************");

	}

}
