package com.coolead.util;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGridCapturePicture {
	private WebDriver driver;
	DesiredCapabilities capability;
	String baseUrl;

@BeforeMethod
public void setUp(){
	baseUrl = "http://www.sogou.com";
	String browser="chrome";
	String remoteNodeUrl="http://192.168.0.252:5555";
	if(browser.equals("ie")) capability=DesiredCapabilities.internetExplorer();
	else if (browser.equals("firefox")) capability=DesiredCapabilities.firefox();
	else if (browser.equals("chrome")) capability=DesiredCapabilities.chrome();
	else  System.out.println("浏览器参数有误，只能为ie,firefox,chrome");
	capability.setPlatform(Platform.XP);
	String url= remoteNodeUrl + "/wd/hub";
	URL urlInstance = null;
	try{
		urlInstance = new URL(url);
	}
	catch(MalformedURLException e){
		e.printStackTrace();
		System.out.println("实例化url报错，检查url格式是否正确");
	}
	driver = new RemoteWebDriver(urlInstance ,capability);
 }
@Test
public void test() throws IOException{
	driver.get(baseUrl+"/");
	driver.findElement(By.id("query")).sendKeys("光荣之路自动化测试");
	driver.findElement(By.id("stb")).click();
	(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
		public Boolean apply(WebDriver d){
			return d.findElement(By.id("s_footer")).getText().contains("搜索帮助");
		}		
	});
	System.out.println("title:"+driver.getTitle());
	driver=new Augmenter().augment(driver);
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("c:\\screenshot.png"));
}
@AfterMethod
public void quit(){
	driver.close();
}
}
