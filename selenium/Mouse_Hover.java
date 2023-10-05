package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws Exception {
		
		WebDriver click = new ChromeDriver();
		click.get("https://www.jqueryscript.net/zoom/image-magnifier-on-hover.html");
	    click.manage().window().maximize();
	    
	    WebElement image = click.findElement(By.xpath("//img[contains(@alt,'Minimalist Image Pan & Zoom On Hover - jQuery NZoom')]"));
	    new Actions(click).click(image).click().perform();
	    
	    
	    Thread.sleep(2000);
	    WebElement close = click.findElement(By.xpath("//a[@id='pref2_closeLink']"));
	   close.click();
	    
	}

}
