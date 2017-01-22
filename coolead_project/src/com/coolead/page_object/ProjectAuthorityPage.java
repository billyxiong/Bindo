package com.coolead.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.coolead.util.ObjectMap;

public class ProjectAuthorityPage {

	private WebElement element = null;
		//指定页面元素定位表达式配置文件的相对文件路径
	private ObjectMap objectMap = new ObjectMap(System.getProperty("user.dir")+"\\config\\objectMap.properties");
	private WebDriver driver;
	public ProjectAuthorityPage(WebDriver driver){
		this.driver = driver;
	}
	
		//返回系统菜单
		public WebElement system_menu() throws Exception{
			element = driver.findElement(objectMap.getLocator("em.authority.system"));		
			return element;
		}
		
		//返回项目权限菜单
		public WebElement  project_authority_menu() throws Exception{
			element = driver.findElement(objectMap.getLocator("em.authority.menu"));
			return element;
		}
		
		//返回项目搜索框
		public WebElement  project_search_input() throws Exception{
			element = driver.findElement(objectMap.getLocator("em.authority.project_search_input"));
			return element;
		}
		
		//返回搜索按钮
		public WebElement  project_search_button() throws Exception{
			element = driver.findElement(objectMap.getLocator("em.authority.project_search_button"));
			return element;
		}
		
		//返回组织机构下拉框
		public WebElement  organization_select() throws Exception{
			element = driver.findElement(objectMap.getLocator("em.authority.organization_select"));
		    return element;
		}

		//返回组织机构查询按钮
		public WebElement  organization_search_button() throws Exception{
			element = driver.findElement(objectMap.getLocator("em.authority.organization_search_button"));
		    return element;
		}
		
		//返回用户名输入框
		public WebElement user_search_input() throws Exception{
			element = driver.findElement(objectMap.getLocator("em.autority.user_search_input"));
			return element;
		}
		
		//返回用户名搜索按钮
		public WebElement user_search_button() throws Exception{
			element = driver.findElement(objectMap.getLocator("em.autority.user_search_button"));
			return element;
		}
		
		//返回保存按钮
		public WebElement  authority_save() throws Exception{
			element = driver.findElement(objectMap.getLocator("em.authority.save_button"));
		    return element;
		}		
}
