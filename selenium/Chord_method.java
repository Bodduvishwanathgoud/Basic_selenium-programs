package selenium;

import java.lang.ref.Cleaner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chord_method {

	public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com");
	   driver.manage().window().maximize();
	   
	   WebElement email=driver.findElement(By.id("email"));
	   new Actions(driver).sendKeys(email, "vishwa").perform();
	   Thread.sleep(3000);
	   new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.BACK_SPACE).perform();
	   
	   
	   
	   
	   
		

	}

}
