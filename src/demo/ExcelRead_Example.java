package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead_Example  {

	// Declaring all in global and using in constructor
	public FileOutputStream fos = null;
	public FileInputStream fis = null;
	public XSSFWorkbook wb = null;
	public XSSFSheet sh = null;
	public XSSFRow row = null;
	public XSSFCell cell = null;
	String xlfilepath;


	
	public ExcelRead_Example(String xlpath) throws IOException {
		this.xlfilepath = xlpath;
		fis = new FileInputStream(xlpath);
		wb = new XSSFWorkbook(fis);
		fis.close();
		
	}

		// below methods are to read data frm excel
		// 1
		public int getRowCount(String sheetname) {

			sh = wb.getSheet(sheetname);
			int rowcount = sh.getLastRowNum() + 1;
			// rowcount is int
			// since we are returning roucount so "public int" instead of "public void"
			return rowcount;

		}

		// 2
		// get column count method
		public int getColumnCount(String Sheetname) {
			sh = wb.getSheet(Sheetname);
			row = sh.getRow(0);
			int columncount = row.getLastCellNum();
			return columncount;
			// columncount is int, so method should be int instead of void
		}

		//3
		// get data method
		public Object getCellData(String Sheetname, int i, int j){
			sh = wb.getSheet(Sheetname);
			int c = sh.getRow(i).getCell(j).getCellType();
			if (c == 0){

				// number to text converter
				
				return sh.getRow(i).getCell(j).getNumericCellValue();
				// numericCellValue method will retun double value
				// Example, if we give 1, it will consider 1.0
				// returning int value.
			}
			
			else{
				return sh.getRow(i).getCell(j).getStringCellValue();
			}
			// Since we returning values, change the method as Object instead of void
			// Object is accept all type of data types
			// i selenium we can use only string, eventhough we give number it should be inside ""
			
			
		}
		
	// now create testNG data provider class,
		// ExcelDataProvider.java
		

		
		

}
