package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class AddPlanPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
	
	public AddPlanPage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement plan_menu() throws Exception{
		//总控计划菜单
		element = driver.findElement(objectMap.getLocator("em.plan.menu"));		
		return element;
	}
	
	public WebElement plan_new_button() throws Exception{
		//新建计划按钮
		element = driver.findElement(objectMap.getLocator("em.plan.new_button"));		
		return element;
	}

	public WebElement plan_project_list() throws Exception{
		//项目名称选择下拉框
		element = driver.findElement(objectMap.getLocator("em.plan.project"));		
		return element;
	}
	
	public WebElement start_time_panel() throws Exception{
		//计划开工时间面板
		element = driver.findElement(objectMap.getLocator("em.plan.start_time_panel"));		
		return element;
	} 
	
	public WebElement start_time_select() throws Exception{
		//计划开工时间点选
		element = driver.findElement(objectMap.getLocator("em.plan.start_time"));		
		return element;
	}
	
	public WebElement end_time_panel() throws Exception{
		//计划结束时间面板
		element = driver.findElement(objectMap.getLocator("em.plan.end_time_panel"));		
		return element;
	}
	
	public WebElement end_time_select() throws Exception{
		//计划结束时间点选
		element = driver.findElement(objectMap.getLocator("em.plan.end_time"));		
		return element;
	}
	
	public WebElement plan_amount_input() throws Exception{
		//计划金额输入框
		element = driver.findElement(objectMap.getLocator("em.plan.amount_input"));		
		return element;
	}
	
	public WebElement plan_remark_input() throws Exception{
		//补充说明输入框
		element = driver.findElement(objectMap.getLocator("em.plan.remark_input"));		
		return element;
	}
	
	public WebElement plan_submit_button() throws Exception{
		//提交功能按钮
		element = driver.findElement(objectMap.getLocator("em.plan.submit_button"));		
		return element;
	}
	
	public WebElement plan_confirm_button() throws Exception{
		//二次确认按钮
		element = driver.findElement(objectMap.getLocator("em.plan.submit_confirm"));		
		return element;
	}
}
