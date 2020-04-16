package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchFrame_Example {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/manju/Desktop/Selenium/Besant/example.html");

		/*
		// Switching into frame
		// ByIndex
		driver.switchTo().frame(1);
		// Login
		driver.findElement(By.name("userName")).sendKeys("123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.xpath("//input[(@value='Login')]")).click();

		// Switching back to parent window.So that we can switch to another
		// frame
		driver.switchTo().defaultContent();
		//driver.findElement(By.linkText("click for facebook"));

		// Byname: Give any id (or) name value alone inside ""
		driver.switchTo().frame("demoqa");
		driver.findElement(By.linkText("Registration")).click();

		//Switching back to parent
		driver.switchTo().defaultContent();
		
		*/
		
		//ByWebelement
		WebElement Frame3 = driver.findElement(By.xpath("//iframe[@title='Guru99']"));
		driver.switchTo().frame(Frame3);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123");
		
		// Switching back to default
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("click for facebook")).click();
		// driver.close();

	}

}
