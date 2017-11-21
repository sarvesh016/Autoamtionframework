package turbopro_scenarious;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Constant;



public class HomePage {

	
		  private static WebElement element = null;
		    
		  public static WebElement lnk_MyApplication(WebDriver driver){
		  
		     element = driver.findElement(By.className("login"));
		     //Log.info("My Allication link element found");
		  
		     return element;
		  
		     }
		  
		  public static WebElement lnk_LogOut(WebDriver driver){
		  
		     element = driver.findElement(By.id("account_logout"));
		     //Log.info("Log Out link element found");
		  
		  return element;
		  
		     }

}
