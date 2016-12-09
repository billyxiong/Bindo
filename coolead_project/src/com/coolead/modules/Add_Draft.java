package com.coolead.modules;
import org.openqa.selenium.WebDriver;
import com.coolead.page_object.DraftPage;
import com.coolead.util.Constant;

public class Add_Draft {
	public static void execute(WebDriver driver ) throws Exception{
		DraftPage draftPage = new DraftPage(driver);	
		draftPage.em_draft_menu().click();
		Thread.sleep(1000);
		draftPage.em_draft_summary().sendKeys(Constant.draft_summary);
		draftPage.em_draft_frame().click();
		draftPage.em_draft_content().sendKeys(Constant.draft_content);
		draftPage.em_draft_submit_button().click();
	}
	
}

