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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Example {
	static WebDriver driver;

	@Test(dataProvider = "Inputs")
	public void Login_Logout(String UserName, String Password) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		System.out.println("Logged in");
		driver.findElement(By.linkText("SIGN-OFF")).click();
		System.out.println("Logged out");

	}

	// Give name for Data Provider
	@DataProvider(name = "Inputs")
	public Object[][] Data() {
		// we are returning object two dim array.
		// No need to store
		return new Object[][] { { "123", "123" }, { "123", "12" }, { "123", "123" } };

	}

	@AfterMethod
	public void SSC(ITestResult res) throws IOException {
		if (!res.isSuccess()) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,
					new File("C:\\Users\\manju\\Desktop\\besant\\ScreenShot\\" + res.getName() + ".png"));
			System.out.println("Taken SS");

		}
		driver.close();

	}

}