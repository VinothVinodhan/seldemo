package collections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_Example {
	static WebDriver driver;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		List<WebElement> AllLinks = driver.findElements(By.xpath("//a[@href]"));
		for (WebElement a : AllLinks) {

			String link = a.getText();
			System.out.println("Link name is " + link);
			if (link.equalsIgnoreCase("Forgotten account?")) {
				a.click();
			}
		}

	}

}
