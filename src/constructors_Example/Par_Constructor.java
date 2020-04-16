package constructors_Example;

public class Par_Constructor {
	int a;
	String name;

	// This parameterized constructor used t provide diff values to obj
	// Can provide same value too
	Par_Constructor(int x, String y) {
		a = x;
		name = y;
		System.out.println(x + "&" + y);
	}
}
