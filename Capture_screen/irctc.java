package Capture_screen;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;

import javax.xml.crypto.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		WebElement Date=driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
		String Act_Date=Date.getAttribute("value");
		System.out.println(Act_Date);
		
		String Exp_Date=new SimpleDateFormat("dd-MM-yyyy").format(new Date(0));
		
		if (Exp_Date.equals(Act_Date))
		
		{
		
			System.out.println("Date is matched");
			
		}
		else {
			System.out.println("Date is notmatch");
		}
			
			
			
	}

}
