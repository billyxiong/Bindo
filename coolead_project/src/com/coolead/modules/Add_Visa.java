package com.coolead.modules;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.coolead.page_object.VisaPage;
import com.coolead.util.Constant;
import com.coolead.util.Mysql;

public class Add_Visa {
	public static void execute(WebDriver driver ) throws Exception{
		VisaPage addVisa = new VisaPage(driver);	
		addVisa.visa_menu().click();
		Thread.sleep(1000);
		addVisa.visa_new_button().click();
		Thread.sleep(1000);
		new Select(addVisa.visa_project_list()).selectByVisibleText(Constant.projectname);
		addVisa.visa_code().sendKeys(Constant.subject_code);
		addVisa.visa_title().sendKeys(Constant.visa_title);
		new Select(addVisa.visa_company()).selectByVisibleText(Constant.org_name);
		addVisa.visa_holder().click();
		Thread.sleep(1000);
		addVisa.visa_holder_input_text().sendKeys(Constant.user_name);
		Thread.sleep(1000);
		addVisa.visa_holder_select_button().click();
		addVisa.visa_holder_confirm_button().click();
		addVisa.visa_content().sendKeys(Constant.visa_content);
		addVisa.visa_sumit_button().click();
		addVisa.visa_sumit_confirm().click();
	}
	public static void delete() {
		String   sql = "delete from visa_info where visa_title = " +"\""  +Constant.visa_title +"\"";//SQL语句  
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
