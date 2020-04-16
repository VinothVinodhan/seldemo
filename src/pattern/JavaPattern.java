package pattern;

public class JavaPattern {

	public static void main(String[] args) {
		String s = "java";
		char[] a = s.toCharArray();
		System.out.println(a); // output is java
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println(); // printing next line
			// if not given output will be in single line
		}
	}
}
