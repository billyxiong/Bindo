package com.coolead.test_scripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.coolead.modules.Add_Organization;
import com.coolead.modules.Driver_select;
import com.coolead.modules.Login_Action;
import com.coolead.util.Constant;

public class Test_Total {
	WebDriver driver = Driver_select.getDriver();  
	String baseUrl = Constant.Url;
	  @BeforeMethod
	  public void login() throws Exception{	
		  driver.get(baseUrl + "/");
		  driver.manage().window().maximize();
		  Login_Action.execute(driver, Constant.username, Constant.password);
	  }
	  @Test
	  public void Add_Org() throws Exception {
		  Add_Organization.execute(driver);		  
	  }	  
	  @Test
	  public void Add_User() throws Exception {
		  com.coolead.modules.Add_User.add(driver);
	  }	  
	  @Test
	  public void Add_Dictionary() throws Exception{
		  com.coolead.modules.Add_Dictionary.execute(driver);
	  }
	  @Test
	  public void Add_Subject() throws Exception{
		  com.coolead.modules.Add_Dictionary_Subject.execute(driver);
		  com.coolead.modules.Add_Dictionary_Subject.delete();
	  }
	  @Test
	  public void Add_Project() throws Exception{
		  com.coolead.modules.Add_Project.add(driver);		  
	  }
	  @Test
	  public void Project_Authority() throws Exception{
		  com.coolead.modules.Project_Authoriy.add(driver);
	  }
	  @Test
	  public void Add_Meeting() throws Exception{
		  com.coolead.modules.Add_Meeting.execute(driver);
	  }
	  @Test
	  public void Add_Plan() throws Exception{
		  com.coolead.modules.Add_Plan.add(driver);
		  com.coolead.modules.Add_Plan.delete();
	  }
}
