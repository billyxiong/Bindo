package com.bindo.page_object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.bindo.util.ObjectMap;

public class RegisterPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
	
	public RegisterPage(WebDriver driver){
		this.driver = driver;
	}	
	//注册帐号链接
	public  WebElement register_link() throws Exception{
	element = driver.findElement(objectMap.getLocator("bindo.LoginPage.register_link"));
     return element;
	}
	//用户名输入框
	public  WebElement name_input() throws Exception{
	element = driver.findElement(objectMap.getLocator("bindo.Register_Page.name_input"));
     return element;
	}	
	//邮箱输入框
	public  WebElement email_input() throws Exception{
	element = driver.findElement(objectMap.getLocator("bindo.Register_Page.email_input"));
     return element;
	}
	//密码输入框
	public  WebElement password_input() throws Exception{
	element = driver.findElement(objectMap.getLocator("bindo.Register_Page.password_input"));
     return element;
	}
	//重复密码输入框
	public  WebElement repeat_password() throws Exception{
	element = driver.findElement(objectMap.getLocator("bindo.Register_Page.repeat_password"));
     return element;
	}
	//注册按钮
	public  WebElement singn_up_button() throws Exception{
	element = driver.findElement(objectMap.getLocator("bindo.Register_Page.singn_up_button"));
     return element;
	}
}
