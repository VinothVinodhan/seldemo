package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiffBrowser_Example {

	public static void main(String[] args) {
		// to use diff browser, we should set property(Like we do env variables)
		// give entire path of chrome exe
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// To maximize the browser
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/");

	}
}