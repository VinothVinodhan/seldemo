package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aetherpal_Auto {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qars-gm.ent.aetherpal.com/wbc");

		// login
		driver.findElement(By.id("txtUserName")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("aetherpal@1");
		String Version = driver.findElement(By.xpath(".//*[@id='loginversion']")).getText();
		System.out.println("Current version is " + Version);
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();

		// Login fail
		// String Error =
		// driver.findElement(By.xpath(".//*[@id='login_screen']/div[2]/form/p/span")).getText();
		// System.out.println("Login error is "+Error);

		// Home page

		String Homepage = driver.findElement(By.xpath(".//*[@id='dashboard_userText']/div/div/p[1]")).getText();
		System.out.println(Homepage);

		driver.findElement(By.id("txtadddevice")).sendKeys("qwerty");
		driver.findElement(By.id("btnAddDevice")).click();
	
		WebElement Searchresult = driver.findElement(By.xpath(".//*[@id='dashboard_header_no_device']/div[1]/div"));
		String s = Searchresult.getText();
		//String SearchResult = driver.findElement(By.xpath(".//*[@id='dashboard_header_no_device']/div[1]/div")).getText();
		System.out.println(s);
		
		

	}

}
