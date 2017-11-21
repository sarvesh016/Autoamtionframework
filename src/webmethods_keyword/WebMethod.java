package webmethods_keyword;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utility.Constant;

public class WebMethod {
private WebDriver driver;
	
	public WebMethod(WebDriver dr)	
	{
		driver = dr;
	}
	
	public boolean clickobject(String objprop)
	{
		boolean Success = false;
		try
		{
			WebElement obj = driver.findElement(By.xpath(objprop));
			obj.click();
			Success = true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return Success;
		
	}
	public boolean clickobjectid(String objprop)
	{
		boolean Success = false;
		try
		{
			WebElement obj = driver.findElement(By.id(objprop));
			obj.click();
			Success = true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return Success;
		
	}
	public boolean MovetoElement(String objprop)
	{
		boolean Success = false;
		try
		{
			WebElement obj = driver.findElement(By.id(objprop));
			
			Actions actions = new Actions(driver);

			actions.moveToElement(obj).click().perform();
			Success = true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return Success;
		
	}
	public boolean getlinktext(String objprop)
	{
		boolean Success = false;
		try
		{
			WebElement obj = driver.findElement(By.cssSelector(objprop));
			obj.click();
			Success = true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return Success;
		
	}
	
	public boolean EditText(String objprop, String value)
	{
		boolean Success = false;
		try
		{
			WebElement Edit = driver.findElement(By.xpath(objprop));
			Edit.sendKeys(value);
			Success = true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return Success;		
	} //EditText method end
	public boolean EditTextid(String objprop, String value)
	{
		boolean Success = false;
		try
		{
			WebElement Edit = driver.findElement(By.id(objprop));
			Edit.sendKeys(value);
			Success = true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return Success;		
	} 
	
	public boolean SelectRadio(String objprop, int index)
	{
		boolean Success = false;
		try
		{
			List<WebElement> Radio = driver.findElements(By.xpath(objprop));
			Radio.get(index).click();
			Success = true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return Success;		
	} //EditText method end
	
	public boolean SelectItem(String objprop, String value)
	{
		boolean Success = false;
		try
		{
			WebElement dropdown = driver.findElement(By.xpath(objprop));
			dropdown.click();
			
			/*Select itm = new Select(dropdown);
			itm.selectByVisibleText(value);*/
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return Success;		
	} //EditText method end
	public boolean Key_Enter(String objprop)
	{
		boolean Success = false;
		try
		{
			WebElement obj = driver.findElement(By.xpath(objprop));
			obj.click();
			Thread.sleep(3000);
	    	Actions action = new Actions(driver); 
	 	    action.sendKeys(Keys.ENTER).build().perform();
			Success = true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return Success;
		
	}
	//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	public boolean TakeScreenShot(WebDriver Driver,String Filepath)
	{
		boolean Success = false;
		try
		{
			TakesScreenshot scrnshot=((TakesScreenshot)Driver);
			File ScrFile=scrnshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ScrFile, new File(Filepath));
			Success = true;
		}
		
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		return Success;
		
	}
	/*public boolean sendEmail(String message, String testCaseName)
	{
		boolean Success = false;
		try{
			MailMessage mail = new MailMessage();
			mail.To.Add("your-to-email-address-goes-here");
			mail.From = new MailAddress("your-from-email-address-goes-here ");
			mail.Subject = "your-mail-subject-goes-here";
			mail.Body = "Test Case Name: " + testCaseName;
			mail.Body += Environment.NewLine;
			mail.Body += message;
			SmtpClient smtp = new SmtpClient();
			smtp.Host = "localhost";
			smtp.Port = 25;
			smtp.Send(mail);
			Success = true;
		}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return Success;
	
}*/
	public  boolean selectCheckBox(String objprop){
		boolean Success = false;
		try{
			WebElement cbox = driver.findElement(By.xpath(objprop));
			if(!cbox.isSelected()){
				cbox.click();
				Success = true;
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return Success;
	}
	
	public  boolean unSelectCheckBox(String objprop){
		boolean Success = false;
		try{
			WebElement cbox = driver.findElement(By.xpath(objprop));
			if(cbox.isSelected()){
				cbox.click();
				Success = true;
			}
		}catch(Exception e){
			e.printStackTrace();	
		}
		return Success;
	}
	public  boolean DropDown(String objprop,String value){
		boolean Success = false;
		try{
			WebElement elm = driver.findElement(By.xpath(objprop));
			//elm.click();
			Select selDropDown = new Select(elm);
			//printing all selected values
			System.out.println("***************************");
			List<WebElement> selectedList = selDropDown.getAllSelectedOptions();
			System.out.println("Selected options: ");
			for(WebElement el:selectedList){
				System.out.println(el.getText());			
			}
			/*System.out.println("***************************");
			selDropDown.selectByVisibleText(value);*/
		}catch(Exception e){
			e.printStackTrace();	
		}
		return Success;
        }	
	public boolean HandlingFramewithindex(String Tagname, String value)
	{
		boolean Success = false;
		try
		{
			System.out.println("Numer of frames in the page: " + driver.findElements(By.tagName(Tagname)).size());
			
			driver.switchTo().frame(value); 
			Success=true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return Success;		
	}
	public boolean HandlingFramewithXpath(String objprop)
	{
		boolean Success = false;
		try
		{	
			driver.switchTo().frame(driver.findElement(By.xpath(objprop))); 
			//Switch to frame with webelement
 
			Success=true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return Success;		
	}
	public boolean Switchtomainpage()
	{
		boolean Success = false;
		try
		{	
			//Switching to main page
			driver.switchTo().defaultContent();

 
			Success=true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return Success;		
	}
	public boolean Scrolldown()
	{
		boolean Success = false;
		try
		{	
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)", "");

 
			Success=true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return Success;		
	}
	public boolean DoubleClick(String objprop)
	{
		boolean Success = false;
		try
		{	
			Actions action = new Actions(driver);
			WebElement element=driver.findElement(By.xpath(objprop));

			//Double click
			action.doubleClick(element).perform();

 
			Success=true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return Success;		
	}
	public boolean DatePicker(String objprop, String objprop1)
	{
		boolean Success = false;
		try
		{
			  DateFormat dateFormat2 = new SimpleDateFormat("dd"); 
	          Date date2 = new Date();

	          String today = dateFormat2.format(date2); 
	    	 WebElement dateWidget = driver.findElement(By.id(objprop));  
	         List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  

	         //comparing the text of cell with today's date and clicking it.
	         for (WebElement cell : columns)
	         {
	            if (cell.getText().equals(objprop1))
	            {
	               cell.click();
	               String s=cell.getText();
	               System.out.println(s);
	               Success=true;
	               break;
	            }else{
	            	Success=false;
	            }
	         }
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return Success;		
	}

	
	
}
