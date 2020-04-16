package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_example {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/v4/");
		// driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// Windows Alert getText
		String message = driver.switchTo().alert().getText();
		System.out.println(message);

		// accept
		driver.switchTo().alert().accept();

		// dismiss
		// If window has No/Cancel kind of buttons it will execute this step
		// driver.switchTo().alert().dismiss();

		// If window has X button, selenium will perform any actions on that
	}

}
