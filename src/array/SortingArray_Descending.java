package array;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray_Descending {

	public static void main(String[] args) {
		Integer a []= { 2, 1, 5, 3, 9, 0 };
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));

	}

}
