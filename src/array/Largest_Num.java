package array;

import java.util.Arrays;

public class Largest_Num {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 11, 5, 9, 0 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Largest: " + a[a.length - 1]);
		System.out.println("Smallest: " + a[0]);
	}
}
