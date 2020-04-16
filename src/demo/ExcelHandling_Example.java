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

public class ExcelHandling_Example {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");

		// defining a file in java
		File excel = new File("C:\\Users\\manju\\Desktop\\besant\\Excel Handle\\Input.xlsx");
		// reading a file
		FileInputStream FIS = new FileInputStream(excel);

		// convert reading to excel
		XSSFWorkbook Wb = new XSSFWorkbook(FIS);

		// Getting sheet
		// Give sheet name.Example Sheet name is Input
		XSSFSheet SH = Wb.getSheet("Input");

		// Rows
		// give row & column position. example 0,0
		// the excel value which is going to get is a string
		String data = SH.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);

		// getting last row from sheet which has value
		for (int i = 0; i <= SH.getLastRowNum(); i++) {
			Row r = SH.getRow(i);
			// getting till last cell values in 1st row's
			for (int j = 0; j < r.getLastCellNum(); j++) {
				String val = r.getCell(j).getStringCellValue();
				System.out.println(val);
			}

		}

	}
}
