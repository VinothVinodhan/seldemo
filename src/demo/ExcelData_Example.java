package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelData_Example {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.findElement(By.linkText("Registration")).click();
		// Reading Data from Excel
		File excel = new File("C:\\Users\\manju\\Desktop\\besant\\Excel Handle\\RegistrationData.xlsx");
		FileInputStream FIS = new FileInputStream(excel);
		XSSFWorkbook Wb = new XSSFWorkbook(FIS);
		XSSFSheet SH = Wb.getSheet("Sheet1");
		String InputData = SH.getRow(0).getCell(0).getStringCellValue();

		// Getting each values

		for (int i = 0; i <= SH.getLastRowNum(); i++) {
			Row r = SH.getRow(i);
			driver.findElement(By.id("name_3_firstname")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.id("name_3_lastname")).sendKeys(r.getCell(1).getStringCellValue());
			Thread.sleep(1000);
			driver.findElement(By.name("pie_submit")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Registration")).click();
			Thread.sleep(2000);

		}

		// driver.close();
	}
}

// define J.. dont give for loops for J