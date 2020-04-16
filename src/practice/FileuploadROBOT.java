package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileuploadROBOT {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/registration/");
		//driver.findElement(By.linkText("Registration")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("profile_pic_10")).click();
		driver.findElement(By.xpath(".//*[@id='profile_pic_10']")).click();
		Thread.sleep(2000);

		StringSelection Filename = new StringSelection("D:\\DeleteIt\\ExcelFileHandle.java");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Filename, null);

		Robot File = new Robot();
		File.keyPress(KeyEvent.VK_CONTROL);
		File.keyPress(KeyEvent.VK_V);
		File.keyRelease(KeyEvent.VK_V);
		File.keyRelease(KeyEvent.VK_CONTROL);
		File.keyPress(KeyEvent.VK_ENTER);

	}

}
