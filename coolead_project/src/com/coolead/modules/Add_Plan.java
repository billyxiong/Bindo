package com.coolead.modules;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.coolead.page_object.AddPlanPage;
import com.coolead.util.Constant;
import com.coolead.util.Mysql;

public class Add_Plan {
	public static void add(WebDriver driver ) throws Exception{
		AddPlanPage addPlanPage = new AddPlanPage(driver);
		addPlanPage.plan_menu().click();
		Thread.sleep(1000);
		addPlanPage.plan_new_button().click();
		Thread.sleep(1000);
		new Select(addPlanPage.plan_project_list()).selectByVisibleText(Constant.projectname);
		Thread.sleep(2000);
		addPlanPage.start_time_panel().click();
		Thread.sleep(1000);
		addPlanPage.start_time_select().click();
		addPlanPage.end_time_panel().click();
		Thread.sleep(1000);
		addPlanPage.end_time_select().click();
		addPlanPage.plan_amount_input().sendKeys(Constant.amount);
		addPlanPage.plan_remark_input().sendKeys(Constant.subject_remark);
		addPlanPage.plan_submit_button().click();
		Thread.sleep(1000);
		addPlanPage.plan_confirm_button().click();
	}
	public static void delete() {
		String   sql = "delete from sch_general_plan where remark = " +"\""  +Constant.subject_remark +"\"";//SQL语句  
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
