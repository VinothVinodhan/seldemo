package polymorphism_Example;

public class MainMethodOverLoading {

	public static void main(String[] args) {
		System.out.println("Actual Main method with String[] args");
	}
	public static void main(){
		System.out.println("Actual Main method without String[] args");
	}
	public static void main(String args){
		System.out.println("Actual Main method with String args");
	}

}
