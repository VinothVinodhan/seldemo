package objectRep;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRep {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/");

		File ele = new File("C://Users//manju//Desktop//Selenium//seldemo//ele.properties");
		FileInputStream fis = new FileInputStream(ele);
		Properties pro = new Properties();
		pro.load(fis);

		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		driver.findElement(By.name("first_name")).sendKeys("Name");
		driver.findElement(By.name("last_name")).sendKeys("Name1");

	}

}
