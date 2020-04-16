package fundamentals;

public class ThrowExample {
	void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not voting");
		} else {
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		ThrowExample obj = new ThrowExample();
		obj.checkAge(17);
		System.out.println("End pgm");
	}

}
