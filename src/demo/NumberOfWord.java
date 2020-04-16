package demo;

public class NumberOfWord {

	public static void main(String[] args) {
		String s = "welcome to candid java tutorial";

		int count = 1;

		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') ) {
				count++;
//&& (s.charAt(i + 1) != ' ')
			}
		}
		System.out.println("Number of words in a string = " + count);

	}

}
