package com.bindo.modules;
import org.openqa.selenium.WebDriver;
import com.bindo.page_object.RegisterPage;
import com.bindo.util.Constant;
public class Register {
	public static void execute(WebDriver driver ) throws Exception{
		RegisterPage register = new RegisterPage(driver);
		Thread.sleep(5000);
		register.register_link().click();
		Thread.sleep(5000);
		register.name_input().sendKeys(Constant.username);
		register.email_input().sendKeys(Constant.email);
		register.password_input().sendKeys(Constant.pasword);
		register.repeat_password().sendKeys(Constant.pasword);
		register.singn_up_button().click();
	}	
}
