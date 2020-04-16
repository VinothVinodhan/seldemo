package demo;

public class String_Reverse {

	public static void main(String[] args) {
		String str1 = "Manual";
		char[] a = str1.toCharArray();

		for (int i = 0; i < a.length; i++)
		// initial value is 0, intrate upto less than length of a
		{
			System.out.print(a[i]);

		}
		// printing next output in next line, just give sys.println()
		System.out.println();
		// reverse the sring
		// initially find out the length of chararray "a"
		// x=a.length, store the length of chararray
		// a.length-1, length starts with 1
		// index starts with 0
		// to start itration it should start with 0, so x>=o
		// we are reversing, so x--
		for (int x = a.length - 1; x >= 0; x--) {

			System.out.print(a[x]);
		}

	}

}
