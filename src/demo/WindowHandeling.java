package demo;

import java.io.FileNotFoundException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandeling {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.findElement(By.linkText("Frames and windows")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/ul/li[2]/a")).click();
		driver.findElement(By.linkText("Open New Seprate Window")).click();

		// Getting current window name
		// String ParentWindow = driver.getWindowHandle();

		// get new window name
		Set<String> AllWindow = driver.getWindowHandles();

		// intreation purpose we are using For loop.
		for (String W : AllWindow) {
			driver.switchTo().window(W);

			driver.close();
		}

	}

}
