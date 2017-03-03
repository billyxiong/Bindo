package com.coolead.modules;


import org.openqa.selenium.WebDriver;

import com.coolead.page_object.LoginPage;
import com.coolead.util.Constant;

public class Login_Action {
	
	public static  void execute(WebDriver driver ,String username ,String password)
	throws Exception{
//		Log.info("---------------打或网页---------------");
		driver.get(Constant.Url);
		
		LoginPage loginPage = new LoginPage(driver);
		
//		Log.info("----------------输入用户名--------------");
		loginPage.username().sendKeys(username);
		Thread.sleep(1000);
	
		
//		Log.info("-----------------输入密码-----------------");
		loginPage.password().sendKeys(password);
		Thread.sleep(1000);
	
		
//		Log.info("-----------------点击登录功能按钮-------------");
		loginPage.loginButton().click();
		
//		Log.info("-----------点击登录后休眠5秒-------------------");
		Thread.sleep(2000);
	}
}
