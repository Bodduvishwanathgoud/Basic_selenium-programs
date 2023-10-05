package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Fb_login {

	public static void main(String[] args) throws Exception 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname"))
		.sendKeys("Vishwa"+ Keys.TAB,"Goud"+ Keys.TAB +"bvishwanath@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("bvishwanath@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("vishwa123");
		Thread.sleep(2000);
		driver.findElement(By.id("day")).sendKeys("22"+Keys.TAB+"Jan"+ Keys.TAB+"1993");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(.,'Male')]")).click();
		
		//driver.findElement(By.xpath("(//input[@type='radio'])[2]")).sendKeys(Keys.SPACE);
		
		
		
	}

}
