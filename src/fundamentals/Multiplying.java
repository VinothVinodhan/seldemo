package fundamentals;

//Multiplying number without using * operator
public class Multiplying {

	public static void main(String[] args) {
		int num1 = 5, num2 = 4, result = 0;
		for (int i = 0; i < num2; i++) {
			result = result + num1;
		}
		System.out.println(result);
	}

}
