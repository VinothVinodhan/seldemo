package garbageCollector_Example;

public class GarbageCollector {
	public void finalize() {
		System.out.println("Garbage is collected");
	}
}
