package utility;

import org.openqa.selenium.WebDriver;

public class DriverUtility {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		DriverUtility.driver = driver;
	}

}
