package excelHandeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataComparision {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C://Users//manju//Desktop//Selenium//Selenium//Software//chromedriver.exe");
		File excel = new File("C://Users//manju//Desktop//Selenium//DataComparision.xlsx");
		FileInputStream fis = new FileInputStream(excel);
		XSSFWorkbook Wb = new XSSFWorkbook(fis);
		XSSFSheet sh = Wb.getSheet("Sheet1");
		// String data = sh.getRow(0).getCell(0).getStringCellValue();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		List links = driver.findElements(By.xpath("\\"));
		

	}

}
