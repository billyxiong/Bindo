package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class AddOrganizationPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
	
	public AddOrganizationPage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement org_menu_system() throws Exception{
	//系统管理菜单
		element = driver.findElement(objectMap.getLocator("em.org.system"));		
		return element;
	}	
	
	public WebElement org_menu_organization() throws Exception{
		//组织机构管理菜单
			element = driver.findElement(objectMap.getLocator("em.org.organizattion"));		
			return element;
	}	
	
	public WebElement org_new() throws Exception{
		//新增组织菜单
			element = driver.findElement(objectMap.getLocator("em.org.org_new"));		
			return element;
	}
	
	public WebElement org_name() throws Exception{
		//组织机构名称
			element = driver.findElement(objectMap.getLocator("em.org.org_name"));		
			return element;
	}
	
	public WebElement org_short_name() throws Exception{
		//组织机构简称
			element = driver.findElement(objectMap.getLocator("em.org.org_short_name"));		
			return element;
	}
	
	public WebElement org_company() throws Exception{
		//公司名称 
			element = driver.findElement(objectMap.getLocator("em.org.company"));		
			return element;
	}
	
	public WebElement org_owner() throws Exception{
		//组织责任人
			element = driver.findElement(objectMap.getLocator("em.org.owner"));		
			return element;
	}
	
	public WebElement org_phone() throws Exception{
		//电话
			element = driver.findElement(objectMap.getLocator("em.org.phone"));		
			return element;
	}
	
	public WebElement org_comment() throws Exception{
		//备注
			element = driver.findElement(objectMap.getLocator("em.org.comment"));		
			return element;
	}
	
	public WebElement org_save() throws Exception{
		//保存按钮
			element = driver.findElement(objectMap.getLocator("em.org.save"));		
			return element;
	}
	
	public WebElement org_delete() throws Exception{
		//删除按钮
			element = driver.findElement(objectMap.getLocator("em.org.delete"));
			return element;
	}
	
	public WebElement org_delete_config() throws Exception{
		//删除确认按钮
			element = driver.findElement(objectMap.getLocator("em.org.delete_config"));
			return element;
	}
	
}
