package testNG;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TakesScreenshot_Example {

	static WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void Login() {
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Logged in");
	}

	@Test(priority = 2)
	public void Logout() {
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[2]/a")).click();
		System.out.println("Logged out");
	}

	@AfterTest
	public void Close() {
		driver.close();
		System.out.println("Closed browser");

	}

	/*
	 * @AfterMethod 
	 * public void Screenshot() throws IOException { 
	 * // with the help of TakeScreenshot method (Selenium method) 
	 * // .getScreenshotAs is a method 
	 * File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	 * // now we took print screen which stored in src (temp memory) // import apache.common...
	 * FileUtils.copyFile(src, new File("C:\\Users\\manju\\Desktop\\besant\\ScreenShot\\Error.png"));
	 * System.out.println("Taken SS");
	 * 
	 * }
	 */
	// to take SS only at the failed state.
	// have listener

	@AfterMethod
	// res we are giving
	public void SSC(ITestResult res) throws IOException {
		// we are taking SS if my Test method is pass
		if (res.isSuccess()) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,
					new File("C:\\Users\\manju\\Desktop\\besant\\ScreenShot\\" + res.getName() + ".png"));
			// " + res.getName() + ".png"
			// using this we are giving name as method name for SS
			// System.out.println("Taken SS");

		}

	}

	@AfterMethod
	// Taking SS only failed method
	// ITestResult is a listener
	// its a testNG 's listener
	public void SSC1(ITestResult res) throws IOException {
		// we are taking SS if my Test method is fail
		if (!res.isSuccess()) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,
					new File("C:\\Users\\manju\\Desktop\\besant\\ScreenShot\\" + res.getName() + ".png"));
			System.out.println("Taken SS");

		}

	}

}
