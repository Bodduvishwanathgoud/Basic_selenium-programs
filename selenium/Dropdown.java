package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown { 

	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/reg/");
		driver.manage().window().maximize();
		
		WebElement DayDD = driver.findElement(By.id("day"));
		DayDD.findElement(By.xpath("//option[@value='11'][contains(.,'11')]")).click();
		
		//WebElement MonthDD=driver.findElement(By.xpath("//option[@value='11'][contains(.,'Nov')]"));
		//MonthDD.click();
	
		
		
	}

}
