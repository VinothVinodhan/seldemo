package fundamentals;

// Dividing number without using / operator
public class DivideNum {

	public static void main(String[] args) {
		int num = 200, divisor = 5, result = 0;
		while ((num - divisor) >= 0) {
			result++;
			num = num - divisor;
		}
		System.out.println(result);
	}
}
