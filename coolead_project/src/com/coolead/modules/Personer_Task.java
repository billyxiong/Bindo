package com.coolead.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.coolead.page_object.PersonerTaskPage;
import com.coolead.util.Constant;

public class Personer_Task {
	public static void execute(WebDriver driver ) throws Exception{
		PersonerTaskPage personerTaskPage = new PersonerTaskPage(driver);
		personerTaskPage.Personer_Task_Menu().click();
		Thread.sleep(1000);
//	    personerTaskPage.Personer_Task_Title().click();
		driver.findElement(By.xpath(Constant.my_visa_task_title)).click();
		Thread.sleep(1000);
		personerTaskPage.Personer_Task_Input().sendKeys(Constant.do_task_input);
		personerTaskPage.Personer_Task_Send_Button().click();
		Thread.sleep(1000);
		personerTaskPage.Personer_Task_Menu().click();
//		Thread.sleep(1000);
//		personerTaskPage.Personer_Task_Title().click();
//		Thread.sleep(1000);
//		personerTaskPage.Personer_Task_Input().sendKeys(Constant.do_task_input);
//		personerTaskPage.Personer_Task_Send_Button().click();
//		Thread.sleep(1000);
//		personerTaskPage.Personer_Task_Menu().click();
	}
}
