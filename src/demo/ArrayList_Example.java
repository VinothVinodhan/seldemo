package demo;

import java.util.ArrayList;
import java.util.Iterator;
// In ArrayList elements are positioned according to Zero-based index
// Elements are inserted from Index 0
// Default initial capacity of an Array list is 10
// It increases automatically as we add more to arraylist
public class ArrayList_Example {

	public static void main(String[] args) {

		ArrayList<String> AL = new ArrayList();
		int length = AL.size();

		AL.add("Chennai");
		AL.add("Velachery");
		System.out.println(AL);

		// updating particular index value
		AL.set(1, "Besant");
		System.out.println("Updating 1st index" + AL);

		// Adding new value
		AL.add(1, "Gundy");
		System.out.println("Adding value at 1st index" + AL);

		// Delete
		AL.remove(2);
		System.out.println("Removing 2nd index value" + AL);

		// Size of
		AL.size();
		System.out.println("Total size" + AL);

		// Getting index of particular value
		// if we give the value which is not there in the list, it will give
		// -1
		System.out.println(AL.indexOf("aa"));
		System.out.println(AL.indexOf("Velachery"));

		// normal for loop
		/*for (int i = 0; i < length; i++) {
			System.out.println(AL.get(i));
		}
		*/
		//Advanced For loop
		/*for (String a : AL) {
			System.out.println(a);

		}
		*/
		//While loop
		/*
		int i=0;
		while(i<length){
			System.out.println(AL.get(i));
		}
		*/
		// Iterator
		// hasNext will check next value, if its there it will go to loop, ot will get out from t
		Iterator <String> itr = AL.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
	
}