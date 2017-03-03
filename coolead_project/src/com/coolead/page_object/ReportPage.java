package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class ReportPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;	
	public ReportPage (WebDriver driver){
		this.driver = driver;
	}	
    //报告列表菜单
	public WebElement report_menu() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.report.menu"));		
		return element;
	}

	//项目选择框
	public WebElement report_project_select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.report.list.project_select"));		
		return element;
	}
	
	public WebElement report_type_select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.report.list.type_select"));		
		return element;
	}	
	
	public WebElement report_author_input() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.report.list.author_input"));		
		return element;
	}
	
	public WebElement report_search_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.report.list.search_button"));		
		return element;
	}
}
