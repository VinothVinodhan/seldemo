package demo;

public class StringBuffer_Example {

	public static void main(String[] args) {
		StringBuffer Str1 = new StringBuffer("XXXXYY");
		System.out.println(Str1);
		// Stored value in Str1 and printed
		Str1.reverse();
		// In same Str1 we are storing its reverse value. Its Mutable
		System.out.println(Str1);

		// StringBuffer: assigned values can be changed, where as in String it
		// can't be changed.

	}

}
