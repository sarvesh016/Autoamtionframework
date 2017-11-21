package googlePlaceAPI;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

d.manage().window().maximize();
d.get("https://www.google.co.in/maps/@16.3665257,42.2311574,3z?hl=en");
System.out.println("Numer of frames in the page: " + d.findElements(By.tagName("frame")).size());
WebElement e=d.findElement(By.xpath("//input[@class='tactile-searchbox-input']"));
/*e.sendKeys("India");
System.out.println(e.getAttribute("value"));*/
List<WebElement> spans = e.findElements(By.tagName("span"));
for (WebElement span : spans)
{
    String text = span.getText();
    System.out.println(text);
}

	}

}
