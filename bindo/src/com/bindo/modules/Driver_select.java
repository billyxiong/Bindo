package com.bindo.modules;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.bindo.util.Read_properties;

public class Driver_select {
public static WebDriver driver;
public static String value = Read_properties.getPropertyString("BROWSER_TYPE");

public static WebDriver getDriver() {
if (value.equals("IE")) {
	System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe"); 
DesiredCapabilities ieCapabilities = DesiredCapabilities
.internetExplorer();
ieCapabilities
.setCapability(
InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
true);

return driver = new InternetExplorerDriver(ieCapabilities);

} else if (value.equals("Chrome")) {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
return driver = new ChromeDriver();
} else {
System.setProperty("webdriver.firefox.bin",
"C:/Program Files/Mozilla Firefox/firefox.exe");
return driver = new FirefoxDriver();

}

}
}