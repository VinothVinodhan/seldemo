package fundamentals;

public class Switch_Example {

	public static void main(String[] args) {
		int i = 1;
		switch (++i) {
		case 1:
			System.out.println(i);
			break;
		case 2:
			System.out.println(i++);
			break;
		case 3:
			System.out.println(++i);
			break;
		}
	}
}
