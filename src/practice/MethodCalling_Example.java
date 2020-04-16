package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MethodCalling_Example {

	public static void main(String[] args) throws IOException, InterruptedException {

		Input_WithoutMain obj = new Input_WithoutMain();
		obj.Login();
		obj.Mouse();
		obj.Close();
	}

}
