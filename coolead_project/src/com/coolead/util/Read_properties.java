package com.coolead.util;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.MissingResourceException;
import java.util.Properties;

public class Read_properties
{
public static String getPropertyString(String key ) {

	String propertyFileName = System.getProperty("user.dir")+"\\config\\Browser_type.properties";      //获得文件路径
   Properties properties = new Properties();
   
   try {
properties.load(new FileInputStream(propertyFileName));    //获取文件中的内容
}catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
       if (key == null || key.equals("") || key.equals("null")) {
           return "";
       }
       String result = "";
       try {
           result = properties.getProperty(key);        //取key的value值
       } catch (MissingResourceException e) {
           e.printStackTrace();
       }
       return result;
	}
}