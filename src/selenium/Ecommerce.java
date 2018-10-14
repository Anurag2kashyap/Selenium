package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		System.out.println("MyStore openned successfully");
		
		WebElement Signin= driver.findElement(By.xpath("//a[@class='login']"));
		Signin.click();
		System.out.println("Clicked on Signin link");
					
		WebElement Email = driver.findElement(By.xpath("//input[@id='email_create']"));
		Email.sendKeys("SeleniumTesting1902@gmail.com");
		System.out.println("Entered email id");
		
		WebElement CreateAc= driver.findElement(By.xpath("//*[@id='SubmitCreate']"));
		CreateAc.click();
		System.out.println("Clicked on Create An Account button");
					
			}

	}
