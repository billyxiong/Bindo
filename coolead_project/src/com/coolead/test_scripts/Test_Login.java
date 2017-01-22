package com.coolead.test_scripts;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.coolead.modules.Driver_select;
import com.coolead.modules.Login_Action;
import com.coolead.util.Constant;

public class Test_Login {
	WebDriver driver = Driver_select.getDriver();
	String baseUrl = Constant.Url;
	
	@Test
	public void test_login() throws Exception{
		driver.get(baseUrl + "/");
		Thread.sleep(10000);
		Login_Action.execute(driver, Constant.username, Constant.password);
		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains(Constant.assertText));		
	}
	
	@BeforeMethod
	public void beforeMethod(){
		
		DOMConfigurator.configure("log4j.xml");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	@AfterMethod
	public void afterMethod(){
		Assert.assertTrue(driver.getPageSource().contains(Constant.assertText));
		driver.quit(); //关闭浏览器
	}
}
