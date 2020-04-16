package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Actions act = new Actions(driver);
		// Forgetten account link
		WebElement addAccount = driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]"));
		act.click(addAccount).build().perform();

		// coming back
		driver.navigate().back();

		// Right clicking on same element
		act.contextClick(addAccount).build().perform();

	}

}
