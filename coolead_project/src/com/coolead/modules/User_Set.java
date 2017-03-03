package com.coolead.modules;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.coolead.page_object.UserSetPage;

public class User_Set {
	public static void execute(WebDriver driver ) throws Exception{
		UserSetPage userSetPage = new UserSetPage(driver);	
		userSetPage.user_menu().click();
		Thread.sleep(1000);
		userSetPage.user_icon_button().click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("d:/upload/upload.exe");
		Thread.sleep(1000);
		for (int i=0;i<5;i++)
		{
			new Actions(driver).dragAndDropBy(userSetPage.user_canvas(),1,10).build().perform();
		}
		for(int i=0;i<5;i++)
		{
			new Actions(driver).dragAndDropBy(userSetPage.user_canvas(),10,0).build().perform();
		}	
		userSetPage.user_save_button().click();
		Thread.sleep(1000);
		
//		userSetPage.user_menu().click();
//		Thread.sleep(2000);
//		userSetPage.user_password_tab().click();
//		userSetPage.user_password_old().clear();
//		userSetPage.user_password_old().sendKeys(Constant.password);
//		userSetPage.user_password_new().sendKeys(Constant.pasword_new);
//		userSetPage.user_password_confirm().sendKeys(Constant.pasword_new);
//		userSetPage.user_password_save_button().click();
//		Thread.sleep(1000);
		
//		userSetPage.user_menu().click();
//		Thread.sleep(2000);
//		userSetPage.user_details_tab().click();		
//		userSetPage.user_details_phone().clear();
//		userSetPage.user_details_phone().sendKeys(Constant.org_phone);
//		userSetPage.user_details_mem().clear();
//		userSetPage.user_details_mem().sendKeys(Constant.mem);
//		userSetPage.user_icon_tab().click();
//		Thread.sleep(2000);
//		userSetPage.user_details_save_button().click();
	}
}
