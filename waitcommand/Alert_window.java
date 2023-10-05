package waitcommand;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_window {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement Alertlink = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		Alertlink.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		try {
			
			wait.until(ExpectedConditions.alertIsPresent()).accept();
			System.out.println("alert pop up displayed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
