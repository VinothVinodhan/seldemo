package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Obj Repo
public class Object_Rep {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		// Login

		// Getting file
		File Prop = new File("C://Users//manju//Desktop//Selenium//seldemo//Element.properties");

		FileInputStream Fis = new FileInputStream(Prop);

		// Loading the Prop file to Pro
		Properties Pro = new Properties();
		Pro.load(Fis);

		driver.findElement(By.name(Pro.getProperty("User_name"))).sendKeys("123");
		driver.findElement(By.name(Pro.getProperty("Password_name"))).sendKeys("123");
		driver.findElement(By.xpath(Pro.getProperty("login_xpath"))).click();
		driver.close();
	}

}
