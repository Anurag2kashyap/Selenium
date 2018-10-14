package selenium;

import java.awt.List;
import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NineWest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("http://www.ninewest.com/");
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MICROSECONDS);
		
		WebElement shoes = driver.findElement(By.xpath("//a[@class='mainCat hasSubs' and text()='SHOES']"));
		Actions act = new Actions(driver);
		act.moveToElement(shoes).build().perform();
		
		WebElement flats = driver.findElement(By.xpath("//a[@class='sublevel1' and text()='Flats']"));
		flats.click();
		Thread.sleep(4000);
		
		Collection<WebElement> ele= driver.findElements(By.xpath("//*[@id='ajaxResultHolder'] "));
		System.out.println("Number of element : " + ele.size());
	}

}
