package encapsulation_Example;

public class Encap_WithMain {

	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setName("James");
		obj.setAge(20);
		obj.setIdNum("1234567");
		System.out.println("Name: " + obj.getName() + " Age:" + obj.getAge() + obj.getIdNum());

	}

}
