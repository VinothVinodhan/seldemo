package assertion;

import org.testng.Assert;

public class HardAssert {

	public static void main(String[] args) {
		String s = "Hello Welcome";
		String d = "Hello Welome";
		Assert.assertEquals(d, s);
		System.out.println("Assert Executed");
	}
}