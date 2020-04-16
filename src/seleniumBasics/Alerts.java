package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4/");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());		
		alert.accept();
	}

}
