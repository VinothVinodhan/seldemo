package interface_example;

public interface Interface_Example {

	/**
	 * The Java compiler adds public and abstract keywords before the interface
	 * method.
	 * public abstract void interfaceMethod();
	 */
	void interfaceMethod();

	// It adds public, static and final keywords before data members.
	// public static final int a = 1
	int a = 1;

	public void add(int x, int y);

	public void multi(int a, int b);

	public void show(int a, int b);

}
