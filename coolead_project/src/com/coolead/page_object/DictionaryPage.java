package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class DictionaryPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
	
	public DictionaryPage (WebDriver driver){
		this.driver = driver;
	}
	
	//系统管理菜单
	public WebElement user_menu_system() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.user.system"));		
		return element;
	}
	
	//数据字典菜单
	public WebElement dictionary_menu() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.menu"));
		return element;
	}
	
	//新增数据字典按钮
	public WebElement dictionary_new_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.new"));
		return element;
	}
		
	//数据字典类型输入
	public WebElement dictionay_type_input() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dicrionary.type"));
		return element;
	} 
	
	//字典名称输入框
	public WebElement dictionay_name_input() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.name"));
		return element;
	}
		
	//提交按钮
	public WebElement dictionay_submit_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.save"));
		return element;
	}
	
	//#最后页按钮
	public WebElement dictionay_last_page() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dicrionary.last_page_button"));
		return element;
	} 	
	
	//配置按钮
	public WebElement dictionay_config_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.modify"));
		return element;
	}

	//新增字典子项
	public WebElement dictionay_add_item() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.add_item"));
		return element;
	}
	
	//新增字典子项编码
	public WebElement dictionay_item_code() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.item_code"));
		return element;
	}	

	//子项名称输入框
	public WebElement dictionay_item_name() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.item_name"));
		return element;
	}
	
	//子项值输入框
	public WebElement dictionay_item_value() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.item_value"));
		return element;
	}
	
	//子项排序输入框
	public WebElement dictionay_item_order() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.item_oreder"));
		return element;
	}
	
	//子项保存按钮
	public WebElement dictionay_item_save() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.item_save"));
		return element;
	}	
	
	//保存后返回按钮
	public WebElement dictionay_item_return() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.item_return"));
		return element;
	}	
	
	//选择刚才创建的字典项
	public WebElement dictionay_select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.select"));
		return element;
	}
	
	//删除字典项按钮
	public WebElement dictionay_delete_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.delete"));
		return element;
	}
	
	//删除确认
	public WebElement dictionay_delete_confirm() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.delete_config"));
		return element;
	}	
}
