package retrivedata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatatoExcel {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.manage().window().maximize();
	driver.get("http://www.mciindia.org/InformationDesk/IndianMedicalRegister.aspx");
	driver.findElement(By.xpath(".//*[@id='dnn_ctr588_IMRIndex_Link_Council']")).click();
	driver.findElement(By.xpath(".//*[@id='dnn_ctr588_IMRIndex_Drp_StateCouncil']")).click();
	driver.findElement(By.xpath(".//*[@id='dnn_ctr588_IMRIndex_Drp_StateCouncil']/option[20]")).click();
	driver.findElement(By.xpath(".//*[@id='dnn_ctr588_IMRIndex_Submit_Btn']")).click();
	//WebElement elm=driver.findElement(By.xpath(".//*[@id='dnn_ctr588_IMRIndex_GV_Search']"));
	
	//System.out.println(elm.getText());


	//get the table
	    WebElement statusTable = driver.findElement(By.xpath(".//*[@id='dnn_ctr588_IMRIndex_GV_Search']"));

	    //Get all the rows in the table
	    List<WebElement> allRows = statusTable.findElements(By.tagName("tr"));

	    //Get the size(row no) of allRows
	    int rowSize = allRows.size();
	    System.out.println(rowSize);


	    // locate the test xls file             
	  File file = new File("E:\\New folder\\data.xls");              
	  // create input stream                
	  FileInputStream fis = new FileInputStream(file);              
	  // create workbook                
	  HSSFWorkbook wb = new HSSFWorkbook(fis);              
	  // get sheet              
	  HSSFSheet sheet1 = wb.getSheet("Sheet1");             
	  // get rows               


	   HSSFRow row;             

	    for (int i=0; i<rowSize; i++) 
	    {
	        WebElement webRow = allRows.get(i);
	        //Get all cell values in each row
	        List<WebElement> allCells = webRow.findElements(By.tagName("td"));
	        //System.out.println(allCells.size());

	        if(allCells.size() > 1)
	        {
	            HSSFRow excelRow = sheet1.createRow(i);

	            for (int j=0; j<allCells.size(); j++) 
	            {
	                WebElement webCell = allCells.get(j);
	                String text = webCell.getText();
	                if(text.length()>2)
	                {
	                    Cell excelCell = excelRow.createCell(j);
	                    excelCell.setCellValue(webCell.getText());
	                }                   
	            }
	        }
	    }

	}

}
