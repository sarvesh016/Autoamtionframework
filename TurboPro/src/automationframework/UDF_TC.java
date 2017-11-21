package automationframework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import turbopro_module.Login_Action;
//import turbopro_scenarious.HomePage;
import utility.Constant;
import utility.ExcelUtils;
import utility.Utils;

public class UDF_TC {
	  public WebDriver driver;
	  
	    private String sTestCaseName;
	 
	    private int iTestCaseRow;
	 
	    @BeforeMethod
	 
	  public void beforeMethod() throws Exception {
	 
	        
	 
	         sTestCaseName = this.toString();
	 
	         sTestCaseName = Utils.getTestCaseName(this.toString());
	 
	        
	 
	        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
	 
	        iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
	 
	        driver = Utils.openBrowser(iTestCaseRow);
	 
	        }
	 
	    @Test
	 
	  public void main() throws Exception {
	 
	        Login_Action.Execute(driver);
	 
	        System.out.println("Login Successfully, now it is the time to Log Off buddy.");
	 
	        //HomePage.lnk_LogOut(driver).click();
	 
	        
	        }
	 
	   @AfterMethod
	 
	  public void afterMethod() {
	 
	        //driver.close();
	 
	        }

}
