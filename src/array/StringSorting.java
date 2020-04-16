package array;

import java.util.Arrays;

// Sorting string
public class StringSorting {

	public static void main(String[] args) {
		String original = "axgryvdl";
		char[] c = original.toCharArray();
		Arrays.sort(c);
		System.out.println(Arrays.toString(c)); // O/P = [a, d, g, l, r, v, x,
												// y]
		String sort = new String(c);
		System.out.println(sort); // O/P = adglrvxy

	}
}
