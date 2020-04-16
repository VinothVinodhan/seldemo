package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite_Example {

	// Declaring all in global and using in constructor
	public FileOutputStream fos = null;
	public FileInputStream fis = null;
	public XSSFWorkbook wb = null;
	public XSSFSheet sh = null;
	public XSSFRow row = null;
	public XSSFCell cell = null;
	String xlfilepath;

	// creating constructor to assign common
	public ExcelWrite_Example(String Filename) throws IOException {
		this.xlfilepath = Filename;
		fis = new FileInputStream(xlfilepath);
		wb = new XSSFWorkbook(fis);
		fis.close();

	}

	// this method is for Excel Write
	// we are taking sheetname, column name, row number, and value of cell
	public boolean setCellData(String SheetName, String Colname, int rowno, String value) throws IOException {

		// -1 is dummy
		// If given column is not available then it will throw -1 error
		// if we give 1 or another value, it will write the values in assigned
		// column number.
		// -1 is not a valid column number so it will not write any values
		int colu_num = -1;
		sh = wb.getSheet(SheetName);
		row = sh.getRow(0);
		// for loops is for defining column number
		for (int i = 0; i < row.getLastCellNum(); i++) {
			if (row.getCell(i).getStringCellValue().trim().equals(Colname)) {
				colu_num = i;
			}
		}

		// generally we give row value
		// but it will consider row value from 0
		// so (rowno - 1) is
		row = sh.getRow(rowno - 1);
		if (row == null) {
			row = sh.createRow(rowno - 1);
		}

		cell = row.getCell(colu_num);
		if (cell == null) {
			cell = row.createCell(colu_num);
		}
		// we are setting string value here
		cell.setCellValue(value);

		fos = new FileOutputStream(xlfilepath);
		wb.write(fos);
		fos.close();
		// we are returning boolean value true (or) false, so changing method to
		// boolean instead of void
		return true;

	}
/*
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
	
	
	
	
*/	
	
}