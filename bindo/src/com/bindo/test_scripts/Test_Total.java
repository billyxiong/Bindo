package com.bindo.test_scripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.bindo.modules.Login;
import com.bindo.modules.Driver_select;
import com.bindo.modules.Register;
import com.bindo.modules.Order;
import com.bindo.util.Constant;
import com.bindo.util.GetDriver;

public class Test_Total {
//	WebDriver driver = Driver_select.getDriver();  
	String baseUrl = Constant.url;
	@BeforeTest
	public void open_url() throws Exception{
		
		  //获取远程浏览器
		  WebDriver driver=GetDriver.getRemoteChromedriver();
		  driver.get(baseUrl + "/");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  driver.navigate().refresh();
		  Thread.sleep(2000);
	}
	
	  @Test
	  public void login() throws Exception{	
		  WebDriver driver=GetDriver.getRemoteChromedriver();
		  Login.execute(driver);
	  }
	  @Test
	  public void order() throws Exception {
		  WebDriver driver=GetDriver.getRemoteChromedriver();
		  Order.execute(driver);	  
	  }	
	  @Test
	  public void register() throws Exception{
		  WebDriver driver=GetDriver.getRemoteChromedriver();
		  Register.execute(driver);
	  }

}
