package stringExamples;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		String s = "Java is Java again Java";
		System.out.println(s.length());
		int count = s.length() - s.replace("a", "").length();
		System.out.println(count);

		String b = "Java Java";
		int len = b.length();
		System.out.println("Total length is " + len);
		int length = b.replace("a", "").length();
		System.out.println("After replace " + length);
		int result = len - length;
		System.out.println("Result is " + result);
	}

}
