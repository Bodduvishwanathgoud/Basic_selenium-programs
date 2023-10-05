package waitcommand;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multipe_windows {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		WebElement link = driver.findElement(By.linkText("Instagram"));
		link.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	
		WebElement link2 = driver.findElement(By.linkText("Threads"));
		link2.click();
		
		WebElement link3 = driver.findElement(By.linkText("Meta Store"));
		link3.click();
		
		WebElement link4 = driver.findElement(By.linkText("About"));
		link4.click();
		
		WebElement link5 = driver.findElement(By.linkText("Meta"));
		link5.click();
		
	
		
		try {
			wait.until(ExpectedConditions.numberOfWindowsToBe(4));
			System.out.println("Third window is opened");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
