package interface_example;

public class MainClass implements Interface_Example, Interface_Example2 {

	@Override
	public void add(int x, int y) {
		int z = x + y;
		System.out.println("add is : " + x);

	}

	@Override
	public void multi(int a, int b) {
		int c = a * b;
		System.out.println("Multi is : " + c);

	}

	@Override
	public void show(int a, int b) {
		System.out.println(a + "," + b);

	}

	public static void main(String[] args) {

		Interface_Example2 obj1 = new MainClass();
		obj1.add(1, 2);
		obj1.show(1, 2);

	}

}
