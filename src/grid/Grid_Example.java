package grid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid_Example {

	DesiredCapabilities Cap = DesiredCapabilities.firefox();
	WebDriver driver;

	@BeforeTest
	public void hub() throws MalformedURLException {
		Cap.setBrowserName("Firefox");
		Cap.setPlatform(Platform.WIN10);		
		String node = "http://192.168.1.39:5566/wd/hub";
		driver = new RemoteWebDriver(new URL(node), Cap);

	}

	@Test(priority = 2)
	public void Reg() {
		driver.get("http://demoqa.com/");
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		driver.findElement(By.name("first_name")).sendKeys("Name");
		driver.findElement(By.name("last_name")).sendKeys("Name1");

	}

	
	@Test
	@Parameters({ "FirstName", "LastName" })
	public void Reg(String Fname, String LName) {
		driver.get("http://demoqa.com/");
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		driver.findElement(By.name("first_name")).sendKeys(Fname);
		driver.findElement(By.name("last_name")).sendKeys(LName);

	}

}