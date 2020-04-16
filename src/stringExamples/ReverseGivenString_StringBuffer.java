package stringExamples;

import java.util.Scanner;

public class ReverseGivenString_StringBuffer {

	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		StringBuffer string = new StringBuffer(sc.nextLine());
		System.out.println(string);
		StringBuffer string1 = string.reverse();
		System.out.println(string1);

	}

}
