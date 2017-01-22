package com.coolead.example;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.coolead.modules.Driver_select;
import com.coolead.util.Constant;

public class ScreenShot {
  @Test
  public void f() throws IOException {
	  WebDriver driver = Driver_select.getDriver();
	  driver.get(Constant.Url);
	  File ShotPic = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try
	{  
		FileUtils.copyFile(ShotPic, new File(System.getProperty("user.dir") +
				"\\ShotPic\\1.png"));
	}
	
		catch (IOException e){
		  e.printStackTrace();
	  	}
  	}
  }
