package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;

public class Mouse_clickactin {

	public static void main(String[] args) throws Exception 
	{
	
		WebDriver action = new ChromeDriver();
		action.get("https://www.makemytrip.com/");
		action.manage().window().maximize();
		action.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		/*Thread.sleep(3000);
		WebElement from = action.findElement(By.xpath("//span[contains(.,'From')]"));
		new Actions(action).click(from).pause(3000)
		.sendKeys("MLE").pause(2000).sendKeys(Keys.ARROW_DOWN).
		 pause(2000). sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(3000);
		WebElement to = action.findElement(By.xpath("//span[@class='lbl_input appendBottom10'][contains(.,'To')]"));
		new Actions(action).click(to).pause(3000).sendKeys("DXB").pause(2000)
		.sendKeys(Keys.ARROW_DOWN).pause(2000).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		 
		WebElement date = action.findElement(By.xpath("//div[@aria-label='Tue Sep 12 2023']"));
		new Actions(action).pause(3000).scrollToElement(date).perform();
        new Actions(action).click(date) .perform(); 
		
        Thread.sleep(3000);

        WebElement todate =action.findElement(By.xpath("//span[contains(.,'Return')]"));
		todate.click();
		
		WebElement date2 = action.findElement(By.xpath("//div[@aria-label='Mon Sep 25 2023']"));
		new Actions(action).pause(3000).scrollToElement(date2).perform();
		new Actions(action).click(date2).perform();*/
		
		Thread.sleep(3000);
		
		WebElement travell = action.findElement(By.xpath("//span[contains(.,'Travellers & Class')]"));
		travell.click();
		
		Thread.sleep(3000);
		WebElement passangers = action.findElement(By.xpath("//li[@data-cy='adults-4'][contains(.,'‎4')]"));
		new Actions(action).scrollToElement(passangers).perform();
		new Actions(action).click().perform();
		
		WebElement apply= action.findElement(By.xpath("//button[contains(.,'APPLY')]"));
		new Actions(action).scrollToElement(apply).perform();
		new Actions(action).click().perform();
		
		
		
		
		
		
		
	
	}

	
		
	}

