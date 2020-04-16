package seleniumBasics;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Example1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

		// Getting current window name
		String window = driver.getWindowHandle();
		System.out.println("Current window name "+window);

		// Getting all windows name

		Set<String> allWindow = driver.getWindowHandles();
		for (String w : allWindow) {
			// System.out.println("All windows " + w);

			if (!w.equals(allWindow)) {
				driver.switchTo().window(w);
				driver.manage().window().maximize();
				System.out.println("Title is: " + driver.getTitle());
				driver.close();
			}

		}

	}

}
