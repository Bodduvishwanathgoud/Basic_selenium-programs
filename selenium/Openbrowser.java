package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Openbrowser {


	public static void main(String[] args) 
	{ 
	ChromeDriver obj =new ChromeDriver();
	obj.get("https://www.instagram.com/");
	
	
	String vbc = obj.getTitle();
	System.out.println(vbc);
	
	obj.manage().window().fullscreen();
	
  obj.close();
	
  EdgeDriver edge =new EdgeDriver();
  edge.get("https://www.instagram.com/");
  {
	  
	 
	  
  }
  
  
	}
	
}
