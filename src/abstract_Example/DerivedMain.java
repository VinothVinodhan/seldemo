package abstract_Example;

public class DerivedMain extends Animal {

	public static void main(String[] args) {
		Animal obj = new DerivedMain();
		obj.sound();
		obj.sub();
		
	}

	@Override
	public void sound() {
		System.out.println("sound");
		
	}

	@Override
	public void sub() {
		System.out.println("sub");
		
	}

	@Override
	public void hi() {
		System.out.println("hi");
		
	}

}
