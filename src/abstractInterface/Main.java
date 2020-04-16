package abstractInterface;

public class Main extends AbstractClass {

	@Override
	public void method1(int a, int b) {
		System.out.println("Int a, b:" + a + " & " + b);

	}

	@Override
	public void method2() {
		System.out.println("No parameter");

	}

	@Override
	public void method1(String a, String b) {
		System.out.println("String a,b: " + a + " & " + b);

	}

	public static void main(String args[]) {
		AbstractClass obj = new Main();
		obj.method1(1, 2);
		obj.method1("Hi", "Hello");

	}

}
