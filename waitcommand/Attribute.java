package waitcommand;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Attribute {

	public static void main(String[] args) {
	
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://makemytrip.com");
			
			
			driver.navigate().refresh();
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			
			WebElement Roundtrip=driver.findElement(By.xpath("//li[@class='selected']"));
			//Roundtrip.click();
			
			
			
			try {
				By DoubleSeatFare=By.xpath("//p[contains(.,'Double Seat  Fares')]");
				wait.until(ExpectedConditions.attributeContains(DoubleSeatFare, "class", "isItemDisabled"));
				System.out.println("Double Seat fares object is disabled");
			} catch (Exception e) {
				e.printStackTrace();
			}
			

			
		}

	}