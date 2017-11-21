package turbopro_scenarious;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.Constant;
import webmethods_keyword.WebMethod;

public class DigiFin {
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
	
   
    
    public static void Create_ClientDetails(WebDriver driver) throws Exception{
    	
    	String EnterEmail = getORProperty("Enter_Email");
    	controls=new WebMethod(driver);
		retval = controls.EditText(EnterEmail, Constant.DigiFinEmail);
		if (retval)
		{
			
			System.out.println("Email is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Email is not Entered");
		}	
		String ClickConfirm = getORProperty("Click_Confirm");
    	
		retval = controls.clickobject(ClickConfirm);
		if (retval)
		{
			
			System.out.println("Confirm is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Confirm is not Clicked");
		}	
		String EnterPanDetails = getORProperty("Pan_Details");
    	
		retval = controls.EditText(EnterPanDetails, Constant.PanDetails);
		if (retval)
		{
			
			System.out.println("Pan Datails is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Pan Datails is not Entered");
		}	
		String Date = getORProperty("Click_Date");
    
		retval = controls.clickobject(Date);
		if (retval)
		{
			
			System.out.println("Date is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Date is not Clicked");
		}	
		String Date1 = getORProperty("Click_Date1");
    	
		retval = controls.clickobject(Date1);
		if (retval)
		{
			
			System.out.println("Date1 is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Date1 is not Clicked");
		}	
		String Month = getORProperty("Click_Month");
    	
		retval = controls.clickobject(Month);
		if (retval)
		{
			
			System.out.println("Month is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Month is not Clicked");
		}	
		String Month1 = getORProperty("Click_Month1");
    	
		retval = controls.clickobject(Month1);
		if (retval)
		{
			
			System.out.println("Month1 is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Month1 is not Clicked");
		}	
		String Year = getORProperty("Click_Year");
    	
		retval = controls.clickobject(Year);
		if (retval)
		{
			
			System.out.println("Year is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Year is not Clicked");
		}	
		String Year1 = getORProperty("Click_Year1");
    	
		retval = controls.clickobject(Year1);
		if (retval)
		{
			
			System.out.println("Year1 is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Year1 is not Clicked");
		}	
		String Verify = getORProperty("Click_Verify");
    	
		retval = controls.clickobject(Verify);
		if (retval)
		{
			
			System.out.println("Verify is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Verify is not Clicked");
		}	
		Thread.sleep(20000);
String Skip= getORProperty("Click_Skip");
    	
		retval = controls.clickobject(Skip);
		if (retval)
		{
			
			System.out.println("Skip is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Skip is not Clicked");
		}	
		String DigiName= getORProperty("Click_Name");
    	
		retval = controls.clickobject(DigiName);
		if (retval)
		{
			
			System.out.println("Name is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Name is not Clicked");
		}	
		String DigiMr= getORProperty("Click_MR");
    	
		retval = controls.clickobject(DigiMr);
		if (retval)
		{
			
			System.out.println("MR is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("MR is not Clicked");
		}	
String EnterFirstName = getORProperty("Enter_FirstName");
    	
		retval = controls.EditText(EnterFirstName, Constant.FirstName);
		if (retval)
		{
			
			System.out.println("FirstName is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("FirstName is not Entered");
		}	
String EnterMiddleName = getORProperty("Enter_MiddelName");
    	
		retval = controls.EditText(EnterMiddleName, Constant.MiddleName);
		if (retval)
		{
			
			System.out.println("MiddleName is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("MiddleName is not Entered");
		}	
String EnterLastName = getORProperty("Enter_LastName");
    	
		retval = controls.EditText(EnterLastName, Constant.LastName);
		if (retval)
		{
			
			System.out.println("LastName is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("LastName is not Entered");
		}	
String CorrespondanceAddress= getORProperty("Enter_CorrespondanceAddress");
    	
		retval = controls.clickobject(CorrespondanceAddress);
		if (retval)
		{
			
			System.out.println("CorrespondanceAddress is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("CorrespondanceAddress is not Clicked");
		}	
String ResedentialAddress= getORProperty("Enter_ResedentialAddress");
    	
		retval = controls.clickobject(ResedentialAddress);
		if (retval)
		{
			
			System.out.println("ResedentialAddress is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("ResedentialAddress is not Clicked");
		}	
String DigiAddress1 = getORProperty("Enter_Address1");
    	
		retval = controls.EditText(DigiAddress1, Constant.DigiAddress1);
		if (retval)
		{
			
			System.out.println("DigiAddress1 is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("DigiAddress1 is not Entered");
		}	
String DigiCity = getORProperty("Enter_City");
    	
		retval = controls.EditText(DigiCity, Constant.DigiCity);
		if (retval)
		{
			
			System.out.println("DigiCity is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("DigiCity is not Entered");
		}	
String DigiDistrict = getORProperty("Enter_District");
    	
		retval = controls.EditText(DigiDistrict, Constant.DigiDistrict);
		if (retval)
		{
			
			System.out.println("DigiDistrict is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("DigiDistrict is not Entered");
		}	
String DigiPincode = getORProperty("Enter_PinCode");
    	
		retval = controls.EditText(DigiPincode, Constant.DigiPinCode);
		if (retval)
		{
			
			System.out.println("DigiPinCode is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("DigiPinCode is not Entered");
		}	
String EnterMobile = getORProperty("Enter_MobileNo");
    	
		retval = controls.EditText(EnterMobile, Constant.DigiMobile);
		if (retval)
		{
			
			System.out.println("DigiMobile is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("DigiMobile is not Entered");
		}	
String GenerateOTP= getORProperty("Generate_OTP");
    	
		retval = controls.clickobject(GenerateOTP);
		if (retval)
		{
			
			System.out.println("Generate OTP Is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Generate OTP Is Not Clicked");
		}	
String EnterOTP = getORProperty("Enter_OTP");
    	
		retval = controls.EditText(EnterOTP, Constant.OTP);
		if (retval)
		{
			
			System.out.println("OTP is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("OTP is not Entered");
		}	
String ClickVerify= getORProperty("Click_Verify1");
    	
		retval = controls.clickobject(ClickVerify);
		if (retval)
		{
			
			System.out.println("Verify is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Verify not Clicked");
		}	
String EnterBankAccount = getORProperty("Enter_BankAccount");
    	
		retval = controls.EditText(EnterBankAccount, Constant.BankAccountno);
		if (retval)
		{
			
			System.out.println("BankAccountno is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("BankAccountno is not Entered");
		}	
		Thread.sleep(2000);
String ReEnterBankAccount = getORProperty("Reenter_BankAccount");
    	
		retval = controls.EditText(ReEnterBankAccount, Constant.ReenterBankAccountno);
		if (retval)
		{
			
			System.out.println("ReenterBankAccountno is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("ReenterBankAccountno is not Entered");
		}	
		Thread.sleep(2000);
String Bank = getORProperty("Enter_Bank");
    	
		retval = controls.EditText(Bank, Constant.Bank);
		if (retval)
		{
			
			System.out.println("Bank is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Bank is not Entered");
		}	
		Thread.sleep(2000);
String BankName= getORProperty("Enter_BankName");
    	
		retval = controls.clickobject(BankName);
		if (retval)
		{
			
			System.out.println("BankName Is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("BankName Is Not Clicked");
		}
String Next= getORProperty("Enter_Next");
    	
		retval = controls.clickobject(Next);
		if (retval)
		{
			
			System.out.println("Next Is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Next Is Not Clicked");
		}
String EducationQualification= getORProperty("Select_EducationQualification");
    	
		retval = controls.clickobject(EducationQualification);
		if (retval)
		{
			
			System.out.println("EducationQualification Is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("EducationQualification Is Not Clicked");
		}
String Education= getORProperty("Select_Education");
    	
		retval = controls.clickobject(Education);
		if (retval)
		{
			
			System.out.println("Education Is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Education Is Not Clicked");
		}
String FatherFirstName = getORProperty("Enter_FatherFirstName");
    	
		retval = controls.EditText(FatherFirstName, Constant.FatherFirstName);
		if (retval)
		{
			
			System.out.println("FatherFirstName is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("FatherFirstName is not Entered");
		}	
String FatherLastName = getORProperty("Enter_FatherLastName");
    	
		retval = controls.EditText(FatherLastName, Constant.FatherLastName);
		if (retval)
		{
			
			System.out.println("FatherLastName is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("FatherLastName is not Entered");
		}	
String MotherFirstName = getORProperty("Enter_MotherFirstName");
    	
		retval = controls.EditText(MotherFirstName, Constant.MotherFirstName);
		if (retval)
		{
			
			System.out.println("MotherFirstName is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("MotherFirstName is not Entered");
		}	
String MotherLastName = getORProperty("Enter_MotherLastName");
    	
		retval = controls.EditText(MotherLastName, Constant.MotherLastName);
		if (retval)
		{
			
			System.out.println("MotherLastName is Entered");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("MotherLastName is not Entered");
		}	
String Occupation= getORProperty("Select_Occupation");
    	
		retval = controls.clickobject(Occupation);
		if (retval)
		{
			
			System.out.println("Occupation Is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Occupation Is Not Clicked");
		}
String ClickOccupation= getORProperty("Enter_Occupation");
    	
		retval = controls.clickobject(ClickOccupation);
		if (retval)
		{
			
			System.out.println("Qualification Is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Qualification Is Not Clicked");
		}
String ClickNetworth= getORProperty("Click_NetWorth");
    	
		retval = controls.clickobject(ClickNetworth);
		if (retval)
		{
			
			System.out.println("Networth Is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Networth Is Not Clicked");
		}
String AnnualIncome= getORProperty("Click_AnnualIncome");
    	
		retval = controls.clickobject(AnnualIncome);
		if (retval)
		{
			
			System.out.println("AnnualIncome Is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("AnnualIncome Is Not Clicked");
		}
String ConfirmandContinue= getORProperty("Click_ConfirmandContinue");
    	
		retval = controls.clickobject(ConfirmandContinue);
		if (retval)
		{
			
			System.out.println("ConfirmandContinue Is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("ConfirmandContinue Is Not Clicked");
		}
String CheckBox= getORProperty("Click_CheckBox");
    	
		retval = controls.clickobject(CheckBox);
		if (retval)
		{
			
			System.out.println("CheckBox Is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("CheckBox Is Not Clicked");
		}
String Continue= getORProperty("Click_Continue");
    	
		retval = controls.clickobject(Continue);
		if (retval)
		{
			
			System.out.println("Continue Is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("Continue Is Not Clicked");
		}
		Thread.sleep(2000);
String Pancard= getORProperty("Click_PancardUpload");
    	
		retval = controls.clickobject(Pancard);
		if (retval)
		{
			
			System.out.println("Upload is Clicked");
		}
		else
		{
			controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
			System.out.println("upload Is Not Clicked");
		}
		 Runtime.getRuntime().exec("E:\\Selenium\\Aadhar.exe");
		 Thread.sleep(2000);
		 String Clientphoto= getORProperty("Click_ClientPhoto");
	    	
			retval = controls.clickobject(Clientphoto);
			if (retval)
			{
				
				System.out.println("Upload is Clicked");
			}
			else
			{
				controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
				System.out.println("upload Is Not Clicked");
			}
			 Runtime.getRuntime().exec("E:\\Selenium\\Aadhar.exe");
			 String SignedCheque= getORProperty("Select_SignedCheck");
		    	
				retval = controls.clickobject(SignedCheque);
				if (retval)
				{
					
					System.out.println("SignedCheque is Clicked");
				}
				else
				{
					controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
					System.out.println("SignedCheque Is Not Clicked");
				}
				 String Personalised= getORProperty("Click_Personalised");
			    	
					retval = controls.clickobject(Personalised);
					if (retval)
					{
						
						System.out.println("Personalised is Clicked");
					}
					else
					{
						controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
						System.out.println("Personalised Is Not Clicked");
					}
					
String SignedChequeUpload= getORProperty("Upload_SignedCheque");
			    	
					retval = controls.clickobject(SignedChequeUpload);
					if (retval)
					{
						
						System.out.println("upload is Clicked");
					}
					else
					{
						controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
						System.out.println("upload Is Not Clicked");
					}
					Thread.sleep(2000);
					Runtime.getRuntime().exec("E:\\Selenium\\SignedCheck.exe");
String AddressProof= getORProperty("Select_AddressProof");
			    	
					retval = controls.clickobject(AddressProof);
					if (retval)
					{
						
						System.out.println("AddressProof is Clicked");
					}
					else
					{
						controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
						System.out.println("AddressProof Is Not Clicked");
					}	
String BankStatement= getORProperty("click_BankStatement");
			    	
					retval = controls.clickobject(BankStatement);
					if (retval)
					{
						
						System.out.println("BankStatement is Clicked");
					}
					else
					{
						controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
						System.out.println("BankStatement Is Not Clicked");
					}	
String UploadBankstatement= getORProperty("Upload_Bankstatement");
			    	
					retval = controls.clickobject(UploadBankstatement);
					if (retval)
					{
						
						System.out.println("upload is Clicked");
					}
					else
					{
						controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
						System.out.println("upload Is Not Clicked");
					}			
					Thread.sleep(2000);
					Runtime.getRuntime().exec("E:\\Selenium\\AddressProof.exe");
String DigiSubmit= getORProperty("Click_DigiSubmit");
			    	
					retval = controls.clickobject(DigiSubmit);
					if (retval)
					{
						
						System.out.println("Submit is Clicked");
					}
					else
					{
						controls.TakeScreenShot(driver, Constant.ScreenShot_Path);
						System.out.println("Submit Is Not Clicked");
					}
    }
		
    public static String getORProperty(String propName){
		return OR.getProperty(propName);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		DigiFin.driver = driver;
	}

}
