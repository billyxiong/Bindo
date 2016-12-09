package com.coolead.modules;
import org.openqa.selenium.WebDriver;
import com.coolead.page_object.UserSetPage;
import com.coolead.util.Constant;

public class User_Set {
	public static void execute(WebDriver driver ) throws Exception{
		UserSetPage userSetPage = new UserSetPage(driver);	
		userSetPage.user_menu().click();
		Thread.sleep(1000);
		userSetPage.user_icon_button().click();
		Runtime.getRuntime().exec("d:/upload/upload.exe");
		Thread.sleep(2000);
		userSetPage.user_password_tab().click();
		Thread.sleep(1000);
		userSetPage.user_password_old().clear();
		userSetPage.user_password_old().sendKeys(Constant.password);
		userSetPage.user_password_new().sendKeys(Constant.pasword_new);
		userSetPage.user_password_confirm().sendKeys(Constant.pasword_new);
		userSetPage.user_details_tab().click();
		Thread.sleep(1000);
		userSetPage.user_details_phone().clear();
		userSetPage.user_details_phone().sendKeys(Constant.org_phone);
		userSetPage.user_details_mem().clear();
		userSetPage.user_details_mem().sendKeys(Constant.mem);
		userSetPage.user_icon_tab().click();
		Thread.sleep(1000);
		userSetPage.user_save_button().click();
	}
}
