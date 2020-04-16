package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Example {

	public static void main(String[] args) {
		LinkedList<String> LL = new LinkedList<String>();
		LL.add("A");
		LL.add("B");
		LL.add("E");
		LL.add("D");
		System.out.println(LL);

		Iterator<String> itr = LL.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}

}
