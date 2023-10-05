package selenium;

import java.time.Duration;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick_Action {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://bridgeqsys.com/demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		
	WebElement Button = driver.findElement(By.xpath("//button[contains(.,'Buttons')]"));
	Button.click();
	
	Thread.sleep(2000);
	
	WebElement Rightclick = driver.findElement(By.xpath("//button[contains(.,'Right Click Me')]"));
	new Actions(driver).contextClick(Rightclick).perform();
		
	}

}
