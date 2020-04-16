package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapping_Example {

	public static void main(String[] args) {
		// Diclaring HashMap
		// import java.util.HashMap;
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		// Adding elements to HashMap
		hmap.put(0, "A");
		hmap.put(2, "B");
		hmap.put(1, "C");
		hmap.put(null, "D");
		hmap.put(null, "E");

		System.out.println(hmap); // O/P: {0=A, 1=B, 2=C, 3=D}
		System.out.println(hmap.get(2)); // O/P: C
		System.out.println(hmap.size()); // O/P: 4

		// Display the content using Iterator
		// Converting Hashmap to Set, then converting iterator
		Iterator ITR = hmap.entrySet().iterator();
		while (ITR.hasNext()) {
			// Default syntax
			Map.Entry M = (Map.Entry) ITR.next();
			System.out.println("Key is: " + M.getKey() + " & Value is " + M.getValue());
		}
		String var = hmap.get(2);
		System.out.println(var); // O/P: C
		hmap.remove(3);
		System.out.println("After removing 3rd index" + hmap); // O/P: {0=A,
																// 1=B, 2=C}

		// After removing to show all var, just copy pasting above While loop
		Iterator ITR1 = hmap.entrySet().iterator();
		System.out.println("Map Key  Value after removal");
		while (ITR1.hasNext()) {
			// Default syntax
			Map.Entry M1 = (Map.Entry) ITR1.next();
			System.out.println("Key is: " + M1.getKey() + " & Value is " + M1.getValue());
		}
	}

}
