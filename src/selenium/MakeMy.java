package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MakeMy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MICROSECONDS);
		
		driver.get("http://www.way2automation.com/demo.html");
		
		WebElement NewSite = driver.findElement(By.xpath("//*[@src='demo/images/draggable.jpg']"));
		NewSite.click();
		System.out.println("New site is openned");
		String MainWindow = driver.getWindowHandle();
		
		Set<String> windowcode = driver.getWindowHandles();
		System.out.println("Window code is : " + windowcode);
		Iterator<String> i= windowcode.iterator();
		
		while(i.hasNext())			
        {		
            String ChildWindow=i.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
		
		//driver.switchTo().window("CDwindow-5164714AD4CC237D42E7F09368554B4E");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
			
		driver.switchTo().frame("0");
		WebElement Name = driver.findElement(By.xpath("//input[@name='name']"));
		/*Actions act = new Actions(driver);
		WebElement Name = driver.findElement(By.xpath("//input[@name='name']"));
		act.moveToElement(Name);
		act.build().perform();*/
		Name.sendKeys("Anurag");
		
            }}
		/*WebElement Name = driver.findElement(By.xpath("//input[@name='name']"));
		Name.sendKeys("Anurag");
		
		WebElement Phone = driver.findElement(By.xpath("//input[@name='phone']"));
		Phone.sendKeys("7011174276");
		
		WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
		Phone.sendKeys("seleniumtesting1902@gmail.com");
		
		WebElement Country = driver.findElement(By.xpath("//*[@name='country']"));
		Select Countryselect = new Select(Country);
		Countryselect.selectByValue("India");
		
		WebElement City = driver.findElement(By.xpath("//input[@name='city']"));
		City.sendKeys("Delhi");
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='username']"));
		UserName.sendKeys("Testuser");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("Ïndia@123");
		
		WebElement Submit = driver.findElement(By.xpath("//input[@type='submit']"));
		Submit.click();
		*/
		/*WebElement Email = driver.findElement(By.xpath("//input[@id='ch_signup_email']"));
		Email.sendKeys("seleniumtesting1902@gmail.com");
		
		WebElement Phone = driver.findElement(By.xpath("//input[@id='ch_signup_phone']"));
		Phone.sendKeys("7011174276");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='ch_signup_password']"));
		pass.sendKeys("Hello123");
		
		WebElement Submit = driver.findElement(By.xpath("//button[@id='ch_signup_btn']"));
		Submit.click();*/
	}

}
