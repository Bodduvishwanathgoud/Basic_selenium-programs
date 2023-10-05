package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hdfc {

	public static void main(String[] args) throws InterruptedException 
	{
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?lat=17.3688366&long=78.5307219&shared=1");
		driver.manage().window().maximize();
		
		WebElement StateDD=driver.findElement(By.id("customState"));
		new Select(StateDD).selectByVisibleText("Gujarat");
		
		Thread.sleep(6000);
		WebElement CityDD=driver.findElement(By.id("customCity"));
		new Select(CityDD).selectByValue("ahmedabad");
		

	}

}
