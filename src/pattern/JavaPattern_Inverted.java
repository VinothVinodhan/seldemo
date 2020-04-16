package pattern;

/* to get o/p as below
J a v a 
J a v 
J a 
J 
*/
public class JavaPattern_Inverted {

	public static void main(String[] args) {
		String s = "Java";
		char[] c = s.toCharArray();

		for (int i = c.length; i >= 0; i--) {
			// System.out.println(c[i]); // to print single letter
			for (int j = 0; j < i; j++) {
				System.out.print(c[j] + " ");
			}
			System.out.println();
		}

	}

}
