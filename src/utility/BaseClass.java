package utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import turbopro_module.Login_Action;
import turbopro_scenarious.CheckOut_Scenario;
import turbopro_scenarious.CustomerScenario;
import turbopro_scenarious.DigiFin;



public class BaseClass {
	 //ThreadLocal will keep local copy of driver
    public static ThreadLocal<RemoteWebDriver> dr = new ThreadLocal<RemoteWebDriver>();
 
    @BeforeTest
    //Parameter will get browser from testng.xml on which browser test to run
    @Parameters("myBrowser")
    public void beforeClass(String myBrowser) throws Exception {
 
        RemoteWebDriver driver = null;
 
        if(myBrowser.equals("chrome")){
            new DesiredCapabilities();
			DesiredCapabilities capability = DesiredCapabilities.chrome();
            capability.setBrowserName("chrome");
            capability.setPlatform(Platform.WINDOWS);
            //driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.manage().window().maximize();
			driver.get(Constant.URL2);
			//DriverUtility.setDriver(driver);
//             CustomerScenario.setDriver(driver);
			DigiFin.setDriver(DriverUtility.getDriver());
			DigiFin.Create_ClientDetails(driver);
           // Login_Action.Execute(DriverUtility.getDriver());
        }
        else if(myBrowser.equals("firefox")){
            new DesiredCapabilities();
			DesiredCapabilities capability = DesiredCapabilities.firefox();
            capability.setBrowserName("firefox");
            capability.setPlatform(Platform.WINDOWS);
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        }
 
        //setting webdriver
        setWebDriver(driver);
 
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
    }
 
    public WebDriver getDriver() {
        return dr.get();
    }
 
    public void setWebDriver(RemoteWebDriver driver) {
        dr.set(driver);
    }
 
    @AfterClass
    public void afterClass(){
        getDriver().quit();
        dr.set(null);
 
    }
}
