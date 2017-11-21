package automationframework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import turbopro_scenarious.HomePage;
import turbopro_scenarious.LoginPage;

public class Turbo_Tc {
	private static WebDriver driver = null;
	 
	   public static void main(String[] args) {
	 
	     driver = new FirefoxDriver();
	 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	     driver.get("http://bartosuat.aandespecialties.com/turbotracker/turbo/login");
	 
	     // Use page Object library now
	 
	     HomePage.lnk_MyApplication(driver).click();
	 
	     LoginPage.txtbx_UserName(driver).sendKeys("testuser_1");
	 
	     LoginPage.txtbx_Password(driver).sendKeys("Test@123");
	 
	     LoginPage.btn_LogIn(driver).click();
	 
	     System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 
	     HomePage.lnk_LogOut(driver).click(); 
	 
	     driver.quit();
	 
	     }
}
