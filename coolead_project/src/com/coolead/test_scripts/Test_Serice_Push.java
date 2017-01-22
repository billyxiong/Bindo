package com.coolead.test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.coolead.modules.Add_Organization;
import com.coolead.modules.Driver_select;
import com.coolead.modules.Login_Action;
import com.coolead.modules.Service_Push;
import com.coolead.util.Constant;

public class Test_Serice_Push {
	WebDriver driver = Driver_select.getDriver(); 
	String baseUrl = Constant.Url;
		
	 @Test
	  public void f() throws Exception {
		  Service_Push.execute(driver);
	  }	  
	  
	  @BeforeMethod
	  public void beforeMethod() throws Exception {
		  driver.get(baseUrl + "/");
		  	driver.manage().window().maximize();
			Thread.sleep(1000);
			Login_Action.execute(driver, Constant.username, Constant.password);
			Thread.sleep(5000);	
	  }
	 

	  @AfterMethod
	  public void afterMethod() throws Exception {
		//  driver.quit();
		 }

}
