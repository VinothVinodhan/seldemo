package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class MultipleFrames {
	WebDriver driver;

	public void navigate() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://C://Users//manju//Desktop//Selenium//Besant//Selenium_Concepts//multipleFrames.html");
		System.out.println(driver.getTitle());
		// identify total number of iframes
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total number of iframes: " + size);

		// Navigating to 2nd frame
		driver.switchTo().frame(1);
		System.out.println("Switched to 2nd frame ");
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Morning Joe')]")).getText());
		driver.switchTo().defaultContent();

		// Navigating to 1st frame
		driver.switchTo().frame(0);
		System.out.println("Switched to first frame ");
		System.out.println(driver.findElement(By.xpath("//a[@class='js-focus-search']")).getText());
		driver.switchTo().defaultContent();
		// Navigating to 3rd frame
		driver.switchTo().frame(2);
		System.out.println("Switched to 3rd frame ");
		System.out.println(driver
				.findElement(By
						.xpath("//div[contains(@class,'yr-nav-item')]//a[contains(@class,'nav__item__link')][contains(text(),'News')]"))
				.getText());
		// driver.switchTo().defaultContent();
		driver.quit();
	}

}
