package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import turbopro_module.Login_Action;
import turbopro_scenarious.HomePage;
import utility.Constant;

public class Universal_Tc {
	 private static WebDriver driver = null;
	 
     public static void main(String[] args) {
 
        driver = new FirefoxDriver();
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
        driver.get(Constant.URL);
 
        Login_Action.Execute(driver,Constant.Username,Constant.Password);
 
        System.out.println("Login Successfully, now it is the time to Log out.");
 
        HomePage.lnk_LogOut(driver).click();
 
        driver.quit();
 
     }
 

}
