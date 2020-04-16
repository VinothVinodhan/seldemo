package stringExamples;

public class ReverseTheString {

	public static void main(String[] args) {
		String S = "ManualTesting";
		char[] a = S.toCharArray();
		// below code is to print given string
		for (int i = 0; i < S.length(); i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		// below code is to reverse
		for (int b = S.length() - 1; b >= 0; b--) {
			System.out.print(a[b]);
		}

	}

}
