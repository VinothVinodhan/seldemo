package fundamentals;

public class If_Else_Example {

	public static void main(String[] args) {
		int i = 1;
		if (i < 1) {
			System.out.println(i);
		} else {
			System.out.println("Increasing 1" + ++i);
		}
	}
}