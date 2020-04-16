package assertion;

import org.testng.annotations.Test;

public class SoftAssert {

	@Test
	public void sortAssert() {
		String s = "Welcome";
		String a = "Wencole";
		//SoftAssert sa = new SoftAssert();
		org.testng.asserts.SoftAssert sa = new org.testng.asserts.SoftAssert();
		sa.assertEquals(a, s);
		sa.assertAll();

	}

}