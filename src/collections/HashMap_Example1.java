package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Example1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "A");
		hm.put(0, "B");
		hm.put(null, "D");
		hm.put(1, "C");
		System.out.println(hm);
		// Output = {0=B, null=D, 1=C}
		// Converting Hashmap to Set, then converting iterator
		Iterator itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			// Default syntax
			Map.Entry M = (Map.Entry) itr.next();
			System.out.println("Key is: " + M.getKey() + " & Value is " + M.getValue());

		}

	}

}
