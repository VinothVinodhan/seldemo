package demo;

public class Inheri_MainClass {

	public static void main(String[] args) {
		Calc1 obj = new Calc1();
		// z value is returning from class Calc_WithoutMain
		// we can een give another name, instead of z, cz this s going to b local variable
		int z = obj.add(1, 2, 3);
		//obj.add(1, 2, 3);
		System.out.println(z+1);

	}

}
