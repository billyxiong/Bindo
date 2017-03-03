package com.coolead.modules;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.coolead.page_object.TaskPage;
import com.coolead.util.Constant;
public class Add_Task {
	public static void execute(WebDriver driver ) throws Exception{
		TaskPage taskPage = new TaskPage(driver);
		taskPage.task_menu().click();
		Thread.sleep(5000);		
		taskPage.task_new_button().click();
		Thread.sleep(5000);	
		//选择项目
		new Select(taskPage.task_project()).selectByVisibleText(Constant.projectname);
		//点击执行人列表	
		Thread.sleep(2000);
		taskPage.task_excutor_list().click();	
		Thread.sleep(10000);
		taskPage.task_excutor_search().sendKeys(Constant.real_name);
		taskPage.task_excutor_select().click();
		taskPage.task_excutor_select_button().click();
		Thread.sleep(2000);
		taskPage.task_title().sendKeys(Constant.task_title);
		Thread.sleep(2000);
		taskPage.task_content().sendKeys(Constant.task_content);
		taskPage.task_accepter_list().click();
		Thread.sleep(1000);
		taskPage.task_accepter_search().sendKeys(Constant.real_name);
		taskPage.task_accepter_select().click();
		taskPage.task_accepter_select_button().click();
		taskPage.task_submit().click();
		Thread.sleep(2000);
	}
}
