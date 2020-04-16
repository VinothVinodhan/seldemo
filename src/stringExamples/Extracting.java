package stringExamples;

public class Extracting {

	public static void main(String[] args) {
		String S1 = "a1d3g5h6j9";
		String S2 = S1.replaceAll("[^0-9]","");
		System.out.println(S2);
		// O/P: 13569
		String S3 = S1.replaceAll("[^a-z]","");
		System.out.println(S3);
		// O/P: adghj
	}

}
