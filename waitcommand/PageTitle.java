package waitcommand;

import java.time.Duration;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageTitle {

	public static void main(String[] args) {

   WebDriver driver = new ChromeDriver();
   driver.get("https://www.facebook.com/");
   driver.manage().window().maximize();
   
   
   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
   wait.until(ExpectedConditions.titleIs("Facebook – log in or sign up"));
   System.out.println("TitlePage verified");
   
   WebElement Forgotpassword = driver.findElement(By.linkText("Forgotten password?"));
   Forgotpassword.click();
   
   try {
	wait.until(ExpectedConditions.titleContains("Forgotten"));
	System.out.println("if password title verified");
	
	
} catch (Exception e) {
	e.printStackTrace();
}
   
   
   
   
   
   
   
   

	}

}
