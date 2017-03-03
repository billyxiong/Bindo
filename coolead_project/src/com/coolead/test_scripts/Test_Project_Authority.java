package com.coolead.test_scripts;
import org.testng.annotations.Test;
import com.coolead.modules.Driver_select;
import com.coolead.modules.Login_Action;
import com.coolead.util.Constant;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import com.coolead.modules.Project_Authoriy;

public class Test_Project_Authority {
	WebDriver driver = Driver_select.getDriver();  
	String baseUrl = Constant.Url;
	
  @Test
  public void test_project_authoriry() throws Exception {
	 Project_Authoriy.add(driver);
  }
  
  @BeforeMethod
  public void login() throws Exception {
	  driver.get(baseUrl + "/");
	  	driver.manage().window().maximize();
	  	Login_Action.execute(driver, Constant.username, Constant.password);
	  	Thread.sleep(1000);
  }

  @AfterMethod
  public void afterMethod() throws Exception {
//	  driver.navigate().refresh();
//	  Thread.sleep(1000);
	  driver.quit();
  }
}
