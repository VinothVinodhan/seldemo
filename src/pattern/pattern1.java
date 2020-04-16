package pattern;

public class pattern1 {

	public static void main(String args[]) {
		// number of rows
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}