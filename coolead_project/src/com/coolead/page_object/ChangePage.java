package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class ChangePage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
	
	public ChangePage (WebDriver driver){
		this.driver = driver;
	}
	//整改列表菜单
	public WebElement Change_List_Menu() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.change.list.menu"));		
		return element;
	}
	
	//选择项目下拉表
	public WebElement Change_List_Project_Select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.change.list.project_select"));		
		return element;
	}
	
	//选择整改状态
	public WebElement Change_List_Status_Select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.change.list.status_select"));		
		return element;
	}
	
	public WebElement Change_List_Execute_Input() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.change.list.executor_input"));		
		return element;
	}
	
	public WebElement Change_List_Inspector_Input() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.change.list.inspector_input"));		
		return element;
	}
	
	public WebElement Change_List_Type_Select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.change.list.type_select"));		
		return element;
	}
	
	public WebElement Change_List_Search_Button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.change.list.search_button"));		
		return element;
	}
}
