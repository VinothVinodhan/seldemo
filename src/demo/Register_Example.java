package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register_Example {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
	//Register
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Name");
		driver.findElement(By.name("lastName")).sendKeys("Name1");
		driver.findElement(By.name("phone")).sendKeys("12345");
		driver.findElement(By.id("userName")).sendKeys("demo@mail.com");
		driver.findElement(By.name("address1")).sendKeys("Address1");
		driver.findElement(By.name("address2")).sendKeys("Address2");
		driver.findElement(By.xpath("//input[starts-with(@name, 'city')]")).sendKeys("Chennai");
		driver.findElement(By.name("state")).sendKeys("TN");
		driver.findElement(By.name("postalCode")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='email' and @ name='email' ]")).sendKeys("demo@mail.com");
		driver.findElement(By.xpath("//input[@type='password' and @ name='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@type='password' and @ name='confirmPassword']")).sendKeys("12345");
		driver.findElement(By.name("register")).click();
		driver.close();
		
	}
}