package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class RebackOwnerProgressPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
	
	public RebackOwnerProgressPage (WebDriver driver){
		this.driver = driver;
	}
	
	//报告列表菜单
	public WebElement report_Menu() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.report.menu"));		
		return element;
	}
	
	//业主形象进度月报标题链接
	public WebElement owener_progress_title() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.report.owener_progress_title"));
		return element;
	}
	
	//退回选择按钮
	public WebElement Owner_Progress_reback_select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.report.owener_progress.reback_select"));
		return element;
	}
	
	//退回意见输入框
	public WebElement owener_progress_reback_comment() throws Exception{
		element =driver.findElement(objectMap.getLocator("em.report.owener_progress.reback_comment"));
		return element;
	}
	
	//退回操作提交功能按钮
	public WebElement owner_progress_reback_submit() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.report.owener_progress.reback_submit"));
		return element;
	}
}
