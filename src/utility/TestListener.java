package utility;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import turbopro_module.Login_Action;
import turbopro_scenarious.CheckOut_Scenario;
import turbopro_scenarious.CustomerScenario;
import turbopro_scenarious.DigiFin;
import utility.Constant;
import utility.ExcelUtils;
import utility.Utils;

//@Listeners(utility.Listener.class)	

public class TestListener {
	public static WebDriver driver;

	private String sTestCaseName;

	private int iTestCaseRow;
	
	
	@Test
	public void main() throws InterruptedException, MalformedURLException {
		//WebDriver driver = CustomerScenario.getDriver();
		// driver=(driver!=null?driver:CustomerScenario.setDer)
		
		try {
			// driver = Utils.openBrowser(iTestCaseRow);
			/*
			 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 * 
			 * driver.manage().window().maximize(); driver.get(Constant.URL);
			 */
		//	System.out.println((getDriver() == null) + " Heyyyyyyyyyyyyyy");
		/*	if (getDriver() != null) {
				CustomerScenario.setDriver(getDriver());
			} else {
				CustomerScenario.setDriver(driver);
				Login_Action.Execute(driver);
			}*/
			
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(Constant.URL2);
		DigiFin.setDriver(DriverUtility.getDriver());
		DigiFin.Create_ClientDetails(driver);
			//CustomerScenario.setDriver(driver);
			//utility.DriverUtility.setDriver(driver);
			//Selenium Grid
			/*ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
			CheckOut_Scenario.setDriver(DriverUtility.getDriver());
			Login_Action.Execute(DriverUtility.getDriver());*/
			
			//ConxionCreate_ClientDetails
			//CheckOut_Scenario.setDriver(DriverUtility.getDriver());
			
			//DigiFin.setDriver(DriverUtility.getDriver());
		  
		//DigiFin.setDriver(DriverUtility.getDriver());
		//DigiFin.Create_ClientDetails(driver);
			//Login_Action.Execute(DriverUtility.getDriver());
			//emailconfig.SendMail.main();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Login Successfully, now it is the time to Log Off buddy.");

		// HomePage.lnk_LogOut(driver).click();

	}

	
	 /*@BeforeMethod 
	 public void beforeMethod() throws Exception {
		 
	  sTestCaseName = this.toString();
	  
	  sTestCaseName = Utils.getTestCaseName(this.toString());
	  
	  ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,
	  "Sheet1");
	  System.out.println(" Excel sheet opened");
	  
	  iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,
	  Constant.Col_TestCaseName);
	  
	  driver = Utils.openBrowser(iTestCaseRow);
	  
	  }
	 

	
	  @AfterMethod 
	  public void afterMethod() {
		  System.out.println("Execution of After method is carring on");
	  
	  }
	 */
}
