package turbopro_module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import turbopro_module.Login_Action;
import turbopro_scenarious.HomePage;

public class Module_Tc {
    private static WebDriver driver = null;
    
 public static void main(String[] args) {

    driver = new FirefoxDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("http://bartosuat.aandespecialties.com/turbotracker/turbo/login");

    // Use your Module SignIn now

    //Login_Action.Execute(driver, "TesteR", "test321");

    System.out.println("Login Successfully, now it is the time to Log Off buddy.");

    HomePage.lnk_LogOut(driver).click();

    driver.quit();

 }

}
