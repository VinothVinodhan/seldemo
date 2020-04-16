package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookie_Handel {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().getCookies();   // Return The List of all Cookies
		driver.manage().getCookieNamed(null);  //Return specific cookie according to name
		driver.manage().addCookie(null);   //Create and add the cookie
		driver.manage().deleteCookie(null);  // Delete specific cookie
		driver.manage().deleteCookieNamed(null); // Delete specific cookie according Name
		driver.manage().deleteAllCookies();  // Delete all cookies

	}
}