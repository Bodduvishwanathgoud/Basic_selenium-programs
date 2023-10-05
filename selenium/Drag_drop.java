package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) throws Exception {
		
	ChromeDriver drag = new ChromeDriver();
	drag.get("https://marcojakob.github.io/dart-dnd/basic/");
	drag.manage().window().maximize();
	drag.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	
	WebElement doc1 = drag.findElement(By.xpath("(//img[contains(@class,'document')])[1]"));
	WebElement doc2 = drag.findElement(By.xpath("(//img[@src='images/document.png'])[2]"));
	WebElement doc3 = drag.findElement(By.xpath("(//img[@src='images/document.png'])[3]"));
	WebElement doc4 = drag.findElement(By.xpath("(//img[@src='images/document.png'])[4]"));
	WebElement trash = drag.findElement(By.xpath("//div[contains(@class,'trash')]"));
     
	Actions bin = new Actions(drag);
	 
	bin.click().dragAndDrop(doc3, trash).perform();
	Thread.sleep(2000);
	bin.click().dragAndDrop(doc2, trash).pause(2000).perform();
	
	Thread.sleep(2000);
	bin.clickAndHold(doc4).moveToElement(trash).release().perform();
	Thread.sleep(2000);
	bin.clickAndHold(doc1).moveToElement(trash).release().perform();
	
	
	
	
	
	}

	
	
}
