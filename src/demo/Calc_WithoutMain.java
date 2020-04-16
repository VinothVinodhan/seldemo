package demo;

//Calc_WithoutMain is class name
public class Calc_WithoutMain {
	public int add(int x, int y, int z) {
		// x = 1;
		// y = 2;
		z = x + y;

		System.out.println("Add is"+z);
		//Calc_WithoutMain obj = new Calc_WithoutMain();
		sub(x,y,z);
		return z;		
	}

	public void sub(int a, int b, int c) {
		a = 2;
		b = 1;
		c = a - b;
		System.out.println("Div is " + c);
	}

}
