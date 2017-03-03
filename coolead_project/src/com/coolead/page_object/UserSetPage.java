package com.coolead.page_object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class UserSetPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;	
	public UserSetPage (WebDriver driver){
		this.driver = driver;
	}	
	//进入用户设置的菜单
	public WebElement user_menu() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.user.set.menu"));		
		return element;
	}
	//选择头像按钮
	public WebElement user_icon_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.user.icon.browser_button"));		
		return element;
	}
	//切换到密码Tab页
	public WebElement user_password_tab() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.user.password.tab"));		
		return element;
	}
	//旧密码输入框
	public WebElement user_password_old() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.user.password.old"));		
		return element;
	}
	//新密码输入框
	public WebElement user_password_new() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.user.password.new"));		
		return element;
	}
	//确认密码输入框
	public WebElement user_password_confirm() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.user.password.confirm"));		
		return element;
	}
	//详情Tab页
	public WebElement user_details_tab() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.user.details.tab"));		
		return element;
	}
	//详情页面手机号输入
	public WebElement user_details_phone() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.user.details.phone"));		
		return element;
	}	
	//详情页面存储空间输入
	public WebElement user_details_mem() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.user.details.mem"));		
		return element;
	}
	//头像Tab页
	public WebElement user_icon_tab() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.user.icon.tab"));		
		return element;		
	}
	
	//头像图片
	public WebElement user_canvas() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.user.canvas"));
		return element;
	}
	//确定保存按钮
	public WebElement user_save_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.user.save_button"));		
		return element;		
	}
	
	//密码界面保存按钮
	public WebElement user_password_save_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.user.password_save_button"));
		return element;
	}

	//个人资料保存按钮
	public WebElement user_details_save_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.user.details_save_button"));
		return element;
	}
	
}
