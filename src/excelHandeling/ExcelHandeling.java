package excelHandeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandeling {

	public static void main(String[] args) throws IOException {
		File excel = new File("C://Users//manju//Desktop//besant//Excel Handle//Sample.xlsx");
		FileInputStream fis = new FileInputStream(excel);
		XSSFWorkbook Wb = new XSSFWorkbook(fis);
		XSSFSheet sh = Wb.getSheet("Input");
		String data = sh.getRow(0).getCell(0).getStringCellValue();

		// to print particular cell value
		System.out.println(data);
		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			Row r = sh.getRow(i);
			for (int j = 0; j < r.getLastCellNum(); j++) {
				String val = r.getCell(j).getStringCellValue();
				System.out.println(val);
			}
		}

	}

}
