package com.coolead.util;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class TestSeleniumGrid {
	public WebDriver driver;
	public String baseUrl="http://www.sogou.com";
	//使用注解Parameter从testng.xml中读取remoteUrl和Browser变量的参数值
	@Parameters({"remoteNodeUrl","browser"})
	//使用注解BeforeClass,在测试类被执行前，获取browser变量指定的浏览器对象进行测试
	@BeforeClass
	public void beforeTest(String remoteUrl,String browser) throws MalformedURLException
	{
		if(browser.equalsIgnoreCase("firefox")){
			driver=GetDriver.getRemoteFirefoxdriver(remoteUrl);
		}
		else if (browser.equalsIgnoreCase("ie")){
			driver=GetDriver.getRemoteIEDriver(remoteUrl);
		}
		else if (browser.equalsIgnoreCase("chrome")){
			driver=GetDriver.getRemoteChromedriver(remoteUrl);
		}
	}
	@Test
	public void testSearch1() throws InterruptedException{
		driver.get(baseUrl);
		driver.findElement(By.id("query")).sendKeys("光荣之路性能测试");
		driver.findElement(By.id("stb")).click();
			(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
				public Boolean apply(WebDriver d){
					return d.findElement(By.id("s_footer")).getText().contains("搜索帮助");
				}
			
	});
	Assert.assertTrue(driver.getPageSource().contains("光荣之路性能测试"));
	}
	//测试搜索"光荣之路自动化测试"关键字
	@Test
	public void testSearch2() throws InterruptedException{
		driver.get(baseUrl);
		driver.findElement(By.id("query")).sendKeys("光荣之路自动化测试");
		driver.findElement(By.id("stb")).click();
			(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
				public Boolean apply(WebDriver d){
					return d.findElement(By.id("s_footer")).getText().contains("搜索帮助");
				}			
	});
		Assert.assertTrue(driver.getPageSource().contains("光荣之路自动化测试"));
	}
	@AfterClass
	public void afterTest(){
//		driver.quit();
	}
}
