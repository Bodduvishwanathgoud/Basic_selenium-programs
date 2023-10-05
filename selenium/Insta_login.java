package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_login 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Vishwa");
		driver.findElement(By.name("password")).sendKeys("12345678");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(.,'Log in')])[13]")).click();
		
		
	}

}
