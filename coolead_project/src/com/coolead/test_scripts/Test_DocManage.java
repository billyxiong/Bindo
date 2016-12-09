package com.coolead.test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.coolead.modules.Doc_Manage;
import com.coolead.modules.Driver_select;
import com.coolead.modules.Login_Action;
import com.coolead.util.Constant;

public class Test_DocManage {
	WebDriver driver = Driver_select.getDriver(); 
	String baseUrl = Constant.Url;
		
	 @Test
	 public void DocManage() throws Exception {
		 Doc_Manage.add_folder(driver);
		 Doc_Manage.upload_file(driver);
		 Doc_Manage.del_file(driver);
		 Doc_Manage.del_foler(driver);		 
	 }
	 
	  @BeforeMethod
	  public void beforeMethod() throws Exception {
		  driver.get(baseUrl + "/");
		  	driver.manage().window().maximize();
			Thread.sleep(1000);
			Login_Action.execute(driver, Constant.username, Constant.password);	
			Thread.sleep(1000);		  }
	 

	  @AfterMethod
	  public void afterMethod() throws Exception {
		//  driver.quit();
	  }
}
