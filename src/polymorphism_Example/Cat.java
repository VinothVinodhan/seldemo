package polymorphism_Example;

public class Cat extends Animal {
	public void sound() {
		System.out.println("Meow");
	}
	
	public void sub(int a, int b){
		System.out.println("int a , b"+ a+" , "+b+" in Cat class");
	}

}
