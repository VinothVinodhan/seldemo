package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signin_Example {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	// Login	
		driver.findElement(By.name("userName")).sendKeys("123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.xpath("//input[(@value='Login')]")).click();
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("SIGN-OFF")).click();
		driver.close();

	}

}
