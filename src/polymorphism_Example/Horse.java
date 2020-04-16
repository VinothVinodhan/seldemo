package polymorphism_Example;

public class Horse extends Animal{
	public void sound() {
		System.out.println("Neigh");
	}
	
	public void sub(int a, int b){
		System.out.println("int a , b"+ a+" , "+b+" in Horse class");
	}
}
