package Capture_screen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.Webdriver;
import selenium.string_method;

public class makemytrip {

	public static void main(String[] args) throws InterruptedException {
		
		
		Webdriver driver = new ChromeDriver();
	    driver.get("https://www.makemytrip.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));	    
	    
	    
	    WebElement roundtrip = driver.findElement(By.xpath("//li[@data-cy='roundTrip'][contains(.,'Round Trip')]"));
	    roundtrip.click();
	    
	    String trps = roundtrip.getAttribute("class");
	    
	    if (trps.contains("selected"))
	    {
			System.out.println("if runninig successful print this msg");
		}
	    
	    
		

	}

}
