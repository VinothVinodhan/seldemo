package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload_Example {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.findElement(By.linkText("Registration")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).click();
		
		// Ctrl+c
		// Here we are coping file location,
		// StringSelection is the method for copying file location

		StringSelection Filename = new StringSelection("D:\\DeleteIt\\ExcelFileHandle.java");
		// Coping file location in clipboard.
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Filename, null);

		// normally for paste, Ctrl + V.
		Robot File = new Robot();
		// pressing control key
		File.keyPress(KeyEvent.VK_CONTROL);
		// press v key
		File.keyPress(KeyEvent.VK_V);
		// release v key
		File.keyRelease(KeyEvent.VK_V);
		// release control key
		File.keyRelease(KeyEvent.VK_CONTROL);

		// Enter
		File.keyPress(KeyEvent.VK_ENTER);
	}

}

// to upload multiple files, have to get filename is another string and follow the same process for another file.

//Runtime.getRuntime().exec("")