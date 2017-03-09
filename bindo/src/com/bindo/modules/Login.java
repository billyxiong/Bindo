package com.bindo.modules;
import org.openqa.selenium.WebDriver;
import com.bindo.page_object.LoginPage;
import com.bindo.util.Constant;
public class Login {
	public static void execute(WebDriver driver ) throws Exception{
		LoginPage login = new LoginPage(driver);
		login.email_input().clear();
		login.email_input().sendKeys(Constant.email);
		login.password_input().clear();
		login.password_input().sendKeys(Constant.pasword);
		Thread.sleep(2000);
		login.login_button().click();
	}	
}
