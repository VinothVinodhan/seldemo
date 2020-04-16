package demo;

import java.util.TreeSet;

public class TreeSet_Example {

	public static void main(String[] args) {
		TreeSet<String> TS = new TreeSet();
		TS.add("Z");
		TS.add("X");
		TS.add("Y");
		TS.add("Y");
		TS.addAll(null);
		System.out.println("Your output is" + TS);
		// It will sort the values in ascending order
		// Will not store duplicates

	}

}
