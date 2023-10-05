package selenium;

import java.sql.Driver;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle
{

public static void main(String[] args) 
{
	WebDriver driver = null;
	try {
	
		driver = new ChromeDriver();
	} catch (IllegalStateException e) {
		e.printStackTrace();
		
	}
   if (driver!=null)
	   
	try {
	driver.get("https://www.facebook.co/");
	System.out.println("Page load suscessfully");
	
	} catch (SessionNotCreatedException e) {
		e.printStackTrace();
		
		System.out.println("Page loaded unsuscessfully");
	}
}
}
	
   
   
   
   
	
	
		
