package stringExamples;

import java.util.Scanner;

public class NumberOfWordsInGivenString {

	public static void main(String[] args) {

		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 1;
		for (int i = 0; i <= s.length() - 1; i++) {
			if ((s.charAt(i) == ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}

}
