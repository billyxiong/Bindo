package com.coolead.modules;

import org.openqa.selenium.WebDriver;

import com.coolead.page_object.RebackOwnerProgressPage;
import com.coolead.util.Constant;


public class RebackOwnerProgressReport {
	public static void execute(WebDriver driver ) throws Exception{
		RebackOwnerProgressPage rebackProgressPage = new RebackOwnerProgressPage(driver);
		rebackProgressPage.report_Menu().click();
		Thread.sleep(2000);
		rebackProgressPage.owener_progress_title().click();
		Thread.sleep(2000);
		rebackProgressPage.Owner_Progress_reback_select().click();
		rebackProgressPage.owener_progress_reback_comment().sendKeys(Constant.reback_owner_progress_report_comment);
		rebackProgressPage.owner_progress_reback_submit().click();
	}
}
