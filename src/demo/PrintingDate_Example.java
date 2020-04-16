package demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintingDate_Example {

	public static void main(String[] args) {
		
		DateFormat formate = new SimpleDateFormat("mm dd yyyy");
		Date d = new Date();
		System.out.println(formate.format(d));

	}

}
