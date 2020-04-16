package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.findElement(By.linkText("Registration")).click();
		Thread.sleep(2000);

		// storing all radio button values in List which is radios
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));

		// for (listtype anyname : listvalue)
		// for (WebElement rad : radios
		// to check one by one value, here we are giving rad and storing
		for (WebElement rad : radios) {
			// val: again we are checking one by one. so storing values purpose
			String val = rad.getAttribute("value");
			if (val.equalsIgnoreCase("married")) {
				rad.click();

				break;
			}
		}

	}

}
