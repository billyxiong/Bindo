package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class AddMeetingPage {

	private WebElement element = null;
		//指定页面元素定位表达式配置文件的相对文件路径
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
		
		public AddMeetingPage(WebDriver driver){
			this.driver = driver;
		}	
	//会议管理菜单
	public  WebElement Meeting_Menu() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于密码的定位方式和定位表达式
		element = driver.findElement(objectMap.getLocator("em.meeting.menu"));
	     return element;
	}
	
	//会议新增菜单
	public  WebElement Meeting_New_Button() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于密码的定位方式和定位表达式
		element = driver.findElement(objectMap.getLocator("em.meeting.new_button"));
		return element;
	}
		
	//项目选择框
	public  WebElement Meeting_Projct_Select() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于密码的定位方式和定位表达式
		element = driver.findElement(objectMap.getLocator("em.meeting.project_select"));
		return element;
	}
		
	//会议名称输入框
	public  WebElement Meeting_Name_Input() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于密码的定位方式和定位表达式
		element = driver.findElement(objectMap.getLocator("em.meeting.name_input"));
		return element;
	}
	
	//会议日期面板
	public WebElement Meeting_Date_Panel() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.meeting.date_panel"));
		return element;
	}
	
	//会议日期确定
	public WebElement Meeting_Date_Select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.meeting.date_select"));
		return element;
	}
	
	//组织方输入
	public WebElement Meeting_Organization_Input() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.meeting.organization_input"));
		return element;
	}
	
	//会议类型选择
	public WebElement Meeting_Type_Select() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.meeting_type_select"));
		return element;
	}
	
	//内容输入
	public WebElement Meeting_Content_Input() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.meeting.contenet_input"));
		return element;
	}
	
	//会议提交按钮
	public WebElement Meeting_submit_Button() throws Exception{
		element = driver.findElement(objectMap.getLocator("em.meeting.submit_button"));
		return element;
	}
}

