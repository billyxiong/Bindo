package com.coolead.modules;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.coolead.page_object.AddProjectPage;
import com.coolead.util.Constant;
import com.coolead.util.Mysql;

public class Add_Project {
	
	public static  void add(WebDriver driver ,String projectname ,String community_name,
			String projectshortname,String amount)
	throws Exception{
		
		AddProjectPage addProjectPage = new AddProjectPage(driver);
		
		addProjectPage.menu().click();		
		Thread.sleep(1000);		
		
		addProjectPage.new_button().click();
		Thread.sleep(1000);
		
		addProjectPage.name().sendKeys(Constant.projectname);
		
		addProjectPage.short_name().sendKeys(Constant.projectshortname);
		
		//点击区域
		addProjectPage.city().click();
		Thread.sleep(1000);
		
		//展开城市列表
		addProjectPage.city_select1().click();
		Thread.sleep(1000);
		//选择城区
		addProjectPage.city_select2().click();
		Thread.sleep(1000);
		
		//选择对应区域下的街道办
		new Select(addProjectPage.community()).selectByVisibleText(Constant.community_name);		
		
		//选择项目金额
		addProjectPage.amount().sendKeys((Constant.amount));
		
//		new Actions(driver).moveToElement(addProjectPage.submit_button()).perform();
//		Thread.sleep(3000);
//下拉框列表选择建设单位		
		addProjectPage.construct_click().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constant.project_constructor)).click();
		
		addProjectPage.department_click().click();
		Thread.sleep(1000);
		//addProjectPage.department_value().click();
		driver.findElement(By.xpath(Constant.project_department)).click();
		
		addProjectPage.designer_click().click();
		Thread.sleep(1000);
		//addProjectPage.designer_value().click();
		driver.findElement(By.xpath(Constant.project_desinger)).click();
		
		addProjectPage.supervisor_click().click();
		Thread.sleep(1000);
		//addProjectPage.supervisor_value().click();
		driver.findElement(By.xpath(Constant.project_supervisor)).click();
				
		//JavascriptExecutor removeAttribute = (JavascriptExecutor)driver;
		//removeAttribute.executeScript("var setDate=document.getElementByxpath(\"//*[@id='coolead-block']/div[1]/div/div[3]/div[2]/div/form/table[1]/tbody/tr[5]/td[2]/div/div/input\");setDate.removeAttribute('readonly');"); 
		//addProjectPage.start_date().sendKeys(Constant.starte_date);				
		//removeAttribute.executeScript("var setDate=document.getElementByxpath(\"//*[@id='coolead-block']/div[1]/div/div[3]/div[2]/div/form/table[1]/tbody/tr[5]/td[4]/div/div/input\");setDate.removeAttribute('readonly');"); 
		//addProjectPage.end_date().sendKeys(Constant.end_date);
		
		
		addProjectPage.start_date().click();
		Thread.sleep(1000);
		addProjectPage.start_date_button().click();
		
		addProjectPage.end_date().click();
		Thread.sleep(1000);
		addProjectPage.end_date_button().click();
		
		addProjectPage.build_area().sendKeys(""+(int)(Math.random()*100));
		
		//点击施工单位下拉框列表
		addProjectPage.project_construction().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constant.project_shigong_click)).click();
		new Select(addProjectPage.subject_list()).selectByVisibleText(Constant.subject_name);
		Thread.sleep(1000);
		addProjectPage.project_construction_add_button().click();
		Thread.sleep(1000);
		addProjectPage.project_contactor_click().click();
		Thread.sleep(1000);
		addProjectPage.project_contactor_name_input().sendKeys(Constant.real_name);
		addProjectPage.project_contactor_search_button().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constant.project_contactor)).click();
		addProjectPage.project_contactor_select_confirm().click();
		addProjectPage.submit_button().click();		
		Thread.sleep(1000);
		
		addProjectPage.confirm_button().click();
		
	}
	
	public  static void delete(){
		 String   sql = "delete from proj_info where proj_name = " +"\""  +Constant.projectname +"\"";//SQL语句  
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
