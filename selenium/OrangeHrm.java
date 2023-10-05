package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException
	
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
	Thread.sleep(2000);
	//driver.findElement(By.className("orangehrm-login-forgot")).click();
		Thread.sleep(2000);
	driver.findElement(By.className("oxd-main-menu-item")).click();
	

	}

}
