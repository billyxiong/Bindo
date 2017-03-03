package com.coolead.modules;
import java.sql.SQLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.coolead.page_object.AddOrganizationPage;
import com.coolead.util.Constant;
import com.coolead.util.Mysql;

public class Add_Organization {
	@Test
	public static void execute(WebDriver driver ) throws Exception{
		AddOrganizationPage addOrganizationPage = new AddOrganizationPage(driver);
		addOrganizationPage.org_menu_system().click();
		Thread.sleep(1000);
		addOrganizationPage.org_menu_organization().click();
		Thread.sleep(1000);
		addOrganizationPage.org_new().click();
		Thread.sleep(2000);
		addOrganizationPage.org_name().sendKeys(Constant.org_name);
		addOrganizationPage.org_short_name().sendKeys(Constant.org_shot_name);
		addOrganizationPage.org_company().sendKeys(Constant.org_company);
		addOrganizationPage.org_owner().sendKeys(Constant.org_owner);
		addOrganizationPage.org_phone().sendKeys(Constant.org_phone);
		addOrganizationPage.org_comment().sendKeys(Constant.org_comment);
		addOrganizationPage.org_save().click();
	}
	
	public static void delete(WebDriver driver) throws Exception{
	//	 AddOrganizationPage addOrganization = new AddOrganizationPage(driver);
	//	 Thread.sleep(2000);
	//	 String delete_url = "//span[contains(text(),'"+Constant.org_name+"')]";
	//	 driver.findElement(By.xpath(delete_url)).click();		 
	//	 addOrganization.org_delete().click();
	//	 addOrganization.org_delete_config().click();
		
		String   sql = "delete from sys_org where org_name = " +"\""  +Constant.org_name +"\"";//SQL语句  
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
