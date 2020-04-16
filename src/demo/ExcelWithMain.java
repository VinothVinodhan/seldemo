package demo;

import java.io.IOException;

public class ExcelWithMain {

	public static void main(String[] args) throws IOException {
		// Creating object for without main class
		// Passing file location in arguments
		ExcelWrite_Example obj = new ExcelWrite_Example(
				"C://Users//manju//Desktop//besant//Excel Handle//ExcelRead_Example.xlsx");
		// calling method
		// giving argument with real value
		obj.setCellData("Sheet1", "Result", 2, "abcd");

	}

}