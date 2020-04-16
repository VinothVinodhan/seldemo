package garbageCollector_Example;

public class GarbageCollector_Main {

	public static void main(String[] args) {
		GarbageCollector obj = new GarbageCollector();
		GarbageCollector obj1 = new GarbageCollector();
		obj = null; // Nulling ref
		obj1 = null;
		obj = obj1; // assigning ref to another
		// Garbage collector method
		System.gc();
		

	}

}
