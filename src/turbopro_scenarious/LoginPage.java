package turbopro_scenarious;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import utility.Constant;



public class LoginPage {
	 private static WebElement element = null;
	 
	    public static WebElement txtbx_UserName(WebDriver driver){
	 
	         //element = driver.findElement(By.id(Constant.User));
	    	element = driver.findElement(By.xpath(Constant.User1));
	         //Log.info("Username textbox found");
	 
	         return element;
	 
	         }
	 
	     public static WebElement txtbx_Password(WebDriver driver){
	 
	         //element = driver.findElement(By.id(Constant.PWD));
	    	 element = driver.findElement(By.xpath(Constant.PWD1));
	         //Log.info("Password Texbox found");
	 
	         return element;
	    	 
	    	 
	 
	         }
	 
	     public static WebElement btn_LogIn(WebDriver driver){
	 
	         //element = driver.findElement(By.xpath(Constant.Login));
	    	 element = driver.findElement(By.xpath(Constant.Login1));
	         //Log.info("Login button found");
	 
	         return element;
	 
	         }
	     
	 

}
