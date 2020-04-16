package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/datepicker/");

		driver.findElement(By.xpath(".//*[@id='datepicker1']")).click();
		Thread.sleep(2000);
		List<WebElement> dates = driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));

		List<WebElement> months = driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[1]"));
		for (WebElement month : months) {

		}

		for (WebElement date : dates) {
			String val = date.getText();
			if (val.equals("12")) {
				date.click();
				break;
			}
		}
	}

}
