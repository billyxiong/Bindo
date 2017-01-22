package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class VisaPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;	
	public VisaPage (WebDriver driver){
		this.driver = driver;
	}	
	//签证列表菜单
	public WebElement visa_menu() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.visa.menu"));		
		return element;
	}
	//签证新增按钮
	public WebElement visa_new_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.visa.new_button"));
		return element;
	}
	//签证项目选择框
	public WebElement visa_project_list() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.visa.project_list"));
		return element;
	}
	//签证编号
	public WebElement visa_code() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.visa.visa_code"));
		return element;
	}
	//签证标题
	public WebElement visa_title() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.visa.visa_title"));
		return element;
	}
	//施工单位
	public WebElement visa_company() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.visa.compnay"));
		return element;
	}
	//签证接收人按钮
	public WebElement visa_holder() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.visa.holder"));
		return element;
	}
	
	//签证接收人搜索框
	public WebElement visa_holder_input_text() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.visa.holder_input_text"));
		return element;
	}
	
	//接收人选择框按钮
	public WebElement visa_holder_select_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.visa.select_button"));
		return element;
	}
	
	//接收人确认按钮
	public WebElement visa_holder_confirm_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.visa.holder_confirm_button"));
		return element;
	}
	
	//签证内容
	public WebElement visa_content() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.visa.content"));
		return element;
	}
	//签证提交按钮
	public WebElement visa_sumit_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.visa.submit_button"));
		return element;
	}
	//提交确认
	public WebElement visa_sumit_confirm() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.visa.submit_confirm"));
		return element;
	}	
	
}
