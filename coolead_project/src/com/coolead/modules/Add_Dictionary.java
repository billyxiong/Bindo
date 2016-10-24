package com.coolead.modules;

import org.openqa.selenium.WebDriver;

import com.coolead.page_object.DictionaryPage;
import com.coolead.util.Constant;

public class Add_Dictionary {
	public static void execute(WebDriver driver ) throws Exception{
		DictionaryPage add_dictionary = new DictionaryPage(driver);
		add_dictionary.user_menu_system().click();
		Thread.sleep(1000);
		add_dictionary.dictionary_menu().click();
		Thread.sleep(1000);
		add_dictionary.dictionary_new_button().click();
		Thread.sleep(1000);
		add_dictionary.dictionay_type_input().sendKeys(Constant.dictionary_type);
		add_dictionary.dictionay_name_input().sendKeys(Constant.dictionary_name);
		add_dictionary.dictionay_submit_button().click();
		Thread.sleep(1000);
		add_dictionary.dictionay_last_page().click();
		Thread.sleep(1000);
		add_dictionary.dictionay_config_button().click();
		Thread.sleep(1000);
		add_dictionary.dictionay_add_item().click();
		add_dictionary.dictionay_item_code().sendKeys(Constant.dictionary_item_code);
		add_dictionary.dictionay_item_name().sendKeys(Constant.dictionary_item_name);
		add_dictionary.dictionay_item_value().sendKeys(Constant.dictionary_item_value);
		add_dictionary.dictionay_item_order().sendKeys(Constant.dictionary_item_order);
		add_dictionary.dictionay_item_save().click();
		Thread.sleep(1000);
		add_dictionary.dictionay_item_return().click();
		Thread.sleep(1000);
		add_dictionary.dictionay_last_page().click();
		Thread.sleep(1000);
		add_dictionary.dictionay_select().click();
		Thread.sleep(1000);
		add_dictionary.dictionay_delete_button().click();
		Thread.sleep(1000);
		add_dictionary.dictionay_delete_confirm().click();
	}
}
