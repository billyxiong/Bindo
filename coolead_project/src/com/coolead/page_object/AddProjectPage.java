package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class AddProjectPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
	
	public AddProjectPage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement menu() throws Exception{
	//使用objectMap类中的getLocator方法获取配置文件中关于用户的定位方式和定位表达式
		element = driver.findElement(objectMap.getLocator("em.project.menu"));		
		return element;
	}	
	
	public WebElement new_button() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于用户的定位方式和定位表达式
			element = driver.findElement(objectMap.getLocator("em.project.new_button"));		
			return element;
	}
	
	public WebElement name() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于用户的定位方式和定位表达式
			element = driver.findElement(objectMap.getLocator("em.project.name"));		
			return element;
	}
	
	public WebElement short_name() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于用户的定位方式和定位表达式
			element = driver.findElement(objectMap.getLocator("em.project.short_name"));		
			return element;
	}
	
	public WebElement city() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于用户的定位方式和定位表达式
			element = driver.findElement(objectMap.getLocator("em.project.city"));		
			return element;
	}
	
	public WebElement city_select1() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于用户的定位方式和定位表达式
			element = driver.findElement(objectMap.getLocator("em.project.city_select1"));		
			return element;
	}
	
	public WebElement city_select2() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于用户的定位方式和定位表达式
			element = driver.findElement(objectMap.getLocator("em.project.city_select2"));		
			return element;
	}
	
	
	public WebElement community() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于用户的定位方式和定位表达式
			element = driver.findElement(objectMap.getLocator("em.project.community"));		
			return element;
	}
	
	public WebElement amount() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于用户的定位方式和定位表达式
			element = driver.findElement(objectMap.getLocator("em.project.amount"));		
			return element;
	}
	
	public WebElement submit_button() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于用户的定位方式和定位表达式
			element = driver.findElement(objectMap.getLocator("em.project.submit_button"));		
			return element;
	}
	
	public WebElement confirm_button() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于用户的定位方式和定位表达式
			element = driver.findElement(objectMap.getLocator("em.project.confirm_button"));		
			return element;
	}
	
	
	public WebElement department_click() throws Exception{
			element = driver.findElement(objectMap.getLocator("em.project.department"));
			return element;
	}		
			
	public WebElement department_value() throws Exception{
			element = driver.findElement(objectMap.getLocator("em.project.department_value"));
			return element;		
	}		
			
	public WebElement construct_click() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.construct"));
		return element;		
	}		
			
	public WebElement construct_value() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.construct_value"));
		return element;		
	}			
			
	public WebElement designer_click() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.designer"));
		return element;		
	}
	
	public WebElement designer_value() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.designer_value"));
		return element;		
	}		
			
	public WebElement supervisor_click() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.supervisor"));
		return element;		
	}		
	
	public WebElement supervisor_value() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.supervisor_value"));
		return element;		
	}
	
	public WebElement start_date() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.start_date"));
		return element;
	}
	
	public WebElement start_date_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.start_date_button"));
		return element;
	}
	
	public WebElement end_date() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.end_date"));
		return element;
	}
	
	public WebElement end_date_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.end_date_button"));
		return element;
	}
	
	public WebElement build_area() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.build_area"));
		return element;
	}
	
	public WebElement subject_list() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.subject_list"));
		return element;
	}
	
	public WebElement project_construction() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.construction"));
		return element;
	}
	
	public WebElement project_construction_add_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.add_construction"));
		return element;
	}
	
	public WebElement project_contactor_click() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.contactor_click"));
		return element;
	}
	
	public WebElement project_contactor_name_input() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.contactor_name"));
		return element;
	}
	
	public WebElement project_contactor_search_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.contactor_search"));
		return element;
	}
	
	public WebElement project_contactor_select_confirm() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.project.contactor_select_confirm"));
		return element;
	}
}
