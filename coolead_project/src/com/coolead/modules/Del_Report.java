package com.coolead.modules;

import org.openqa.selenium.WebDriver;
import com.coolead.page_object.DelReportPage;

public class Del_Report {
	public static void execute(WebDriver driver ) throws Exception{
		DelReportPage delReport = new DelReportPage(driver);
		delReport.report_menu().click();
		Thread.sleep(2000);	
		delReport.report_select().click();
		delReport.report_delete().click();
		Thread.sleep(1000);
		delReport.report_delete_confirm().click();
	}
}
