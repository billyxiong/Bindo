package com.bindo.page_object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.bindo.util.ObjectMap;
public class OrderPage {
	private WebElement element = null;
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;	
	public OrderPage(WebDriver driver){
		this.driver = driver;
	}	
	//菜品分类菜单
	public  WebElement dish_type_link() throws Exception{
	element = driver.findElement(objectMap.getLocator("bindo.order.dish_type_link"));
     return element;
	}
	//添加菜品按钮
	public  WebElement dish_add() throws Exception{
	element = driver.findElement(objectMap.getLocator("bindo.order.dish_add"));
     return element;
	}
	//结帐按钮
	public  WebElement check_out() throws Exception{
	element = driver.findElement(objectMap.getLocator("bindo.order.check_out"));
     return element;
	}
	//堂食方式
	public  WebElement deliver_type() throws Exception{
	element = driver.findElement(objectMap.getLocator("bindo.order.delivery_type"));
     return element;
	}
	//输入桌号
	public  WebElement table_input() throws Exception{
	element = driver.findElement(objectMap.getLocator("bindo.order.table_input"));
     return element;
	}
	//下单
	public  WebElement pay_do() throws Exception{
	element = driver.findElement(objectMap.getLocator("bindo.order.do"));
     return element;
	}
	//支付类型
	public  WebElement pay_type() throws Exception{
	element = driver.findElement(objectMap.getLocator("bindo.order.pay_type"));
     return element;
	}
	//支付后下一步
	public  WebElement pay_next() throws Exception{
	element = driver.findElement(objectMap.getLocator("bindo.order.next"));
     return element;
	}
	//支付确认
	public  WebElement pay_confirm() throws Exception{
	element = driver.findElement(objectMap.getLocator("bindo.order.confirm"));
     return element;
	}
}
