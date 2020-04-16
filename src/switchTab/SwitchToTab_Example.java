package switchTab;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchToTab_Example {
	WebDriver driver;

	@Test
	public void fbHome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Automation Ref//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("privacy-link")).click();

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());
		// Switch to child tab based on index
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.id("pass")).sendKeys("abc");

		// Switch back to parent tab
		driver.switchTo().window(tabs.get(0));

	}

}
