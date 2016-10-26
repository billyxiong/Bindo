package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class DelReportPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
	
	public DelReportPage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement report_menu() throws Exception{
		//报告列表菜单
		element = driver.findElement(objectMap.getLocator("em.report.menu"));		
		return element;
	}	
	
	public WebElement report_select() throws Exception{
		//已退回的报告勾选按钮
		element = driver.findElement(objectMap.getLocator("em.report.report.select"));		
		return element;
	}	
	
	public WebElement report_delete() throws Exception{
		//已退回的报告删除按钮
		element = driver.findElement(objectMap.getLocator("em.report.report.delete"));		
		return element;
	}
	
	public WebElement report_delete_confirm() throws Exception{
		//已退回的报告删除确认
		element = driver.findElement(objectMap.getLocator("em.report.report.delet_confirm"));		
		return element;
	}
}
