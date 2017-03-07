package com.bindo.modules;
import org.openqa.selenium.WebDriver;
import com.bindo.page_object.OrderPage;
public class Order {
	public static void execute(WebDriver driver ) throws Exception{
		OrderPage order= new OrderPage(driver);
		order.dish_type_link().click();
		Thread.sleep(2000);
		order.dish_add().click();
		order.check_out().click();
		Thread.sleep(2000);
		order.check_out().click();
	}	
}

