package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;





public class Constant {
	private static Properties OR=null;
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
	
	//Login URL
	
	public static final String URL = "http://localhost:1234/turbotracker/turbo/";
	public static final String URL1 = "http://conxion.linknetwork-dev.dk:8080/";
	public static final String URL2 = "http://67.211.223.28/DigifinDiy/";
	//LoginPage
	public static   String LoginPage = getORProperty("Turbo_Pro_LoginPage");
	public static   String LoginPage1 = getORProperty("Conxion_LoginPage");
	 //Login Username and Password
    public static final String Username = "TesteR";

    public static final String Password = "tester321";
    
    public static   String User = getORProperty("Turbo_Pro_UserName");
    public static   String User1 = getORProperty("Conxion_UserName");
    public static   String PWD = getORProperty("Turbo_Pro_Password");
    public static   String PWD1 = getORProperty("Conxion_Password");
    public static   String Login = getORProperty("Turbo_Pro_Login");
    public static   String Login1 = getORProperty("Conxion_Login");
    //Customer Scenario
    public static final String Customername = "Credit card Sal";
    
    public static final String LineItem1 = "REABBJ621-101";
    
    public static final String Path_TestData = "C://Users//sarvesh//sai//TurboPro//src//testdata//";
    public static final String ScreenShot_Path ="E://testresults//"+System.currentTimeMillis()+"png";
    		 
    public static final String File_TestData = "testdata.xls";
    public static final String Date="3";
    
	public static final int Col_TestCaseName = 0;	
	 
	public static final int Col_UserName =1 ;

	public static final int Col_Password = 2;

	public static final int Col_Browser = 3;
	
	public static   String Company_Customer = getORProperty("Company_Customer");
	public static   String Customer_SalesOrder = getORProperty("Customer_SalesOrder");
	public static   String salesorder = getORProperty("salesorder");
	
	//Create Sales Order
	public static   String ADD = getORProperty("ADD");
	public static   String Customer_TextBox = getORProperty("Customer_TextBox");
	public static   String Enter_Customer = getORProperty("Enter_Customer");
	public static   String Promised_Date=getORProperty("Promised_Date");
	public static   String Date_Frame = getORProperty("Date_Frame");
	public static   String Save_PO_Release = getORProperty("Save_PO_Release");
	public static   String LineItem_Enable = getORProperty("LineItem_Enable");
	public static   String Enter_Lineitem = getORProperty("Enter_Lineitem");
	public static   String Click_Enter = getORProperty("Click_Enter");
	public static   String Save_LineSOReleaseID = getORProperty("Save_LineSOReleaseID");
	
	//Settings
	public static   String Settings = getORProperty("Click_Settings");
	public static   String Box = getORProperty("Click_Box");
	public static   String Language = getORProperty("Select_Language");
	
	//SelectProduct
	
	  public static final String Quantity = "600";
	  //ChangeAddress
	  public static final String Name="Sai Sarvesh";
	  public static final String Company="Constient";
	  public static final String Phone="9874561230";
	  public static final String Email="sarvesh@constient.com";
	  public static final String Address1="37-1-409(12A)";
	  public static final String Address2="Santhome main Road";
	  public static final String Address3="Chennai";
	  public static final String City="Chennai";
	  public static final String PostalCode="600004";
	  public static final String Country="India";
	  
	/*public void loadOR(){
		OR = new Properties();
		try{
			FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir") + "\\TurboPro\\src\\config\\OR.properties");
			OR.load(fis1);
			fis1.close();
		}catch(Exception e){
			e.printStackTrace();ss
		}
	}*/
	  
	//DIGIFIN
	  public static final String DigiFinEmail="sarvesh@constient.com";
	  public static final String PanDetails="ATPPV1077Q";
	  public static final String FirstName="Sai Sarvesh";
	  public static final String MiddleName="Babu";
	  public static final String LastName="Dadi";
	  public static final String DigiAddress1="37-1-409(12A)BhagyaNagar";
	  public static final String DigiCity="ongole";
	  public static final String DigiDistrict="Prakasam";
	  public static final String DigiPinCode="523001";
	  public static final String DigiMobile="7842655231";
	  public static final String OTP="001643";
	  public static final String BankAccountno="2222222222222222";
	  public static final String ReenterBankAccountno="2222222222222222";
	  public static final String Bank="H";
	  public static final String FatherFirstName="Hanumantha Rao";
	  public static final String FatherLastName="Dadi";
	  public static final String MotherFirstName="Anuradha";
	  public static final String MotherLastName="Dadi";
	  
	  
	public static String getORProperty(String propName){
		return OR.getProperty(propName);
	}
}
