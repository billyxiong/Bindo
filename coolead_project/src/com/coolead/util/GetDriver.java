package com.coolead.util;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class GetDriver {
	public static WebDriver driver;
	//获取远程节点中IE浏览器对象Driver，通过函数参数remoteNodeUrl连接不同的指定节点
	public static WebDriver getRemoteIEDriver(String remoteNodeUrl) throws 
	MalformedURLException{
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		capability.setBrowserName("internetExplorer");
		capability.setPlatform(Platform.XP);
		driver = new RemoteWebDriver(new URL(remoteNodeUrl),capability);
		return driver;
	}
	//获取远程节点机器中的Chrome浏览器对象Driver,通过函数参数remoteNodeUrl连接不同节点
	public static WebDriver getRemoteChromedriver(String remoteNodeUrl) throws 
	MalformedURLException{
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.XP);
		driver = new RemoteWebDriver(new URL(remoteNodeUrl),capability);
		return driver;		
	}
	//获取远程节点机器中的firefox浏览器对象Driver,通过函数参数remoteNodeUrl连接不同节点
	public static WebDriver getRemoteFirefoxdriver(String remoteNodeUrl) throws 
	MalformedURLException{
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.XP);
		driver = new RemoteWebDriver(new URL(remoteNodeUrl),capability);
		return driver;		
	}	
}
