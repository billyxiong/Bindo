package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class LoginPage {

		
	
	private WebElement element = null;
		//指定页面元素定位表达式配置文件的相对文件路径
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
		
		public LoginPage(WebDriver driver){
			this.driver = driver;
		}
		
		//返回当前访问的网址
				
		//返回登录页面中的用户名输入框界面元素对象
		public WebElement username() throws Exception{
		//使用objectMap类中的getLocator方法获取配置文件中关于用户的定位方式和定位表达式
			element = driver.findElement(objectMap.getLocator("em.LoginPage." +
					"username"));		
			return element;
		}
		
		//返回登录页面中的密码输入框页面元素对象
		public  WebElement password() throws Exception{
			//使用objectMap类中的getLocator方法获取配置文件中关于密码的定位方式和定位表达式
			element = driver.findElement(objectMap.getLocator("em.LoginPage." +
					"password"));
		     return element;
		}
		
		//返回登录页面中登录按钮页面元素对象
		public WebElement loginButton() throws Exception{
			//使用objectMap类中的getLocator方法获取配置文件中关于登录按钮的定位方式和定位表达式
			element = driver.findElement(objectMap.getLocator("em.LoginPage." +
					"loginbutton"));
			return element;
		}		
	}


