package demo;

public class String_Example {

	public static void main(String[] args) {

		String str = "JaVa";
		// String = "java"
		System.out.println(str);
		String str1 = "Selenium";
		System.out.println(str1);

		// converting upper class
		String str3 = str.toUpperCase();
		System.out.println(str3);

		// converting to lowercase
		String str4 = str3.toLowerCase();
		System.out.println(str4);

		// finding length of str1
		// length is int value
		int L = str1.length();
		System.out.println(L);

		// comparing
		// gives result as True (or) False
		System.out.println(str.equals(str3));
		System.out.println(str.equalsIgnoreCase(str3));

		// compareTo
		// gives output as value
		// if output is 0 then its true (Equle)
		// if some value comes, then its false (Not equal)
		System.out.println(str.compareTo(str3));
		System.out.println(str.compareToIgnoreCase(str3));

		// Concatenation
		System.out.println(str + " is " + str1);
		System.out.println(str + " " + "is" + " " + str1);

		// Replace
		System.out.println(str.replace("JaVa", "JaVA"));
		System.out.println(str);

		// substring
		// str1 = "Selenium";
		// substring(beginIndex, endIndex)
		
		System.out.println(str1.substring(3, 6));
		// substring(beginIndex)
		System.out.println(str1.substring(5));

		// seperating string
		// initially use tocharArray method
		// here we are using chararray, so "char[] a" should be use
		// to print, use for loop

		char[] a = str1.toCharArray();

		for (int i = 0; i < a.length; i++)
		// initial value is 0, intrate upto less than length of a
		{
			System.out.println(a[i]);
		}

		// reverse the sring
		// initially find out the length of chararray "a"
		// x=a.length, store the length of chararray
		// a.length-1, length starts with 1
		// index starts with 0
		// to start itration it should start with 0, so x>=o
		// we are reversing, so x--
		for (int x = a.length - 1; x >= 0; x--) {
			System.out.println(a[x]);
		}
	}

}

// this is immutable.
// initially we gave str = jaVa,
// in str3 we converted to upper case, but the converted value will not store in
// str,
// str value is still jaVa,
// converted value will b n some temp memory
// this is called immutable