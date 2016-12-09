package com.coolead.test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.coolead.modules.Driver_select;
import com.coolead.modules.Login_Action;
import com.coolead.util.Constant;
import com.coolead.modules.User_Set;

public class Test_UserSet {
		WebDriver driver = Driver_select.getDriver();  
		String baseUrl = Constant.Url;
	  @Test
	  public void user_set() throws Exception {
          User_Set.execute(driver);
	  }
	  
	  @BeforeMethod
	  public void login() throws Exception{	
		  driver.get(baseUrl + "/");
		  	driver.manage().window().maximize();
		  	Login_Action.execute(driver, Constant.username, Constant.password);
	  }
	  
	  @AfterMethod
	  public void clear() throws Exception{

	  }
}	  	 

