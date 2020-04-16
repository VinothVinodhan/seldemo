package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Datepicker")).click();

		driver.findElement(By.xpath(".//*[@id='datepicker1']")).click();

		List<WebElement> dates = driver.findElements(By.xpath("//*[(@id='ui-datepicker-div')]/table/tbody/tr/td/a"));
		
		for (WebElement date : dates) {
			String val = date.getText();
			if (val.equals("16")) {
				date.click();
				break;
			}
		}

	}

}