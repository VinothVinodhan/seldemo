package demo;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");

		// Getting current window name
		String ParentWindow = driver.getWindowHandle();
		// storing name Set
		Set<String> AllWindow = driver.getWindowHandles();

		// intreation purpose we are using For loop.
		for (String W : AllWindow)
		// w is our puopose
		// String is the value getting
		{
			if (!W.equals(AllWindow))
			// check window (W) is equal to ALlWindow
			{
				driver.switchTo().window(W); // Switch to window W
				System.out.println("Title is "+driver.getTitle());

				driver.close();

			}

		}

	}

}
