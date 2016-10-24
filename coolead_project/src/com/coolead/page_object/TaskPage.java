package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class TaskPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;	
	public TaskPage (WebDriver driver){
		this.driver = driver;
	}	
	//任务列表菜单
	public WebElement task_menu() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.task.menu"));		
		return element;
	}

	//新建任务按钮
	public WebElement task_new_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.task.new_button"));		
		return element;
	}
	
	//任务标题输入框
	public WebElement task_title() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.task.title"));		
		return element;
	}
	
	//项目列表框
	public WebElement task_project() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.task.project"));		
		return element;
	}
	
	//执行人列表
	public WebElement task_excutor_list() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.task.excutor"));		
		return element;
	}
	
	//执行人搜索框
	public WebElement task_excutor_search() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.task.excutor_search"));		
		return element;
	}	
	
	//执行人选择框
	public WebElement task_excutor_select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.task.excutor_select"));		
		return element;
	}	

	//执行人确定按钮
	public WebElement task_excutor_select_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.task.excutor_select_button"));		
		return element;
	}
	
	//验收人列表
		public WebElement task_accepter_list() throws Exception{
			element = driver.findElement(objectMap.getLocator("em.task.accepter"));		
			return element;
		}
		
	//验收人搜索框
		public WebElement task_accepter_search() throws Exception{
			element = driver.findElement(objectMap.getLocator("em.task.accepter_search"));		
			return element;
		}	
		
		//验收人选择框
		public WebElement task_accepter_select() throws Exception{
			element = driver.findElement(objectMap.getLocator("em.task.accepter_select"));		
			return element;
		}	

		//验收确定按钮
		public WebElement task_accepter_select_button() throws Exception{
			element = driver.findElement(objectMap.getLocator("em.task.accepter_select_button"));		
			return element;
		}
	

	//任务内容输入框
	public WebElement task_content() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.task.content"));		
		return element;
	}
	
	//任务提交按钮
	public WebElement task_submit() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.task.submit_button"));		
		return element;
	}
	
}
