package Capture_screen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHrm {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
	    WebElement org = driver.findElement(By.name("username"));
	    org.sendKeys("Admin");
	    
	    WebElement org1 =driver.findElement(By.name("password"));
	    org1.sendKeys("admin123");
	    
	    WebElement login = driver.findElement(By.xpath("//button[contains(.,'Login')]"));
	    login.click();
	    
	    WebElement pim = driver.findElement(By.xpath("//span[contains(.,'PIM')]"));
	    pim.click();
	    
	    WebElement employid = driver.findElement(By.xpath("(//input[contains(@class,'oxd-input oxd-input--active')])[2]"));
	    employid.sendKeys("0024");
	    
	    WebElement search = driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Search')]"));
	    search.click();
	    Thread.sleep(3000);
	    WebElement myinfo = driver.findElement(By.xpath("//a[contains(.,'My Info')]"));
	    myinfo.click();
		
	    WebElement contact = driver.findElement(By.xpath("//a[contains(.,'Contact Details')]"));
	    contact.click();
	    
	    WebElement mobilenumber = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--focus']"));
	    mobilenumber.sendKeys("9849533706");
	    
	    Thread.sleep(3000);
	    
	    
	    WebElement save = driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space"));
	    Thread.sleep(3000); 
	    save.click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		

	}

	private static void click() {
		// TODO Auto-generated method stub
		
	}

	private static WebElement findElement(By name) {
		// TODO Auto-generated method stub
		return null;
	}

}
