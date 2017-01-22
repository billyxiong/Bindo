package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class ServicePushPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
	
	public ServicePushPage (WebDriver driver){
		this.driver = driver;
	}
	
	//在线服务菜单
	public WebElement Online_Service_Menu() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.service.menu"));		
		return element;
	}
	
	//新建推送
	public WebElement Service_Push_New() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.service.new"));		
		return element;
	}	
	
	//项目名称列表框
	public WebElement Service_Push_Project() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.service.project"));		
		return element;
	}

	//推送主题
	public WebElement Service_Push_Title() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.service.push_title"));		
		return element;
	}

	//接收人列表
	public WebElement Service_Receiver_List() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.service.receiver_list"));		
		return element;
	}	
	
	//接收人搜索框
	public WebElement Service_Receiver_Search() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.service.receiver_search"));		
		return element;
	}
	
	//接收人选择框
	public WebElement Service_Receiver_select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.service.receriver_select"));		
		return element;
	}

	//接收人确定按钮
	public WebElement Service_Receiver_select_Button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.service.receriver_select_button"));		
		return element;
	}
		
	//推送内容
	public WebElement Service_Push_content() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.service.push_content"));		
		return element;
	}
	
	//推送按钮
	public WebElement Service_Push_Button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.service.push_button"));		
		return element;
	}
	
	//推送确认
	public WebElement Service_Push_Confirm() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.service.push_confirm"));		
		return element;
	}
	
	//服务信息勾选框
	public WebElement Service_Push_Select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.service.push_select"));
		return element;
	}
	
	//服务信息审核按钮
	public WebElement Service_Push_Validate() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.service.push_validate"));
		return element;
	}
	
}