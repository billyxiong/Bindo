package com.coolead.modules;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.coolead.page_object.AddOwnerProgressPage;
import com.coolead.util.Constant;
import com.coolead.util.Mysql;

public class Add_OwnerProgress_Report {
	public static void add(WebDriver driver ) throws Exception{
		AddOwnerProgressPage addOwnerProgressPage = new AddOwnerProgressPage(driver);
		addOwnerProgressPage.report_menu().click();
		Thread.sleep(1000);
		addOwnerProgressPage.report_new_button().click();
		addOwnerProgressPage.report_owner_progress_menu().click();
		Thread.sleep(1000);
		new Select(addOwnerProgressPage.report_project_list()).selectByVisibleText(Constant.projectname);
		Thread.sleep(1000);
		addOwnerProgressPage.report_reviewer_list().click();
		Thread.sleep(1000);
		addOwnerProgressPage.report_reviewer_select().click();
		addOwnerProgressPage.report_reviewer_select_confirm().click();
		addOwnerProgressPage.report_owner_progress_amount().sendKeys(Constant.amount);
		addOwnerProgressPage.report_owner_progress_comment().sendKeys(Constant.owner_progress_report_comment);
		Thread.sleep(1000);
		addOwnerProgressPage.report_owner_progress_submit().click();		
	}
	
	public  static void delete(){
		 String   sql = "delete from sch_rpt_monthly where comment = " +"\""  +Constant.owner_progress_report_comment +"\"";//SQL语句  
		   Mysql    db1 = new Mysql(sql);//创建连接对象  
		   int ret = 0; 
		   
		   try {  
		            ret = db1.pst.executeUpdate() ;       
		           
		            db1.close();//关闭连接  
		        } 
		   			catch (SQLException e) 
		   			{  
		            e.printStackTrace();  
		   			}  
	}
}
