package com.coolead.util;

import org.testng.log4testng.Logger;

public class Log {
	private static Logger Log = Logger.getLogger(null);
	
	//定义测试用例开始执行的打印方法，在日志打印测试用例开始执行信息
	public static void startTestCase(String testCaseName){
		Log.info("-----------------           \"" + testCaseName 
				+"\"开始执行   ---------------");			
	}
	
	//定义测试用例执行完后的打印方法，在日志中打印测试用例执行完毕的信息
	 public static void endTestcase(String testCaseName){
		 Log.info("-----------------           \"" + testCaseName 
					+"\"结束执行   ---------------");
	 }
	 
	 //定义打印info级别日志的方法
	 public static void info(String message){
		 Log.error(message);
	 }
	 
	 //定义打印error级别日志的方法
	 public static void error(String message){
		 Log.error(message);
	 }
	 
	 //定义打印debug级别日志的方法
	 public static void debug(String message){
		 Log.debug(message);
	 }
}
