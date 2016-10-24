package com.coolead.modules;

import java.sql.SQLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.coolead.page_object.AddUserPage;
import com.coolead.util.Constant;
import com.coolead.util.Mysql;

public class Add_User {
	public static void add(WebDriver driver ) throws Exception{
		AddUserPage addUserPage = new AddUserPage(driver);
		addUserPage.user_menu_system().click();
		Thread.sleep(1000);
		addUserPage.user_menu_user().click();
		Thread.sleep(1000);
		addUserPage.user_add().click();
		Thread.sleep(1000);
		addUserPage.user_username().sendKeys(Constant.user_name);
		addUserPage.user_realname().sendKeys(Constant.real_name);
		addUserPage.user_phone().sendKeys(Constant.org_phone);
		addUserPage.user_company_drop().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constant.user_company)).click();			
		addUserPage.user_department_drop().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constant.user_department)).click();	
		addUserPage.role_drop().click();
		Thread.sleep(1000);
		addUserPage.role_select().click();
		addUserPage.user_save().click();
	}
	
	public static void delete() {
		String   sql = "delete from sys_user where user_name = " +"\""  +Constant.user_name +"\"";//SQL语句  
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
