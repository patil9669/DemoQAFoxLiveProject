package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeadersSection {
	
	public HeadersSection () {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//span[text()=\"My Account\"]")
	public static WebElement myAccountLink;

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	public static WebElement register;

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	public static WebElement login;
	
	@FindBy(xpath="//*[@id=\"search\"]/input")
	public static WebElement searchBoxField;
	
	@FindBy(xpath="//*[@id=\"search\"]/span/button")
	public static WebElement searchButtton;
	
	//@FindBy(xpath="//span[text()='ShoppingCart']")
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[4]/a/span")
	public static WebElement viewShoppingCartOption;
	
	public static void navigateToLoginPage() {
		
		Elements.click(myAccountLink);
		Elements.click(login);
	}
	
	public static void searchProduct() {
		
		Elements.TypeText(HeadersSection.searchBoxField, Base.reader.getProduct());
	    Elements.click(HeadersSection.searchButtton);
	}
	
	public static void navigateToShoppingCartPage() {
		
		Elements.click(HeadersSection.viewShoppingCartOption);
	}
}
