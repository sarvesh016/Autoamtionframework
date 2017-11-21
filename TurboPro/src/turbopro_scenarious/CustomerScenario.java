package turbopro_scenarious;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

import utility.Constant;

public class CustomerScenario {
	private static WebElement element = null;
	
    public static WebElement CompanyModule(WebDriver driver){
   	 Actions Builder=new Actions(driver);
   	Builder.moveToElement(driver.findElement(By.xpath(".//*[@id='mainMenuCompanyPage']/a"))).moveToElement(driver.findElement(By.xpath(".//*[@id='mainMenuCompanyPage']/ul/li[1]/a"))).moveToElement(driver.findElement(By.xpath(".//*[@id='mainMenuCompanyPage']/ul/li[1]/ul/li[4]/a"))).click().build().perform();
	   
   	return element;
   	 
    }
    
    public static WebElement CreateSalesOrder(WebDriver driver) throws InterruptedException{
    	element=driver.findElement(By.xpath("//input [@class='add']"));
    	element.click();
    	element=driver.findElement(By.id("CustomerNameGeneral"));
    	element.sendKeys(Constant.Customername);
    	element=driver.findElement(By.xpath("html/body/ul[21]/li/a"));
    	element.click();
    	element=driver.findElement(By.id("promisedIDwz"));
    	element.click();
    	  DateFormat dateFormat2 = new SimpleDateFormat("dd"); 
          Date date2 = new Date();

          String today = dateFormat2.format(date2); 
    	 WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));  
         List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  

         //comparing the text of cell with today's date and clicking it.
         for (WebElement cell : columns)
         {
            if (cell.getText().equals(today))
            {
               cell.click();
               break;
            }
         }
         Thread.sleep(3000);
         
     	element=driver.findElement(By.id("SavePOReleaseID"));
    	element.click();
    	Thread.sleep(15000);
    	element=driver.findElement(By.xpath("html/body/div[11]/div[2]/div[2]/ul/li[2]/a"));
    	element.click();
    	element=driver.findElement(By.id("new_row_itemCode"));
    	element.sendKeys(Constant.LineItem1);
    	element=driver.findElement(By.xpath("html/body/ul[23]/li[1]/a"));
    	element.click();
    	Thread.sleep(3000);
    	Actions action = new Actions(driver); 
 	   action.sendKeys(Keys.ENTER).build().perform();
 	   element=driver.findElement(By.id("SaveLineSOReleaseID"));
  	   element.click();
 	 
    	//element=driver.findElement(By.name("description"));
    	//element.sendKeys(Keys.TAB);
    	//element.sendKeys(Keys.ENTER);
    	
    	 //element=driver.findElement(By.xpath(".//*[@id='ui-active-menuitem']"));
    	//element.click();
      	 return element;
      	 
       }
    

}
