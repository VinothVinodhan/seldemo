package demo;

public class Switch_Example {

	public static void main(String[] args) {
		int i = 1;
		switch (++i) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		default:
			System.out.println("Saturday");
			// break;

		}

	}

}
// if case does not have break statement, it will print all the values till the
// break.
// if break is at last case, then it will print till last sysout

// if this condition required to continue, the give Continue instead of break