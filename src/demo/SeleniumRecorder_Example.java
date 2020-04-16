package demo;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class SeleniumRecorder_Example {

	public static void main(String[] args) throws InterruptedException, IOException, ATUTestRecorderException {

		DateFormat dateF = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		System.out.println(dateF.format(date));
		ATUTestRecorder rec = new ATUTestRecorder("C:\\Users\\manju\\Desktop\\besant\\SeleniumRecorder",
				"TestVideo- " + dateF.format(date), true);
		rec.start();

		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");

		driver.findElement(By.linkText("Registration")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).click();

		// Executing exe file.
		// Running exe fild in runtime. So Runtime

		Runtime.getRuntime().exec("C:\\Users\\manju\\Desktop\\besant\\AutoIt_ExampleFiles\\fu.exe");

		driver.findElement(By.xpath("//input[@value='Submit']"));

		rec.stop();

	}

}
