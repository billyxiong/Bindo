package com.bindo.test_scripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.bindo.util.Constant;
import com.bindo.util.GetDriver;
import com.bindo.modules.Driver_select;
import com.bindo.modules.Login;
import com.bindo.modules.Order;


public class Test_Order {
	WebDriver driver = Driver_select.getDriver();  
	String baseUrl = Constant.url;
	  @BeforeMethod
	  public void login() throws Exception{	
			//获取远程浏览器
//		  driver=GetDriver.getRemoteChromedriver(Constant.remoteNodeUrl);
		  driver.get(baseUrl + "/");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.navigate().refresh();
		  Login.execute(driver);
	  }
	  @Test
	  public void order() throws Exception{
		  Order.execute(driver);
	  }
}
