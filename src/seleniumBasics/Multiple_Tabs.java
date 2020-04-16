package seleniumBasics;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Tabs {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		driver.findElement(By.id("privacy-link")).click();

		// storing windows in list
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tab.size());
		driver.switchTo().window(tab.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(tab.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}