package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Example {
	static WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	/**
	 * Passing parameter which is string. Initialize string values in names
	 * example Name is value, String name is Fname Send the string name through
	 * .sendkeys we are passing multiple parameters, so Import Parameters
	 * testNG. If its single parameter then Parameter is to be imported
	 * 
	 * @param User
	 * @param PSWD
	 */
	@Test
	@Parameters({ "UserName", "Password" })
	// The parameter would be passed values from parameter_Example.xml
	public void Reg(String User, String PSWD) {

		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(User);
		driver.findElement(By.name("password")).sendKeys(PSWD);

	}

	@AfterTest
	public void ClosingBrowsers() {
		driver.close();
	}

}
