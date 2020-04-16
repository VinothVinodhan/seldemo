package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_Example {

	public static void main(String[] args) {
		// to use diff browser, we should set property(Like we do env variables)
		// give entire path of chrome exe
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// To maximize the browser
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/");
		driver.findElement(By.linkText("Droppable")).click();

		// Drag and drop
		// Get source element and destination element and save
		WebElement Source = driver.findElement(By.xpath(".//*[@id='draggableview']"));
		WebElement Destination = driver.findElement(By.xpath(".//*[@id='droppableview']"));

		// To do drag and drop call action class
		Actions act = new Actions(driver);
		act.dragAndDrop(Source, Destination).build().perform();

		// Build().perform() = this will do the action

		driver.close();

	}

}
