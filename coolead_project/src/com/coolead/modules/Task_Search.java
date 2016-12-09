package com.coolead.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.coolead.page_object.TaskPage;
import com.coolead.util.Constant;


public class Task_Search {
	public static void execute(WebDriver driver ) throws Exception{
		TaskPage taskPage = new TaskPage(driver);
		new Select(taskPage.project_select()).selectByVisibleText(Constant.project_name);
		new Select(taskPage.type_select()).selectByVisibleText(Constant.task_type);
		new Select(taskPage.status_select()).selectByVisibleText(Constant.task_status);
		taskPage.distributor_input().sendKeys(Constant.task_distributor);
		taskPage.executor_input().sendKeys(Constant.task_executor);
		taskPage.search_button().click();
	}
}
