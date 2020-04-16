package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapping_Example {

	public static void main(String[] args) {
		HashMap<Integer, String> HM = new HashMap();
		HM.put(null, "A");
		HM.put(2, "V");
		HM.put(3, "C");
		System.out.println(HM);
		System.out.println(HM.get(2));
		System.out.println(HM.size());
		// Value stores value along with Key
		// Converting Hashmap to Set, then converting iterator
		Iterator ITR = HM.entrySet().iterator();
		while (ITR.hasNext()) {
			// Default syntax
			Map.Entry M = (Map.Entry) ITR.next();
			// to iterate we need both key and value
			System.out.println(M.getKey());
			System.out.println(M.getValue());
			System.out.println(M.getKey() + " " + M.getValue());
		}

	}

}
