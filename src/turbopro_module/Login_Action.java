package turbopro_module;

import org.openqa.selenium.WebDriver;

import turbopro_scenarious.CheckOut_Scenario;
import turbopro_scenarious.CustomerScenario;
import turbopro_scenarious.HomePage;
import turbopro_scenarious.LoginPage;
import utility.Constant;
import utility.ExcelUtils;

public class Login_Action {
    public static void Execute(WebDriver driver) throws Exception{
    	
    	String sUsername = ExcelUtils.getCellData(1, 1);
    	//Log.info("Username picked from Excel is "+ sUsername );
    	 
		String sPassword = ExcelUtils.getCellData(1, 2);
		//Log.info("Password picked from Excel is "+ sPassword );
		
		 CheckOut_Scenario.CreateProduct(driver);
    	 
    HomePage.lnk_MyApplication(driver).click(); 
    //Log.info("Click action performed on My Application link");

    LoginPage.txtbx_UserName(driver).sendKeys(sUsername);
    //Log.info("Username entered in the Username text box");

    LoginPage.txtbx_Password(driver).sendKeys(sPassword);
    //Log.info("Password entered in the Password text box");

    LoginPage.btn_LogIn(driver).click();
    CheckOut_Scenario.SelectProduct(driver);
    
    
    //Log.info("Click action performed on Submit button");
   // CustomerScenario.CompanyModule(driver);
   
    
    //Thread.sleep(10000);
   //CustomerScenario.CreateSalesOrder(driver);
    
    }

}
