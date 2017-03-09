package com.bindo.test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.bindo.modules.Driver_select;
import com.bindo.modules.Register;
import com.bindo.util.Constant;
public class Test_Register {
	WebDriver driver = Driver_select.getDriver();
	String baseUrl = Constant.url;	
	@Test
	public void register() throws Exception{
		driver.get(baseUrl + "/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().refresh();
		(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver d){
				return	d.findElement(By.xpath("//*[@id='loginForm']/div[2]/div[4]/div[2]/a")).isDisplayed();
				
			}	
		});
		Register.execute(driver);
	}	
}
