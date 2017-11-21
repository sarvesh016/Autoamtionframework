package turbopro_scenarious;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;



public class LoginPage {
	 private static WebElement element = null;
	 
	    public static WebElement txtbx_UserName(WebDriver driver){
	 
	         element = driver.findElement(By.id("uname"));
	         //Log.info("Username textbox found");
	 
	         return element;
	 
	         }
	 
	     public static WebElement txtbx_Password(WebDriver driver){
	 
	         element = driver.findElement(By.id("pwd"));
	         //Log.info("Password Texbox found");
	 
	         return element;
	 
	         }
	 
	     public static WebElement btn_LogIn(WebDriver driver){
	 
	         element = driver.findElement(By.xpath("//input [@type='submit']"));
	         //Log.info("Login button found");
	 
	         return element;
	 
	         }
	     
	 

}
