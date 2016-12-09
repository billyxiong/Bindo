package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class AddSubjectPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
	
	public AddSubjectPage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement system_menu() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.org.system"));		
		return element;
	}
	
	public WebElement dictionary_menu() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.menu"));		
		return element;
	}	
	
	public WebElement subject_config_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.subject.config_button"));		
		return element;
	}
	
	public WebElement subject_new_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.subject.new_button"));		
		return element;
	}	
	
	public WebElement subject_code() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.subject_code"));		
		return element;
	}	
	
	public WebElement subject_name() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.subject_name"));		
		return element;
	}
	
	public WebElement subject_value() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.subject_value"));		
		return element;
	}
	
	public WebElement subject_order() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.subject_order"));		
		return element;
	}
	
	public WebElement subject_save_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.dictionary.subject_save_button"));		
		return element;
	}
}
