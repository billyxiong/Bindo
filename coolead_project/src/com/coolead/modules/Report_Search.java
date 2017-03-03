package com.coolead.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.coolead.page_object.ReportPage;
import com.coolead.util.Constant;

public class Report_Search {
	public static void execute(WebDriver driver ) throws Exception{
		ReportPage reportPage = new ReportPage(driver);
		reportPage.report_menu().click();
		Thread.sleep(2000);
		new Select(reportPage.report_project_select()).selectByVisibleText(Constant.projectname);
		new Select(reportPage.report_type_select()).selectByVisibleText(Constant.report_type);
		reportPage.report_author_input().sendKeys(Constant.report_author);
		reportPage.report_search_button().click();
	}
}