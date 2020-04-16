package array;

public class Duplicate {

	public static void main(String[] args) {
		int a[] = { 1, 2,2, 4, 5, 3, 3 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if ((a[i] == a[j])) {
					System.out.println("Duplicate number is: " + a[i]);

				}

			}
		}

	}

}
