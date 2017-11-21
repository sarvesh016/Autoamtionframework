package turbopro_scenarious;


import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.Assert;

//import com.tm.AppLib.String;

//import com.tm.AppLib.String;

import utility.Constant;
import utility.DriverUtility;
import webmethods_keyword.WebMethod;

public class CustomerScenario {
	
	private static boolean retval;
	private static WebElement element = null;
	private static Properties OR=null;
	private static WebMethod controls;
	private static WebDriver driver = null;
	/*public Constant()
	{
		loadOR();		
	}*/
	static{
		OR = new Properties();
		try {
			InputStream inputStream=Constant.class.getClassLoader().getResourceAsStream("config//OR.properties");
			OR.load(inputStream);
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    public static WebElement CompanyModule(WebDriver driver){
   	 Actions Builder=new Actions(driver);
   	Builder.moveToElement(driver.findElement(By.xpath(Constant.Company_Customer))).moveToElement(driver.findElement(By.xpath(Constant.Customer_SalesOrder))).moveToElement(driver.findElement(By.xpath(Constant.salesorder))).click().build().perform();
	   
   	return element;
   	 
    }
    
    public static void CreateSalesOrder(WebDriver driver) throws Exception{
    	String btnlogin = getORProperty("ADD");
    	controls=new WebMethod(driver);
		retval = controls.clickobject(btnlogin);
		if (retval)
		{
			
			System.out.println("ADD button clicked");
		}
		else
		{

//			  Assert.assertTrue(false);
			
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("ADD button not clicked");
		}		
		
    	/*element=driver.findElement(By.xpath(Constant.ADD));
    	element.click();*/
		String CustomerText = getORProperty("Customer_TextBox");
		retval = controls.EditTextid(CustomerText,Constant.Customername);
		if (retval)
		{
			System.out.println("Customer Name is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Customer Name is not Clicked");
		}	
	  	String Customerbtnlogin = getORProperty("Enter_Customer");
		retval = controls.clickobject(Customerbtnlogin);
		if (retval)
		{
			System.out.println("Customer Name is Entered");
		}
		else
		{
			System.out.println("Customer Name is not Entered");
		}	
	  	 String PromisedDate = getORProperty("Promised_Date");
			retval = controls.clickobjectid(PromisedDate);
			if (retval)
			{
				System.out.println("Promised Date is Clicked");
			}
			else
			{
				System.out.println("Promised Date is not Clicked");
			}
			String DatePicker=getORProperty("Date_Frame");
			retval = controls.DatePicker(DatePicker,Constant.Date);
			if (retval)
			{
				System.out.println("Date is Entered");
			}
			else
			{
				System.out.println(" Date is not Entered");
			}
			String SaveButton = getORProperty("Save_PO_Release");
			retval = controls.clickobjectid(SaveButton);
			if (retval)
			{
				System.out.println("Save Button is Clicked");
			}
			else
			{
				System.out.println("Save Button is Not Clicked");
			}	
			Thread.sleep(15000);
			String Enablelineitem = getORProperty("LineItem_Enable");
			retval = controls.clickobject(Enablelineitem);
			if (retval)
			{
				System.out.println("LineItem is Clicked");
			}
			else
			{
				System.out.println("LineItem is Not Clicked");
			}	
			String EnterLineitem = getORProperty("Enter_Lineitem");
			retval = controls.EditTextid(EnterLineitem,Constant.Customername);
			if (retval)
			{
				System.out.println("Line item Product is Entered");
			}
			else
			{
				System.out.println("Line item Product is not Entered");
			}	
			String LineItemClick = getORProperty("Click_Enter");
			retval = controls.Key_Enter(LineItemClick);
			if (retval)
			{
				System.out.println("Line Item is Clicked");
			}
			else
			{
				System.out.println("Line Item is Not Clicked");
			}	
			String SavePOButton = getORProperty("Save_LineSOReleaseID");
			retval = controls.clickobjectid(SavePOButton);
			if (retval)
			{
				System.out.println("Save Button is Clicked");
			}
			else
			{
				System.out.println("Save Button is Not Clicked");
			}
    	/*element=driver.findElement(By.id(Constant.Customer_TextBox));
    	element.sendKeys(Constant.Customername);
    	
    	element=driver.findElement(By.xpath(Constant.Enter_Customer));
    	element.click();
    	element=driver.findElement(By.id("promisedIDwz"));
    	element.click();
    	  DateFormat dateFormat2 = new SimpleDateFormat("dd"); 
          Date date2 = new Date();

          String today = dateFormat2.format(date2); 
    	 WebElement dateWidget = driver.findElement(By.id(Constant.Date_Frame));  
         List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  

         //comparing the text of cell with today's date and clicking it.
         for (WebElement cell : columns)
         {
            if (cell.getText().equals("2"))
            {
               cell.click();
               String s=cell.getText();
               System.out.println(s);
               break;
            }
         }
         Thread.sleep(3000);
         
     	element=driver.findElement(By.id(Constant.Save_PO_Release));
    	element.click();
    	Thread.sleep(15000);
    	element=driver.findElement(By.xpath(Constant.LineItem_Enable));
    	element.click();
    	element=driver.findElement(By.id(Constant.Enter_Lineitem));
    	element.sendKeys(Constant.LineItem1);
    	element=driver.findElement(By.xpath(Constant.Click_Enter));
    	element.click();
    	Thread.sleep(3000);
    	Actions action = new Actions(driver); 
 	   action.sendKeys(Keys.ENTER).build().perform();
 	   element=driver.findElement(By.id(Constant.Save_LineSOReleaseID));
  	   element.click();
 	 
    	//element=driver.findElement(By.name("description"));
    	//element.sendKeys(Keys.TAB);
    	//element.sendKeys(Keys.ENTER);
    	
    	 //element=driver.findElement(By.xpath(".//*[@id='ui-active-menuitem']"));
    	//element.click();
      	 return element;
      	 */
       }
    public static String getORProperty(String propName){
		return OR.getProperty(propName);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		CustomerScenario.driver = driver;
	}

}
