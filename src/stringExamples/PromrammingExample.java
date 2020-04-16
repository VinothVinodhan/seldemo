package stringExamples;

/* to get o/p as below
J 
J a 
J a v 
J a v a 
*/
public class PromrammingExample {

	public static void main(String[] args) {
		String s = "Java";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			// System.out.println(c[i]); // to print single letter
			for (int j = 0; j <= i; j++) {
				System.out.print(c[j] + " ");
			}
			System.out.println();
		}

	}

}
