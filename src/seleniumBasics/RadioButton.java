package seleniumBasics;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// Storing all radio
		List<WebElement> radio = driver.findElements(By.xpath("//*[@type = 'radio']"));
		System.out.println(radio.size());
		for (WebElement e : radio) {
			System.out.println("radio name is: " + e.getAttribute("name"));
			// selecting radio button based on the value
			String name = e.getAttribute("value");
			if (name.equalsIgnoreCase("1")) {
				e.click();
			}

		}

	}

}
