package com.bindo.modules;
import org.openqa.selenium.WebDriver;
import com.bindo.page_object.OrderPage;
import com.bindo.util.Constant;
public class Order {
	public static void execute(WebDriver driver ) throws Exception{
		OrderPage order= new OrderPage(driver);
		Thread.sleep(10000);
		order.dish_type_link().click();
		Thread.sleep(2000);
		order.dish_add().click();
		order.check_out().click();
		Thread.sleep(2000);
		order.check_out().click();
		Thread.sleep(2000);
		order.deliver_type().click();
		Thread.sleep(2000);
		order.table_input().sendKeys(Constant.table_no);
		order.pay_do().click();
		Thread.sleep(2000);
		order.pay_type().click();
		Thread.sleep(2000);
		order.pay_next().click();
		Thread.sleep(2000);
		order.pay_confirm().click();
	}	
}

