package Capture_screen;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class capture_Screen_At_Element {

public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	    
	    WebElement Form=driver.findElement(By.xpath("//div[contains(@class,'52jv')]"));
	   // File src=Form.getScreenshotAs(OutputType.FILE);
	    //FileHandler.copy(src, new File("screens\\image2.png"));
	    
	    String src = new SimpleDateFormat("yyyy-mm-dd").format(new Date());
	    FileHandler.copy((File) Form, new File("screens\\image"+src+".png"));
	    
}

}

