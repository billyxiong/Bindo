package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class AddUserPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
	
	public AddUserPage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement user_menu_system() throws Exception{
	//系统管理菜单
		element = driver.findElement(objectMap.getLocator("em.user.system"));		
		return element;
	}	
	
	public WebElement user_menu_user() throws Exception{
		//组织机构管理菜单
			element = driver.findElement(objectMap.getLocator("em.user.menu"));		
			return element;
	}	
	
	public WebElement user_add() throws Exception{
		element =driver.findElement(objectMap.getLocator("em.user.add"));
		return element;
	}
	
	public WebElement user_username() throws Exception{
		element =driver.findElement(objectMap.getLocator("em.user.username"));
		return element;
	}
	
	public WebElement user_realname() throws Exception{
		element =driver.findElement(objectMap.getLocator("em.user.realname"));
		return element;
	}
	
	public WebElement user_company_drop() throws Exception{
		element =driver.findElement(objectMap.getLocator("em.user.company.drop"));
		return element;
	}
	
	public WebElement user_department_drop() throws Exception{
		element =driver.findElement(objectMap.getLocator("em.user.department.drop"));
		return element;
	}
	
	public WebElement user_save() throws Exception{
		element =driver.findElement(objectMap.getLocator("em.user.save"));
		return element;
	}
	
	public WebElement user_phone() throws Exception{
		element =driver.findElement(objectMap.getLocator("em.user.phone"));
		return element;
	}
	
	public WebElement role_drop() throws Exception{
		element =driver.findElement(objectMap.getLocator("em.user.role_drop"));
		return element;
	}
	
	public WebElement role_select() throws Exception{
		element =driver.findElement(objectMap.getLocator("em.user.role_select"));
		return element;
	}
}
