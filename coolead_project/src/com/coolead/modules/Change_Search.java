package com.coolead.modules;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.coolead.page_object.ChangePage;
import com.coolead.util.Constant;

public class Change_Search {
	public static void execute(WebDriver driver ) throws Exception{
		ChangePage changePage = new ChangePage(driver);
		changePage.Change_List_Menu().click();
		Thread.sleep(2000);
		new Select(changePage.Change_List_Project_Select()).selectByVisibleText(Constant.projectname);
		new Select(changePage.Change_List_Type_Select()).selectByVisibleText(Constant.change_type);
		new Select(changePage.Change_List_Status_Select()).selectByVisibleText(Constant.change_status);
		changePage.Change_List_Execute_Input().sendKeys(Constant.change_executor);
		changePage.Change_List_Search_Button().click();
	}
}