package stringExamples;

public class NumberOfWords {

	public static void main(String[] args) {
		String sentence = "This is manual Testing";
		System.out.println(sentence.length());
		// as we know there are 3 space, so we start count with 1.
		// If we give count 0, then we will get 3 as an answer
		int count = 1;
		for (int i = 0; i <= sentence.length() - 1; i++) {
			if ((sentence.charAt(i) == ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}

}
