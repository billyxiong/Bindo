package com.coolead.test_scripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.coolead.modules.Add_OwnerProgress_Report;
import com.coolead.modules.Driver_select;
import com.coolead.modules.Login_Action;
import com.coolead.util.Constant;

public class Test_AddOwnerProgressReport {
	WebDriver driver = Driver_select.getDriver();    
	String baseUrl = Constant.Url;
	
  @Test
  	public void AddProject() throws Exception {
	    
	  Add_OwnerProgress_Report.add( driver);
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  	driver.get(baseUrl + "/");
	  	driver.manage().window().maximize();
		Thread.sleep(2000);
		Login_Action.execute(driver, Constant.user_name, Constant.password);
		Thread.sleep(2000);	
//		Add_OwnerProgress_Report.delete();
  }

  @AfterMethod
  public void afterMethod() throws Exception {	    		  
	   //  driver.navigate().refresh();
	   //driver.quit();
}
}
