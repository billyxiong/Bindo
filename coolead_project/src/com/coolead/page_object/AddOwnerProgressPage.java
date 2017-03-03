package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

	public class AddOwnerProgressPage {
		private WebElement element = null;
		private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
		private WebDriver driver;
		
		public AddOwnerProgressPage(WebDriver driver){
			this.driver = driver;
		}
		
		public WebElement report_menu() throws Exception{
			//报告列表菜单
			element = driver.findElement(objectMap.getLocator("em.report.menu"));		
			return element;
		}
		
		public WebElement report_new_button() throws Exception{
			//新建报告功能按钮
			element = driver.findElement(objectMap.getLocator("em.report.new_button"));		
			return element;
		}
		
		public WebElement report_owner_progress_menu() throws Exception{
			//业主形象进度月报菜单
			element = driver.findElement(objectMap.getLocator("em.report.owner_progress_report_menu"));		
			return element;
		}
		
		public WebElement report_project_list() throws Exception{
			//项目选择列表
			element = driver.findElement(objectMap.getLocator("em.report.project_list"));		
			return element;
		}
		
		public WebElement report_subject_select() throws Exception{
			//选择专业下拉框
			element = driver.findElement(objectMap.getLocator("em.report.subject_select"));
			return element;
		}
		
		public WebElement report_progress_status() throws Exception{
			//进度状态选择框
			element = driver.findElement(objectMap.getLocator("em.report.progress_status_checkbox"));
			return element;
		}		
		
		public WebElement report_reviewer_list() throws Exception{
			//评阅人列表
			element = driver.findElement(objectMap.getLocator("em.report.reviewer_list"));		
			return element;
		}
		
		public WebElement report_reviewer_select() throws Exception{
			//评阅人选择按钮
			element = driver.findElement(objectMap.getLocator("em.report.reviewer_select"));		
			return element;			
		}
		
		public WebElement report_reviewer_select_confirm() throws Exception{
			//评阅人选择确认
			element = driver.findElement(objectMap.getLocator("em.report.reviewer_select_confirm"));		
			return element;			
		}
		
		public WebElement report_month_amount() throws Exception{
			//本月完成金额
			element = driver.findElement(objectMap.getLocator("em.report.month_amount"));		
			return element;			
		}
		
		public WebElement report_total_amount() throws Exception{
			//累计支付金额
			element = driver.findElement(objectMap.getLocator("em.report.total_amount"));		
			return element;			
		}
		
		
		
		public WebElement report_owner_progress_comment() throws Exception{
			//本月完成金额
			element = driver.findElement(objectMap.getLocator("em.report.owner_progress_comment"));		
			return element;			
		}
		
		public WebElement report_owner_progress_submit() throws Exception{
			//提交功能按钮
			element = driver.findElement(objectMap.getLocator("em.report.owner_progress_submit"));		
			return element;			
		}	
		
		public WebElement report_submit_confirm() throws Exception{
			//提交确认功能按钮
			element = driver.findElement(objectMap.getLocator("em.report.submit_confirm"));		
			return element;			
		}
}

