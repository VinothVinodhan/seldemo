package array;

import java.util.Arrays;

public class Array_Sort {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 22;
		a[3] = 25;
		a[4] = 9;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
