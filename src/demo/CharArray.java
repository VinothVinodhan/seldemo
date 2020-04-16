package demo;

public class CharArray {

	public static void main(String[] args) {
		// this pgm is to find out how many same letters present in the string
		String x = "java java";

		// using string method concept
		int len = x.length();
		System.out.println("Total count " + len);
		int length = x.replace("j", "").length();
		System.out.println("Total count " + length);
		int count = len - length;
		System.out.println("After replacement " + count);
		
		// using if char[] arrary
		

	}

}
