package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	/*	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\driver_browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");*/
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
	}

}
