package demo;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDatProvider {
	// creating object with null for ExcelWrite_Example

	static WebDriver driver;
	ExcelRead_Example er = null;

	@Test(dataProvider = "Inputs")
	public void Login_Logout(String UserName, String Password) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		System.out.println("Logged in");
		driver.findElement(By.linkText("SIGN-OFF")).click();
		System.out.println("Logged out");

	}

	public Object[][] testData(String xlpath, String sheetname) throws IOException {
		Object[][] exceldata = null;
		er = new ExcelRead_Example(xlpath);
		int row = er.getRowCount(sheetname);
		int col = er.getColumnCount(sheetname);
		exceldata = new Object[row - 1][col];
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				exceldata[i - 1][i] = er.getCellData(sheetname, j, i);
			}
		}

		return exceldata;
	}

	@DataProvider(name = "Inputs")
	public Object[][] data() throws IOException {
		Object[][] data = testData("C://Users//manju//Desktop//besant//Excel Handle//ExcelRead_Example.xlsx", "Sheet1");
		return data;
	}

}