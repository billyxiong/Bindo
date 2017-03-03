package com.coolead.modules;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.coolead.page_object.AddMeetingPage;
import com.coolead.util.Constant;

public class Add_Meeting {
	public static void execute(WebDriver driver ) throws Exception{
		AddMeetingPage addMeetingPage = new AddMeetingPage(driver);	
		addMeetingPage.Meeting_Menu().click();
		Thread.sleep(2000);
		addMeetingPage.Meeting_New_Button().click();
		Thread.sleep(1000);
		new Select(addMeetingPage.Meeting_Projct_Select()).selectByVisibleText(Constant.projectname);
		addMeetingPage.Meeting_Name_Input().sendKeys(Constant.meeting_name);
		addMeetingPage.Meeting_Date_Panel().click();
		addMeetingPage.Meeting_Date_Select().click();
		addMeetingPage.Meeting_Organization_Input().sendKeys(Constant.meeting_organzation);
		new Select(addMeetingPage.Meeting_Type_Select()).selectByVisibleText(Constant.meeting_type);
		addMeetingPage.Meeting_Content_Input().sendKeys(Constant.meeting_content);
		addMeetingPage.Meeting_submit_Button().click();
	}
}
