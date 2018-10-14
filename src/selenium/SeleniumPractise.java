package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MICROSECONDS);
		WebElement register = driver.findElement(By.xpath("//*[text()='REGISTER']"));
		register.click();
		
		
		WebElement firstn = driver.findElement(By.xpath("//*[@name='firstName']"));
		firstn.sendKeys("Anurag");
		
		WebElement lastn = driver.findElement(By.xpath("//*[@name='lastName']"));
		lastn.sendKeys("Kashyap");
		
		WebElement ph = driver.findElement(By.xpath("//*[@name='phone']"));
		ph.sendKeys("7011174276");
		
		WebElement email = driver.findElement(By.xpath("//*[@name='userName']"));
		email.sendKeys("anurag2kashyap@gmail.com");
		
		WebElement add = driver.findElement(By.xpath("//*[@name='address1']"));
		add.sendKeys("Vivek Vihar");
		
		WebElement add2 = driver.findElement(By.xpath("//*[@name='address2']"));
		add2.sendKeys("phase 1");
		
		WebElement city = driver.findElement(By.xpath("//*[@name='city']"));
		city.sendKeys("Delhi");
		
		WebElement state = driver.findElement(By.xpath("//*[@name='state']"));
		state.sendKeys("Delhi");
		
		WebElement postal = driver.findElement(By.xpath("//*[@name='postalCode']"));
		postal.sendKeys("110095");
		
		WebElement country = driver.findElement(By.xpath("//*[@name='country']"));
		Select coun = new Select(country);
		coun.selectByValue("92");
		
		WebElement UserName = driver.findElement(By.xpath("//*[@name='email']"));
		UserName.sendKeys("Testuser2");
			
		WebElement pass = driver.findElement(By.xpath("//*[@name='password']"));
		pass.sendKeys("India@1234");
		
		WebElement confpass = driver.findElement(By.xpath("//*[@name='confirmPassword']"));
		confpass.sendKeys("India@1234");
		
		WebElement submit = driver.findElement(By.xpath("//*[@name='register']"));
		submit.click();
		
		WebElement Home = driver.findElement(By.xpath("//*[text()='Home']"));
		Home.click();
		
		WebElement user1 = driver.findElement(By.xpath("//*[@name='userName']"));
		user1.sendKeys("Testuser2");

		WebElement pass1 = driver.findElement(By.xpath("//*[@name='password']"));
		pass1.sendKeys("India@1234");
		
		/*if(user1.equals(user1)&& pass1.equals(pass1))
		{
			System.out.println("User and Password is correct clicking on Submit button");
			
		}
		
		else
		{
			System.out.println("You have entered incorrect Username and Password");
		}*/
		
		WebElement login =driver.findElement(By.xpath("//*[@name='login']"));
		login.click();
	}

}
