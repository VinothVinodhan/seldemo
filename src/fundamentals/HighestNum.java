package fundamentals;

import java.util.Scanner;

public class HighestNum {

	public static void main(String[] args) {
		System.out.println("Enter numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println("Highest is: " + a);
		} else if (b > a && b > c) {
			System.out.println("Highest is: " + b);
		} else if (c > a && c > b) {
			System.out.println("Highest is: " + c);
		} else {
			System.out.println("No number");
		}
	}

}
