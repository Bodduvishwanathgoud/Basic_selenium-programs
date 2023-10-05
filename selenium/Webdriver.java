package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Webdriver {

	public static void main(String[] args) 
	
	{
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
	
	WebElement roundtrip = driver.findElement(By.xpath("//li[@data-cy='roundTrip'][contains(.,'Round Trip')]"));
	roundtrip.click();
	

	if (roundtrip.getAttribute("class").contains("selected"))
	{
		System.out.println("Round trip is selected");
		WebElement rdclass= roundtrip.findElement(By.xpath("//li[@class='font12 blackText wrapFilter  isItemDisabled'][contains(.,'Double Seat  FaresFly Safer with Double SeatDouble Seat service is available only for domestic one-way economy flights. You can continue to book at the regular fare or change your search parameter(s) to avail of this service.')]"));
		if(rdclass.getAttribute("class").contains("isItemDisabled"))
		
		{
			System.out.println("disabled");
		}
		else
		{
			System.out.println("not disabled");
		}
	}
	
	else
	{
	System.out.println("round trip is not selected");	
	}
	
    
	}

	
}
