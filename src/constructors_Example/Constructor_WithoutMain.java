package constructors_Example;

public class Constructor_WithoutMain {
	String name="Hello";

	public void getclass() {
		System.out.println("Name: "+name);
	}


	public Constructor_WithoutMain(String x) {
		System.out.println("Default constructor");
		this.name = x;
	}

}
