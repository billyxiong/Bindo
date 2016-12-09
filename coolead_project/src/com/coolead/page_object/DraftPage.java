package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class DraftPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
	
	public DraftPage (WebDriver driver){
		this.driver = driver;
	}
	
	//进入底稿的按钮链接
	public WebElement em_draft_menu() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.draft.menu"));		
		return element;
	}
	
	//底稿摘要输入框
	public WebElement em_draft_summary() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.draft.summary"));		
		return element;		
	}
	
	//底稿定位框
	public WebElement em_draft_frame() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.draft.content_frame"));		
		return element;		
	}
	
	//底稿输入框
	public WebElement em_draft_content() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.draft.content_input"));		
		return element;			
	}
	
	//底稿提交按钮
	public WebElement em_draft_submit_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.draft.submit_button"));		
		return element;		
	}	
}
