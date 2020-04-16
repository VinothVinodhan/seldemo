package polymorphism_Example;

public class Animal {
	public void sound() {
		System.out.println("Animal is making a sound");
	}

	public void sub(int a, int b) {
		System.out.println("int a , b is " + a + " , " + b + " in Animal class");
	}

	public void sub(int a, String c) {
		System.out.println("int a & String c is " + a + " , " + c + " in Animal class");
	}
}
