package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Example {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Alert alert = driver.switchTo().alert();
		// three method.
		// 1st is getText
		// o/p is string, so store it in some string value
		String Message = alert.getText();
		System.out.println(Message);
		// to click ok or positive scenarios .accept
		alert.accept();
		// to click ok or positive scenarios .dismiss
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Message = alert.getText();
		System.out.println(Message);
		alert.dismiss();
		
		driver.quit();

	}

}
