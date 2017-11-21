package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import turbopro_module.Login_Action;
import turbopro_scenarious.CheckOut_Scenario;
import turbopro_scenarious.CustomerScenario;
import turbopro_scenarious.DigiFin;
//import turbopro_scenarious.HomePage;
import utility.Constant;
import utility.DriverUtility;
import utility.ExcelUtils;
import webmethods_keyword.WebMethod;

public class Apache_POI_TC {
	private static WebDriver driver = null;
	 
public static void main(String[] args) throws Exception {

//This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method

ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");

System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");

driver = new ChromeDriver();
/*System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver-v0.13.0-win64\\geckodriver.exe");

driver = new FirefoxDriver();
*/
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.manage().window().maximize();

driver.get(Constant.URL2);
DigiFin.setDriver(DriverUtility.getDriver());
DigiFin.Create_ClientDetails(driver);
//CustomerScenario.setDriver(driver);
/*CheckOut_Scenario.setDriver(driver);
Login_Action.Execute(driver);*/

System.out.println("Login Successfully, now it is the time to Log Off buddy.");

//HomePage.lnk_LogOut(driver).click(); 

//driver.quit();

//This is to send the PASS value to the Excel sheet in the result column.

ExcelUtils.setCellData("Pass", 1, 3);

}
}
