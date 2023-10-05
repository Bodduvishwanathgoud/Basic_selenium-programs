package waitcommand;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class URL {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//WebElement Forgotyourpassword=driver.findElement(By.xpath("//p[contains(.,'Forgot your password?')]"));
		//Forgotyourpassword.click();
		
		boolean flag=false;
		
		try {
			flag=new WebDriverWait(driver,Duration.ofSeconds(20))
			.until(ExpectedConditions.urlContains("insta"));	
			System.out.println("if verified ---- print success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
