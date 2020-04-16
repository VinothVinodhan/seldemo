package collections;

import java.util.TreeSet;

public class TreeSet_Example {

	public static void main(String[] args) {
		TreeSet<String> Tset = new TreeSet<String>();
		Tset.add("A");
		Tset.add("B");
		Tset.add("D");
		Tset.add("C");
		
		System.out.println(Tset);
		TreeSet<Integer> Tset1 = new TreeSet<Integer>();
		Tset1.add(1);
		Tset1.add(3);
		Tset1.add(2);
		Tset1.add(10);
		Tset1.add(0);
		Tset1.add(0);
		//Tset1.add(null);
		
		System.out.println(Tset1);
	}

}
