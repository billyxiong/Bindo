package com.coolead.modules;
import org.openqa.selenium.WebDriver;
import com.coolead.page_object.DocPage;
import com.coolead.util.Constant;


public class Doc_Manage {
	public static void add_folder(WebDriver driver ) throws Exception{
		DocPage doc_page = new DocPage(driver);
		doc_page.em_doc_menu().click();
		Thread.sleep(2000);
		doc_page.em_doc_new().click();
		Thread.sleep(1000);
		doc_page.em_doc_new_order_input().sendKeys(Constant.doc_order);
		doc_page.em_doc_new_name_input().sendKeys(Constant.doc_name);
		doc_page.em_doc_new_confirm_button().click();
		Thread.sleep(1000);
		doc_page.em_doc_folder_close().click();
		doc_page.em_doc_folder_select().click();
		doc_page.em_doc_set_rights_button().click();
		Thread.sleep(1000);
		doc_page.em_doc_add_rights_button().click();
		Thread.sleep(1000);
		doc_page.em_doc_add_rights_project_new().click();
		Thread.sleep(1000);
		doc_page.em_doc_project_search_input().sendKeys(Constant.projectname);
		Thread.sleep(2000);
		doc_page.em_doc_project_select_button().click();
		doc_page.em_doc_project_confirm_button().click();
		doc_page.em_doc_project_user_new().click();
		Thread.sleep(1000);
		doc_page.em_doc_project_click_button().click();
		Thread.sleep(1000);		
		doc_page.em_doc_project_select_tag().click();		
		doc_page.em_doc_user_search_input().sendKeys(Constant.real_name);
		Thread.sleep(2000);
		doc_page.em_doc_user_select_tag().click();
		doc_page.em_doc_user_confirm_button().click();
		Thread.sleep(1000);
		doc_page.em_doc_download_select().click();
		doc_page.em_doc_create_select().click();
		doc_page.em_doc_modify_select().click();
		doc_page.em_doc_delete_select().click();
		doc_page.em_doc_rights_select().click();
		doc_page.em_doc_rights_confirm().click();
		Thread.sleep(2000);
		doc_page.em_doc_rights_close().click();
	}
	
	public static void del_foler(WebDriver driver ) throws Exception{
		DocPage doc_page = new DocPage(driver);
		doc_page.em_doc_homepage_link().click();
		Thread.sleep(2000);
		doc_page.em_doc_folder_select().click();
		doc_page.em_doc_folder_delete().click();
		doc_page.em_doc_folder_delete_confirm().click();	
	}
	
	public static void upload_file(WebDriver driver) throws Exception{
		DocPage doc_page = new DocPage(driver);
		doc_page.em_doc_menu().click();
		Thread.sleep(1000);
		doc_page.em_doc_folder_link().click();
		Thread.sleep(1000);
		doc_page.em_doc_upload_button().click();
		Thread.sleep(1000);
		doc_page.em_doc_file_select().click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("d:/upload/upload.exe");
		Thread.sleep(2000);
		doc_page.em_doc_upload_submit().click();
		doc_page.em_doc_folder_close().click();
		Thread.sleep(2000);
	}
	
	public static void del_file(WebDriver driver ) throws Exception{
		DocPage doc_page = new DocPage(driver);
		doc_page.em_file_del_select().click();
		doc_page.em_file_del_button().click();
		doc_page.em_file_del_confirm().click();
		Thread.sleep(2000);
	}	
}

