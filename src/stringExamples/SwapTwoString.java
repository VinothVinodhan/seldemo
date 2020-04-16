package stringExamples;

public class SwapTwoString {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Program";
		// before swapping
		System.out.println("Before swapping 1: " + str1);
		System.out.println("Before swapping 2: " + str2);
		// Swapping stars
		str1 = str1 + str2;
		System.out.println(str1);
		System.out.println(str1.length()); // O/P is 11
		Integer i = str1.length() - str2.length();
		System.out.println(i); // O/P is 4
		str2 = str1.substring(0, str1.length() - str2.length());
		System.out.println(str2.length());// O/P s 4
		str1 = str1.substring(str2.length());
		System.out.println("After swapping str1: " + str1);
		System.out.println("After swapping str2: " + str2);

	}

}
