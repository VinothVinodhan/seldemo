package pattern;

/* to get o/p as below
0 
0 1 
0 1 2 
0 1 2 3 
0 1 2 3 4 
0 1 2 3 4 5 
0 1 2 3 4 
0 1 2 3 
0 1 2 
0 1 
0   
*/
public class Pyramid_Inverted {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
		for (int i = n; i >= 0; i--) {
			// for (int j = 0; j <= i; j++)
			// If we give j<=i then our o/p will have 012345 as well
			for (int j = 0; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
