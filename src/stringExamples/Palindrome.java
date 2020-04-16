package stringExamples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		String S = SC.nextLine();
		System.out.println("given string is: "+S);
		StringBuffer SB = new StringBuffer(S);
		String b = SB.reverse().toString();
		System.out.println("Reverse of: "+b);
		if (S.equalsIgnoreCase(b)) {
			System.out.println("Given string is Palindrome");
		}
		else{
			System.out.println("Not Palind");
		}

	}

}
