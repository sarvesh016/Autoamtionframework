package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {
    public static WebDriver driver = null;
    
public static WebDriver openBrowser(int iTestCaseRow) throws Exception{

    String sBrowserName;

    try{

    sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Browser);
   

    if(sBrowserName.equals("Google Chrome")){
    	
    	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");


    	driver = new ChromeDriver();
      
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get(Constant.URL2);
        DriverUtility.setDriver(driver);

        

        }
 if(sBrowserName.equals("FireFox")){
    	
	 System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver-v0.13.0-win64\\geckodriver.exe");


    	driver = new FirefoxDriver();
      

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get(Constant.URL1);

        

        }

    }    
    catch (Exception e){

    }
    return driver;
}
    
    public static String getTestCaseName(String sTestCase)throws Exception{
    	 
        String value = sTestCase;
 
        try{
 
            int posi = value.indexOf("@");
 
            value = value.substring(0, posi);
 
            posi = value.lastIndexOf(".");    
 
            value = value.substring(posi + 1);
 
            return value;
 
                }catch (Exception e){
            throw (e);
 
        }

}

}
