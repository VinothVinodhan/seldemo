package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		driver.switchTo().frame(0);
		// driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Hi");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");

	}

}