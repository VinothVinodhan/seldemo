package array;

public class Array_Pgm {

	public static void main(String[] args) {
		int a[] = new int[5];// declaration and instantiation
		a[0] = 10;// initialization
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;
		 // a[5] = 50; java.lang.ArrayIndexOutOfBoundsException:
		// traversing array
		for (int i = 0; i < a.length; i++)// length is the property of array
		
			System.out.println(a[i]);
		
		int b[][] = new int[2][2];
		b[0][0] = 1;
		b[0][1] = 1;
		b[1][0] = 2;
		b[1][1] = 2;

		System.out.println("Two Dimensional array");
		for (int j = 0; j < b.length; j++) {
			for (int x = 0; x < b[j].length; x++) {
				System.out.print(b[j] [x]);
			}
			System.out.println("");
		}
	}

}
