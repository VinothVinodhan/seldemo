package stringExamples;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		String str1 = "2015";
		// if we give value to any string example, Str1 = "java", we will get java.lang.NumberFormatException
		Integer i = Integer.valueOf(str1);
		System.out.println(i);

	}

}
