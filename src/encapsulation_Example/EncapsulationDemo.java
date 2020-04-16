package encapsulation_Example;

/*
 * To achieve encapsulation in Java
 * Declare the variables of a class as private.
 * Provide public setter and getter methods to modify and view the variables values.
*/
public class EncapsulationDemo {
	private String name;
	private String idNum;
	private int age;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setIdNum(String newId) {
		idNum = newId;
	}

}
