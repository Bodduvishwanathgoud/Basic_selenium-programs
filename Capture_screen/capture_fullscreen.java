package Capture_screen;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import selenium.Webdriver;

public class capture_fullscreen {

	public static void main(String[] args) throws IOException 
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
   File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   
   FileHandler.createDir(new File("screens")); 
   FileHandler.copy(src,new File("screens\\image.png"));

	

	}

}
