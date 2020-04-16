package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigate methods
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		// get methods
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		

		// Cookies
		driver.manage().addCookie(null); // add a specific cookie
		driver.manage().deleteAllCookies(); // delete all cookies for the current domain
		driver.manage().deleteCookie(null); // delete a cookie from browser's "cookie jar"
		driver.manage().deleteCookieNamed(null); // delete named cookie
		driver.manage().getCookies(); // get all the cookies for the current domain
		driver.manage().getCookieNamed(null); // get a cookie with a given name

		driver.close();
	}

}
