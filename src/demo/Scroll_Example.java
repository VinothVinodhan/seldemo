package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		Thread.sleep(2000);

		// ScrollBy: scroll based on X & Y axis value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)");

		// ScrollTo: scroll upto bottom of the page
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");

		//
		WebElement link = driver.findElement(By.xpath("//a[text()='ToolsQA']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", link);

		Thread.sleep(1000);
		driver.close();

	}

}
