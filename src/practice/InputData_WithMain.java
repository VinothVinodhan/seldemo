package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InputData_WithMain {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		// Reading Data from Excel
		File excel = new File("C:\\Users\\manju\\Desktop\\besant\\Excel Handle\\OrangeHRM_input.xlsx");
		FileInputStream FIS = new FileInputStream(excel);
		XSSFWorkbook Wb = new XSSFWorkbook(FIS);
		XSSFSheet SH = Wb.getSheet("Sheet1");
		String InputData = SH.getRow(0).getCell(0).getStringCellValue();

		// Getting each values

		for (int i = 1; i <= SH.getLastRowNum(); i++) {
			Row r = SH.getRow(i);
			driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElement(By.id("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
			Thread.sleep(1000);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(2000);
		}

	}

}
