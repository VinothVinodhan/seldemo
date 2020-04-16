package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class List_Example {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		List<WebElement> Links = driver.findElements(By.xpath("//a[@href]"));

		for (WebElement a : Links) {
			//System.out.println(a.getText());
			String Link = a.getAttribute("Value");
			if (Link.equals("Registration")){
				a.click();

			}
		}

	}

}
