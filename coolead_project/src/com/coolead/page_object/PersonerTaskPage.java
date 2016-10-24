package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class PersonerTaskPage {
	

	private WebElement element = null;
		//指定页面元素定位表达式配置文件的相对文件路径
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
		
		public PersonerTaskPage(WebDriver driver){
			this.driver = driver;
		}
	
	//个人待办事务菜单
	public  WebElement Personer_Task_Menu() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于密码的定位方式和定位表达式
		element = driver.findElement(objectMap.getLocator("em.personer_task_menu"));
	     return element;
	}
	
	//待办任务标题
	public WebElement Personer_Task_Title() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.personer_task_title"));
		return element;
	}
	
	//输入任务内容
	public WebElement Personer_Task_Input() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.personer_task_input"));
		return element;
	}
	
	//任务提交按钮
	public WebElement Personer_Task_Send_Button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.personer_task_send_button"));
		return element;
	}
}
