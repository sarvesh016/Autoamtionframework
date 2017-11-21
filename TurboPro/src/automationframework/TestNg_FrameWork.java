package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import turbopro_module.Login_Action;
import turbopro_scenarious.HomePage;
import utility.Constant;
import utility.ExcelUtils;

public class TestNg_FrameWork {
	public WebDriver driver;
	 
	@BeforeMethod
 
  public void beforeMethod() throws Exception {
 
	 
 
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
 
		System.setProperty("webdriver.gecko.driver", "D://Selenium//geckodriver-v0.13.0-win64//geckodriver.exe");

 
		driver = new FirefoxDriver();
 
		
 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
		
 
		driver.get(Constant.URL);
 
        }
 
	@Test
 
  public void main() throws Exception {
 
	    Login_Action.Execute(driver);
 
		System.out.println("Login Successfully, now it is the time to Log Off buddy.");
 
		//HomePage.lnk_LogOut(driver).click(); 
 
		
 
        }
 
   @AfterMethod
 
  public void afterMethod() {
 
	    driver.close();
 
        }

}
