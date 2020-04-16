package seleniumBasics;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();

		Set<String> windows = driver.getWindowHandles();
		for (String w : windows) {
			if (!w.equals(windows)) {
				driver.switchTo().window(w);
				System.out.println(driver.getTitle());
				driver.close();
			}

		}

	}

}
