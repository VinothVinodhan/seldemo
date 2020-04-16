package demo;

public class DivideNumber {

	public static void main(String[] args) {

		int num = 20;
		int div = 5;
		int res = 0;
		while ((num - div) >= 0) {
			res++;
			num = num - div;
		}
		System.out.println(res);
	}

}
