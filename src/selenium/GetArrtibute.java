package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetArrtibute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement attr = driver.findElement(By.name("firstname"));
		attr.sendKeys("Anurag");
		
		String firstName = attr.getAttribute("value");
			
		System.out.println("First Name :  " + firstName);
	
}

}
