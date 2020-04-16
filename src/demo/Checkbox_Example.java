package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox_Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.findElement(By.linkText("Registration")).click();
		Thread.sleep(2000);

		// storing all checkbox values in List<> by using css selector
		// List<WebElement> Checkbox =
		// driver.findElements(By.cssSelector("input[type='checkbox']"));
		List<WebElement> Checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement Check : Checkbox) {
			// To check all checkboxes "Check.click();"
			
			String box = Check.getAttribute("value");
			if (box.equals("dance")) {
				Check.click();
				// we are clicking a webelement. So Check.click()/ Since Check
				// is Webelement here
				break;
			}
		}
		// input[@type='checkbox']
	}

}
