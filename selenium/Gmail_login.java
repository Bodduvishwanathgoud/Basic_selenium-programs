package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_login {

	public static void main(String[] args) 
	{
	
		ChromeDriver Gmail = new ChromeDriver();
		Gmail.get("http://Gmail.com");
		Gmail.manage().window().maximize();
		
		Gmail.findElement(By.id("identifierId")).sendKeys("vishwa");
		Gmail.findElement(By.name("Cuz2Ue")).click();
		
		

	}

}
