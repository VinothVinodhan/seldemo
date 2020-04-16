package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Example {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		// Login
		driver.findElement(By.name("userName")).sendKeys("123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.xpath("//input[(@value='Login')]")).click();
		// driver.findElement(By.name("login")).click();
		// driver.findElement(By.linkText("SIGN-OFF")).click();

		// Selecting Drop down values
		// SelectByIndex
		// SelectByValue
		// SelectByVisibletext

		// Passengers
		WebElement Passengers = driver.findElement(By.name("passCount"));
		// Use Select method
		Select passengers_select = new Select(Passengers);
		passengers_select.selectByIndex(3);

		// Departing From
		WebElement Departing = driver.findElement(By.name("fromPort"));
		Select departing_select = new Select(Departing);
		departing_select.selectByVisibleText("Frankfurt");

		// Arriving
		WebElement Arriving = driver.findElement(By.name("toPort"));
		Select arriving_select = new Select(Arriving);
		arriving_select.selectByValue("London");

		driver.close();
	}

}