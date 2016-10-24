package com.coolead.test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.coolead.modules.Add_Organization;
import com.coolead.modules.Driver_select;
import com.coolead.modules.Login_Action;
import com.coolead.modules.RebackOwnerProgressReport;
import com.coolead.util.Constant;

public class Test_Reback_Owner_Progress_Report {
	WebDriver driver = Driver_select.getDriver();    
	String baseUrl = Constant.Url;
	
  @Test
  public void f() throws Exception {
	  RebackOwnerProgressReport.execute(driver);
  }
  
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  driver.get(baseUrl + "/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  Login_Action.execute(driver, Constant.user_name, Constant.password);
  } 

  
  @AfterMethod
  public void afterMethod() throws Exception {
	//  Add_Organization.delete(driver);
	//  driver.quit();
	 }
}
