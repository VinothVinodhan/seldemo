package fundamentals;

public class ThrowsExample {
	int division(int a, int b) {
		int t = a / b;
		return t;
	}

	public static void main(String[] args) {
		ThrowsExample obj = new ThrowsExample();
		try {
			System.out.println("End of pgm try " + obj.division(1, 2));

		} catch (ArithmeticException e) {
			System.out.println("End of pgm catch");
		}
	}
}
