package com.coolead.modules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.coolead.page_object.ProjectAuthorityPage;
import com.coolead.util.Constant;

public class Project_Authoriy {
	public static void add(WebDriver driver ) throws Exception{
		ProjectAuthorityPage projectAuthorityPage = new ProjectAuthorityPage(driver);
		//点击系统菜单
		projectAuthorityPage.system_menu().click();
		Thread.sleep(1000);
		//点击项目权限菜单
		projectAuthorityPage.project_authority_menu().click();
		Thread.sleep(1000);
		//输入项目名称进行搜索
		projectAuthorityPage.project_search_input().sendKeys(Constant.projectname);	
		Thread.sleep(1000);
		projectAuthorityPage.project_search_button().click();
		Thread.sleep(1000);
		//点击选中搜索到的项目
		driver.findElement(By.xpath(Constant.project_name)).click();
		Thread.sleep(1000);		
		
		//点击组织结构下拉选择框
		//projectAuthorityPage.organization_select().click();
		//Thread.sleep(1000);
		//点击选中新建的组织名称
		//driver.findElement(By.xpath(Constant.project_organization)).click();
		//Thread.sleep(1000);
		//点击搜索组织，获取用户列表
		//projectAuthorityPage.organization_search_button().click();
		//Thread.sleep(1000);
		
		//输入用户名进行搜索
		projectAuthorityPage.user_search_input().sendKeys(Constant.real_name);
		Thread.sleep(1000);
		projectAuthorityPage.user_search_button().click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		//点击选择新建的用户，复选框勾选
		driver.findElement(By.xpath(Constant.user_select)).click();
		//保存权限关系
		projectAuthorityPage.authority_save().click();
	}
}
