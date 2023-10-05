package Uiverfications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class getCssValue {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        WebElement login = driver.findElement(By.xpath("//button[contains(.,'Login')]"));
        String BGcolor=login.getCssValue("background-color");
        System.out.println("BG color in RGBA format--> "+BGcolor);
        Color color = Color.fromString(BGcolor);
        
        
        
        
        
        
        
		

	}

}
