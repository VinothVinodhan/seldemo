package demo;

public class While_Example {

	public static void main(String[] args) {
		int W;
		W = 11;
		while (W <= 10) {
			W++;
			System.out.println("Whle condition output is " + W);
		}
		int D;
		D = 13;
		do {
			System.out.println("Do while output is " + D);
			++D;
			// if D++ is not given , then it will go infinite loop.

		} while (D <= 14);

		int i = 1;
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
	}

}
