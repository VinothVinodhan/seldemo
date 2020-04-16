package seleniumBasics;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TakeScreenshot {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void method1() {

		driver.get("https://google.com/");

	}

	@Test(priority = 2)
	public void method2() {
		driver.findElement(By.xpath("//input[@tpe='text']")).sendKeys("Google");
		driver.findElement(By.xpath("//input[@type='submit' and @ value='Google Search']")).click();

	}

	public void takeSS(ITestResult res) throws IOException {
		if (res.isSuccess()) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,
					new File("C:\\Users\\manju\\Desktop\\besant\\ScreenShot\\" + res.getName() + ".png"));

		}
	}

	// taking ss if any method s failed
	@AfterMethod
	public void takeSS1(ITestResult res) throws IOException {
		if (!res.isSuccess()) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,
					new File("C:\\Users\\manju\\Desktop\\besant\\ScreenShot\\" + res.getName() + ".png"));

		}

	}

	@AfterClass
	public void afterClass() {

		driver.close();
	}

}