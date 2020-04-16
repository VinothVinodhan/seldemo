package practice;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// To maximize the browser
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/registration/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\manju\\Desktop\\besant\\AutoIt_ExampleFiles\\ChromeUpload.exe");

	}
}