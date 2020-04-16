package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_Example {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(10);

		System.out.println("Initial arraylist: " + list);
		list.add(2, 30);// Adding values in particular index position
		System.out.println("Adding values in 2nd index position: " + list);
		list.set(0, 40); // setting 0th index value to 40
		System.out.println("setting 0th index value to 40: " + list);
		list.add(1, 50);// Inserting a value at 1st index position
		System.out.println("Inserting a value at 1st index position: " + list);
		list.remove(1); // Removing 1st index value
		System.out.println("Removing 1st index value: " + list);
		list.add(null);
		System.out.println(list);
		System.out.println(list.indexOf(null));

		ArrayList<String> Stringlist = new ArrayList<String>();
		Stringlist.add("a");
		Stringlist.add("h");
		Stringlist.add("e");
		Stringlist.add("c");
		System.out.println(" Output is" + Stringlist);

		// Linked List
		LinkedList<String> LL = new LinkedList<String>();
		LL.add("Hello");
		LL.add("How");
		System.out.println(LL);
	}

}
