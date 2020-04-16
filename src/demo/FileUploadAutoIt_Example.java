package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadAutoIt_Example {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");

		driver.findElement(By.linkText("Registration")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).click();

		// Executing exe file.
		// Running exe fild in runtime. So Runtime

		Runtime.getRuntime().exec("C:\\Users\\manju\\Desktop\\besant\\AutoIt_ExampleFiles\\fu.exe");

		driver.findElement(By.xpath("//input[@value='Submit']"));
	}

}
