package android;

import java.awt.Event;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Appium {

 WebDriver driver;

 @BeforeTest
 public void setUp() throws MalformedURLException {
  // Created object of DesiredCapabilities class.
  DesiredCapabilities capabilities = new DesiredCapabilities();

  // Set android deviceName desired capability. Set your device name.
  capabilities.setCapability("deviceName", "42f71107adb99f93");
  //42f71107adb99f93
  //Sai Sarvesh(SHV-E210K)
  // Set BROWSER_NAME desired capability. It's Android in our case here.
  capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

  // Set android VERSION desired capability. Set your mobile device's OS version.
  capabilities.setCapability(CapabilityType.VERSION, "4.4.4");
  //4.4.4

  // Set android platformName desired capability. It's Android in our case here.
  capabilities.setCapability("platformName", "Android");

  // Set android appPackage desired capability. It is
  // com.android.calculator2 for calculator application.
  // Set your application's appPackage if you are using any other app.
  capabilities.setCapability("appPackage", "com.bofin.bank");
  

  // Set android appActivity desired capability. It is
  // com.android.calculator2.Calculator for calculator application.
  // Set your application's appPackage if you are using any other app.
  //Sign in Activity
 //capabilities.setCapability("appActivity", ".view.signin.activities.SignInActivity");
  capabilities.setCapability("appActivity",".view.getstarted.activities.SplashActivity");
  //appActivity
  // Created object of RemoteWebDriver will all set capabilities.
  // Set appium server address and port number in URL string.
  // It will launch calculator app in android device.
  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 }

 @Test
 public void Sum() {
  // Click on DELETE/CLR button to clear result text box before running test.
	 try{
  driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'bofin_sign_in_one_signup_txt') and @text='Sign Up to Bofin']")).click();
		// driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'bofin_getstarted_fb_rel')]")).click();	 
  driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'bofin_getstarted_bofin_rel')]")).click();
 driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'bofin_getstarted_getstarted_btn')]")).click();
 WebElement elm= driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'bofin_sign_in_one_email_edt')]"));
 elm.click();
		 elm.sendKeys("sarvesh@constient.com");
		driver.navigate().back();
		  driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'bofin_sign_in_one_login_img')]")).click();	 
		  driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'bofin_sign_in_two_pwd_edt')]")).sendKeys("Test@123");
		  driver.navigate().back(); 
		  driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'bofin_sign_in_two_login_img')]")).click();	 
		  driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'bofin_home_profile_complete_now_txt')]")).click();	
		  driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'bofin_profile_basic_lin')]")).click();	
		  driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'bofin_profile_basic_about_me_complete_txt')]")).click();
		  driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'bofin_about_me_first_name_edt')]")).sendKeys("sarvesh");
		  driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'bofin_about_me_last_name_edt')]")).sendKeys("sai");
		  driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'bofin_about_me_display_name_edt')]")).click();
		  driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'bofin_display_custom_name_edt')]")).sendKeys("saisang");
		  driver.navigate().back(); 
		  driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'bofin_display_name_save_btn')]")).click();
		  driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'bofin_about_me_gender_edt')]")).click();
		  driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'bofin_lnc_gender_male_img')]")).click();
		  driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'bofin_about_me_birth_day_edt')]")).click();
		  driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'ok')]")).click();
		  driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'bofin_about_me_born_in_edt')]")).click();
		
		  driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'search_src_text')]")).sendKeys("india");
		  
		  driver.findElement(By.className("android.widget.RelativeLayout")).click();
		  driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'bofin_about_me_save_btn')]")).click();
		  driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'bofin_profile_contact_detail_complete_txt')]")).click();
		  driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'bofin_adp_contact_info_add_lin')]")).click();
		  driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'bofin_my_address_address_one_txt')]")).click();
		  driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'autocomplete_places')]")).sendKeys("123");
		  driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'predictedRow')]")).click();
		  driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'bofin_my_address_label_txt')]")).click();
		  driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'bofin_lnc_label_personal_img')]")).click();
		  driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'bofin_my_address_save_btn')]")).click();
	 }catch(Exception e){
		 e.printStackTrace();
	 }
  // Click on number 2 button.
  //driver.findElement(By.name("2")).click();

  // Click on + button.
  //driver.findElement(By.name("+")).click();

  // Click on number 5 button.
  //driver.findElement(By.name("5")).click();

  // Click on = button.
  //driver.findElement(By.name("=")).click();

  // Get result from result text box.
  //String result = driver.findElement(By.className("android.widget.EditText")).getText();
  //System.out.println("Number sum result is : " + result);

 }

@AfterTest
 public void End() {
  driver.quit();
 }
}