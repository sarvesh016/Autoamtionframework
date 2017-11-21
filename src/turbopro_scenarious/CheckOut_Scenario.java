package turbopro_scenarious;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import utility.Constant;
import webmethods_keyword.WebMethod;

public class CheckOut_Scenario {
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
    
    public static void CreateProduct(WebDriver driver) throws Exception{
    	String Settings = getORProperty("Click_Settings");
    	controls=new WebMethod(driver);
		retval = controls.clickobject(Settings);
		if (retval)
		{
			
			System.out.println("Settings is clicked");
		}
		else
		{

//			  Assert.assertTrue(false);
			
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Settings is not clicked");
		}	
		String ClickBox = getORProperty("Click_Box");
    	
		retval = controls.clickobject(ClickBox);
		if (retval)
		{
			
			System.out.println("Box is clicked");
		}
		else
		{

//			  Assert.assertTrue(false);
			
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Box is not clicked");
		}
     String Language = getORProperty("Select_Language");
    	
		retval = controls.clickobject(Language);
		if (retval)
		{
			
			System.out.println("Language is Selected");
		}
		else
		{

//			  Assert.assertTrue(false);
			
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Language is not Selected");
		}
    	
       }
    public static void SelectProduct(WebDriver driver) throws Exception{
    	controls=new WebMethod(driver);
    	System.out.println("Numer of frames in the page: " + driver.findElements(By.tagName("frame")).size());
    	 String SelectProduct = getORProperty("Click_Product");
     	
 		retval = controls.clickobject(SelectProduct);
 		if (retval)
 		{
 			
 			System.out.println("Product is Selected");
 		}
 		else
 		{

// 			  Assert.assertTrue(false);
 			
 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
 			System.out.println("Product is not Selected");
 		}
String SelectsubProduct = getORProperty("Click_SubProduct");
     	
 		retval = controls.clickobject(SelectsubProduct);
 		if (retval)
 		{
 			
 			System.out.println("Sub Product is Selected");
 		}
 		else
 		{

// 			  Assert.assertTrue(false);
 			
 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
 			System.out.println("Sub Product is not Selected");
 		}
 		//retval=controls.Scrolldown();
 		Thread.sleep(5000);
 		String EnterQuantity = getORProperty("Enter_Quantity");
		retval = controls.EditText(EnterQuantity,Constant.Quantity);
		if (retval)
		{
			System.out.println("Quantity is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Quantity is not Entered");
		}	
		Thread.sleep(5000);
         String NewOrder = getORProperty("Click_NewOrder");
     	
 		retval = controls.clickobject(NewOrder);
 		if (retval)
 		{
 			
 			System.out.println("NewOrder is Clicked");
 		}
 		else
 		{

// 			  Assert.assertTrue(false);
 			
 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
 			System.out.println("NewOrder is not Clicked");
 		}
 	/*	Thread.sleep(8000);
		  Alert alert = driver.switchTo().alert();
	        alert.accept();*/
 		
       String ProceedNext = getORProperty("Click_ProceedNext");
       Thread.sleep(5000);
 		retval = controls.clickobject(ProceedNext);
 		if (retval)
 		{
 			
 			System.out.println("ProceedNext is Clicked");
 		}
 		else
 		{

// 			  Assert.assertTrue(false);
 			
 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
 			System.out.println("ProceedNext is not Clicked");
 		}
 	      String Clickcolour = getORProperty("Click_colour");
 	       Thread.sleep(2000);
 	 		retval = controls.clickobject(Clickcolour);
 	 		if (retval)
 	 		{
 	 			
 	 			System.out.println("colour is Clicked");
 	 		}
 	 		else
 	 		{

// 	 			  Assert.assertTrue(false);
 	 			
 	 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
 	 			System.out.println("Colour is not Clicked");
 	 		}
 	 		String ClickProceed = getORProperty("Click_Proceed");
  	       Thread.sleep(3000);
  	 		retval = controls.clickobject(ClickProceed);
  	 		if (retval)
  	 		{
  	 			
  	 			System.out.println("Proceed is Clicked");
  	 		}
  	 		else
  	 		{

//  	 			  Assert.assertTrue(false);
  	 			
  	 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
  	 			System.out.println("Proceed is not Clicked");
  	 		}
  	 		String ClickCheckbox = getORProperty("Click_CheckBox");
   	       Thread.sleep(3000);
   	 		retval = controls.clickobject(ClickCheckbox);
   	 		if (retval)
   	 		{
   	 			
   	 			System.out.println("CheckBox is Clicked");
   	 		}
   	 		else
   	 		{

//   	 			  Assert.assertTrue(false);
   	 			
   	 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
   	 			System.out.println("CheckBox is not Clicked");
   	 		}
   	 	String linktext = getORProperty("Click_Finish");
	       Thread.sleep(10000);
	 		retval = controls.getlinktext(linktext);
	 		if (retval)
	 		{
	 			
	 			System.out.println("Finish is Clicked");
	 		}
	 		else
	 		{

//	 			  Assert.assertTrue(false);
	 			
	 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
	 			System.out.println("Finish is not Clicked");
	 		}
	 		String ClickCheckout = getORProperty("Click_Checkout");
	   	       Thread.sleep(5000);
	   	 		retval = controls.clickobject(ClickCheckout);
	   	 		if (retval)
	   	 		{
	   	 			
	   	 			System.out.println("Checkout is Clicked");
	   	 		}
	   	 		else
	   	 		{

//	   	 			  Assert.assertTrue(false);
	   	 			
	   	 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
	   	 			System.out.println("Checkout is not Clicked");
	   	 		}
	   	 	String ClickChangeAddress = getORProperty("Click_ChangeAddress");
	   	       Thread.sleep(5000);
	   	 		retval = controls.clickobject(ClickChangeAddress);
	   	 		if (retval)
	   	 		{
	   	 			
	   	 			System.out.println("ChangeAddress is Clicked");
	   	 		}
	   	 		else
	   	 		{

//	   	 			  Assert.assertTrue(false);
	   	 			
	   	 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
	   	 			System.out.println("ChangeAddress is not Clicked");
	   	 		}
	   	 	String EnterName = getORProperty("Enter_Name");
			retval = controls.EditText(EnterName,Constant.Name);
			if (retval)
			{
				System.out.println("Name is Entered");
			}
			else
			{
				controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
				System.out.println("Name is not Entered");
			}
			String EnterCompany = getORProperty("Enter_Company");
			retval = controls.EditText(EnterCompany,Constant.Company);
			if (retval)
			{
				System.out.println("Company is Entered");
			}
			else
			{
				controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
				System.out.println("Company is not Entered");
			}	
			String EnterPhone = getORProperty("Enter_Phone");
			retval = controls.EditText(EnterPhone,Constant.Phone);
			if (retval)
			{
				System.out.println("Phone no is Entered");
			}
			else
			{
				controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
				System.out.println("Phone No is not Entered");
			}	
			String EnterEmail = getORProperty("Enter_Email");
			retval = controls.EditText(EnterEmail,Constant.Email);
			if (retval)
			{
				System.out.println("Email is Entered");
			}
			else
			{
				controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
				System.out.println("Email is not Entered");
			}	
			String EnterAddress1 = getORProperty("Enter_Address1");
			retval = controls.EditText(EnterAddress1,Constant.Address1);
			if (retval)
			{
				System.out.println("Address1 is Entered");
			}
			else
			{
				controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
				System.out.println("Address1 is not Entered");
			}	
			String EnterAddress2 = getORProperty("Enter_Address2");
			retval = controls.EditText(EnterAddress2,Constant.Address2);
			if (retval)
			{
				System.out.println("Address2 is Entered");
			}
			else
			{
				controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
				System.out.println("Address2 is not Entered");
			}	
			String EnterAddress3 = getORProperty("Enter_Address3");
			retval = controls.EditText(EnterAddress3,Constant.Address3);
			if (retval)
			{
				System.out.println("Address3 is Entered");
			}
			else
			{
				controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
				System.out.println("Address3 is not Entered");
			}	
			String Entercity = getORProperty("Enter_City");
			retval = controls.EditText(Entercity,Constant.City);
			if (retval)
			{
				System.out.println("City is Entered");
			}
			else
			{
				controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
				System.out.println("City is not Entered");
			}
			String EnterPostalCode = getORProperty("Enter_postalCode");
			retval = controls.EditText(EnterPostalCode,Constant.PostalCode);
			if (retval)
			{
				System.out.println("PostalCode is Entered");
			}
			else
			{
				controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
				System.out.println("PostalCode is not Entered");
			}
		/*	String SelectCountry = getORProperty("Select_Country");
			retval = controls.DropDown(SelectCountry,Constant.Country);
			if (retval)
			{
				System.out.println("Country is Entered");
			}
			else
			{
				controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
				System.out.println("Country is not Entered");
			}*/
			String ClickCountry = getORProperty("Select_Country");
	   	       Thread.sleep(3000);
	   	 		retval = controls.clickobject(ClickCountry);
	   	   
	   	 		if (retval)
	   	 		{
	   	 			
	   	 			System.out.println("Country is Clicked");
	   	 		}
	   	 		else
	   	 		{

//	   	 			  Assert.assertTrue(false);
	   	 			
	   	 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
	   	 			System.out.println("Country is not Clicked");
	   	 		}
	   	 		
	   	String CountryName = getORProperty("Select_CountryName");
	   	 	Thread.sleep(10000);
	   	 //retval = controls.Scrolldown();
			retval = controls.clickobject(CountryName);
			if (retval)
			{
				
				System.out.println("CountryName is Selected");
			}
			else
			{

// 	 			  Assert.assertTrue(false);
 	 			
 	 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
 	 			System.out.println("CountryName is not Selected");
			}
			
			String ClickSavebutton = getORProperty("Click_Save");
	   	       Thread.sleep(3000);
	   	 		retval = controls.clickobject(ClickSavebutton);
	   	 		if (retval)
	   	 		{
	   	 			
	   	 			System.out.println("SaveButton is Clicked");
	   	 		}
	   	 		else
	   	 		{

//	   	 			  Assert.assertTrue(false);
	   	 			
	   	 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
	   	 			System.out.println("SaveButon is not Clicked");
	   	 		}
	   			String Clickproceed = getORProperty("Click_Proceed1");
		   	       Thread.sleep(3000);
		   	 		retval = controls.clickobject(Clickproceed);
		   	 		if (retval)
		   	 		{
		   	 			
		   	 			System.out.println("Proceed is Clicked");
		   	 		}
		   	 		else
		   	 		{

//		   	 			  Assert.assertTrue(false);
		   	 			
		   	 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
		   	 			System.out.println("Proceed is not Clicked");
		   	 		}
		   	 	String ClickCheckBox1 = getORProperty("Click_Checkbox1");
		   	       Thread.sleep(3000);
		   	 		retval = controls.clickobject(ClickCheckBox1);
		   	 		if (retval)
		   	 		{
		   	 			
		   	 			System.out.println("CheckBox is Clicked");
		   	 		}
		   	 		else
		   	 		{

//		   	 			  Assert.assertTrue(false);
		   	 			
		   	 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
		   	 			System.out.println("CheckBox is not Clicked");
		   	 		}
		   	 	String ClickProceed2 = getORProperty("Click_Proceed2");
		   	       Thread.sleep(3000);
		   	 		retval = controls.clickobject(ClickProceed2);
		   	 		if (retval)
		   	 		{
		   	 			
		   	 			System.out.println("Proceed is Clicked");
		   	 		}
		   	 		else
		   	 		{

//		   	 			  Assert.assertTrue(false);
		   	 			
		   	 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
		   	 			System.out.println("Proceed is not Clicked");
		   	 		}
		   	  	String LinkInvoice = getORProperty("Click_LinkInvoice");
		   	       Thread.sleep(3000);
		   	 		retval = controls.clickobject(LinkInvoice);
		   	 		if (retval)
		   	 		{
		   	 			
		   	 			System.out.println("LinkInvoice is Clicked");
		   	 		}
		   	 		else
		   	 		{

//		   	 			  Assert.assertTrue(false);
		   	 			
		   	 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
		   	 			System.out.println("LinkInvoice is not Clicked");
		   	 		}
		   	   	String Proceed3 = getORProperty("Click_Proceed3");
		   	       Thread.sleep(3000);
		   	 		retval = controls.clickobject(Proceed3);
		   	 		if (retval)
		   	 		{
		   	 			
		   	 			System.out.println("Proceed is Clicked");
		   	 		}
		   	 		else
		   	 		{

//		   	 			  Assert.assertTrue(false);
		   	 			
		   	 			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
		   	 			System.out.println("Proceed is not Clicked");
		   	 		}
    }
    
    public static String getORProperty(String propName){
		return OR.getProperty(propName);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		CheckOut_Scenario.driver = driver;
	}

}
