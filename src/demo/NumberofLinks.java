package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NumberofLinks {
	static WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void linksTotal() {
		driver.get("https://www.google.com/");
		List<WebElement> link = driver.findElements(By.xpath("//a[@href]"));
		int linkcount = link.size();
		System.out.println("number of link count " + linkcount);
		for (WebElement a : link) {

			System.out.println(a.getText());
			

		}

	}
}