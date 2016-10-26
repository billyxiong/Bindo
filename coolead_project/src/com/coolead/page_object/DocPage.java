package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class DocPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
	
	public DocPage (WebDriver driver){
		this.driver = driver;
	}
	
	//文档管理菜单
	public WebElement em_doc_menu() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.menu"));		
		return element;
	}
	
	//新建文件夹按钮
	public WebElement em_doc_new() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.new_folder_button"));		
		return element;
	} 
	
	//排序输入框
	public WebElement em_doc_new_order_input() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.new_folder_order_input"));		
		return element;
	}
	
	//名称输入框
	public WebElement em_doc_new_name_input() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.new_folder_name_input"));		
		return element;
	}
	
	//新建确认按钮
	public WebElement em_doc_new_confirm_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.new_folder_confirm_button"));		
		return element;
	}
	
	//设置权限按钮
	public WebElement em_doc_set_rights_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.Set_Rights_button"));		
		return element;
	}
	
	//新增权限按钮
	public WebElement em_doc_add_rights_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.add_rights_button"));		
		return element;
	}
	
	//新增授权项目
	public WebElement em_doc_add_rights_project_new() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.add_rights_project_new"));		
		return element;
	}
	
	//项目查询输入框
	public WebElement em_doc_project_search_input() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.project_search_input"));		
		return element;
	}
	
	//项目选择按钮
	public WebElement em_doc_project_select_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.project_select_button"));		
		return element;
	}
	
	//项目选择确定
	public WebElement em_doc_project_confirm_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.project_confirm_button"));		
		return element;
	}
	
	//新增权限用户按钮
	public WebElement em_doc_project_user_new() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.add_rights_user_new"));		
		return element;
	}
	
	//点击项目按钮
	public WebElement em_doc_project_click_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.project_click_button"));		
		return element;
	}
	
	//权限用户搜索框
	public WebElement em_doc_user_search_input() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.user_search_input"));		
		return element;
	}
	
	//权限用户选择按钮
	public WebElement em_doc_user_select_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.user_select_button"));		
		return element;
	}
	
	//权限用户确认按钮
	public WebElement em_doc_user_confirm_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.usr_confirm_button"));		
		return element;
	}
	
	//下载权限选择框
	public WebElement em_doc_download_select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.download_select"));		
		return element;
	}
	
	//新建权限选择框
	public WebElement em_doc_create_select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.create_select"));		
		return element;
	}
	
	//修改权限选择框
	public WebElement em_doc_modify_select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.modify_select"));		
		return element;
	}
	
	//删除权限选择框
	public WebElement em_doc_delete_select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.delete_select"));		
		return element;
	}
	
	//配置权限选择框
	public WebElement em_doc_rights_select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.rights_select"));		
		return element;
	}
	
	//权限确认按钮
	public WebElement em_doc_rights_confirm() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.add_right_confirm"));		
		return element;
	}
	
	//关闭权限页面
	public WebElement em_doc_rights_close() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.doc.add_right_close"));		
		return element;
	}
}
