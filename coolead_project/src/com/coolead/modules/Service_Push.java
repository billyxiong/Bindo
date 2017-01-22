package com.coolead.modules;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.coolead.page_object.ServicePushPage;
import com.coolead.util.Constant;

public class Service_Push {
	public static void execute(WebDriver driver ) throws Exception{
		ServicePushPage servicepushPage = new ServicePushPage(driver);
		servicepushPage.Online_Service_Menu().click();
		Thread.sleep(1000);		
		servicepushPage.Service_Push_New().click();
		Thread.sleep(1000);
		//点击选择项目		
		servicepushPage.Service_Push_Project().click();		
		new Select(servicepushPage.Service_Push_Project()).selectByVisibleText(Constant.projectname);
		servicepushPage.Service_Push_Title().sendKeys(Constant.service_push_title);
		Thread.sleep(1000);
		servicepushPage.Service_Receiver_List().click();
		Thread.sleep(10000);
		servicepushPage.Service_Receiver_Search().sendKeys(Constant.user_name);
		servicepushPage.Service_Receiver_select().click();
//		Actions builder = new Actions(driver);
//		builder.moveToElement(servicepushPage.Service_Receiver_select_Button()).perform();
//		builder.click().perform();
		servicepushPage.Service_Receiver_select_Button().click();
		Thread.sleep(1000);
		servicepushPage.Service_Push_content().sendKeys(Constant.service_push_content);
		servicepushPage.Service_Push_Button().click();
		Thread.sleep(1000);
		servicepushPage.Service_Push_Confirm().click();
		Thread.sleep(1000);
		servicepushPage.Service_Push_Select().click();
		Thread.sleep(1000);
		servicepushPage.Service_Push_Validate().click();
	}
}
