package com.bindo.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;


public class ObjectMap {
	
	Properties properties;

	public ObjectMap(String propFile) {
	properties  = new Properties(); 
	try {
		FileInputStream in = new FileInputStream(propFile);
		properties.load(in);
		in.close();
	}
	catch (IOException e){
		System.out.println("读取对象文件出错");
	}
	}
	
	public By getLocator(String ElementNameInpropFile) throws Exception{
	//分据变量ElementNameInpropFile,从属性配置文件中读取对应的配置对象
	String locator = properties.getProperty(ElementNameInpropFile);
	//将配置对象中的定位类型存到locatorType变量，将定位表达式的值存入locatorValue变量
	String locatorType = locator.split(">")[0];
	String locatorValue = locator.split(">")[1];
	//解决编码问题
	locatorValue = new String(locatorValue.getBytes("ISO-8859-1"),"UTF-8");
	//输出locateType变量值和locatorValue变量值，验证是否赋值正确
	System.out.println("获取的定位类型:" + locatorType + "\t 获取的定位表达式" +
	locatorValue);
	//根据locatorType的变量值内容判断返回何种定位方式的By对象
	if (locatorType.toLowerCase().equals("id"))
		return By.id(locatorValue);
	
	else if((locatorType.toLowerCase().equals("classname")) || (locatorType.
	toLowerCase().equals("class")))		
		return By.className(locatorValue);
	
	else if((locatorType.toLowerCase().equals("tagname")) || (locatorType.
	toLowerCase().equals("tag")))
		return By.className(locatorValue);
	
	else if((locatorType.toLowerCase().equals("linktext")) || (locatorType.
			toLowerCase().equals("link")))
				return By.linkText(locatorValue);
	
	else if(locatorType.toLowerCase().equals("partiallinktext"))
				return By.partialLinkText(locatorValue);
	
	else if((locatorType.toLowerCase().equals("cssselector")) || (locatorType.
			toLowerCase().equals("css")))
				return By.cssSelector(locatorValue);
	
	else if(locatorType.toLowerCase().equals("xpath"))
		return By.xpath(locatorValue);
	
	else
		throw new Exception("输入的locator type 未在程序中定义:" + locatorType);
	}	
}
