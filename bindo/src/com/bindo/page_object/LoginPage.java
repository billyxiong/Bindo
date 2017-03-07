package com.bindo.page_object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.bindo.util.ObjectMap;

public class LoginPage {

	private WebElement element = null;
		//指定页面元素定位表达式配置文件的相对文件路径
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
		
		public LoginPage(WebDriver driver){
			this.driver = driver;
		}	
	//帐号电邮输入框
	public  WebElement email_input() throws Exception{
		element = driver.findElement(objectMap.getLocator("bindo.LoginPage.email_input"));
	     return element;
	}
	
	//帐号密码输入框
	public  WebElement password_input() throws Exception{
		element = driver.findElement(objectMap.getLocator("bindo.LoginPage.password_input"));
	     return element;
	}
	
	//登录按钮
	public  WebElement login_button() throws Exception{
		element = driver.findElement(objectMap.getLocator("bindo.LoginPage.login_button"));
	     return element;
	}	
}

