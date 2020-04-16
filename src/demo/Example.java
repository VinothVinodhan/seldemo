package demo;

public class Example {

	public static void main(String[] args) {
		int k = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k++); // giving sys.print, is to print the
										// values in same line

			}
			System.out.println(); // println is for next line
		}

	}

}
