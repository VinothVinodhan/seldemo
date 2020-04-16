package fundamentals;

public class StaticBlock_Example {
	static int a, b;
	static String x, y;
	static {
		a = 1;
		x = "hello";
	}
	static {
		b = 5;
		y = "hi";
	}

	public static void main(String[] args) {
		System.out.println(a + "&" + x + "&" + b + "&" + y);

	}

}

// Used for static initializations of class
// code inside static block gets executed only once
// static block gets executed before constructor
// block get executed when class is loaded in memory
// Multiple blocks executed by the written order