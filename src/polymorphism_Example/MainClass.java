package polymorphism_Example;

public class MainClass {

	public static void main(String[] args) {
		Animal obj = new Animal();
		Horse obj1 = new Horse();
		Cat obj2 = new Cat();

		obj.sound();
		obj1.sound();
		obj2.sound();
		
		obj.sub(1, 2);
		obj1.sub(2, 3);
		obj2.sub(3, 4);

		obj.sub(1, "Animal");
	}
}