package com.coolead.modules;


import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

import com.coolead.page_object.AddSubjectPage;
import com.coolead.util.Constant;
import com.coolead.util.Mysql;
public class Add_Dictionary_Subject {
	public static void execute(WebDriver driver ) throws Exception{
		AddSubjectPage add_subject = new AddSubjectPage(driver);
		add_subject.system_menu().click();
		Thread.sleep(1000);
		add_subject.dictionary_menu().click();
		Thread.sleep(1000);
		add_subject.subject_config_button().click();
		Thread.sleep(1000);
		add_subject.subject_new_button().click();
		Thread.sleep(1000);
		add_subject.subject_code().sendKeys(Constant.subject_code);
		add_subject.subject_name().sendKeys(Constant.subject_name);
		add_subject.subject_value().sendKeys(Constant.subject_value);
		add_subject.subject_order().sendKeys(Constant.subject_value);
		add_subject.subject_save_button().click();
	}
	
	public static void delete() {
		String   sql = "delete from sys_dict_item where item_name = " +"\""  +Constant.subject_name +"\"";//SQL语句  
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
