package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class ShoppingCartPage {
	
public ShoppingCartPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	//@FindBy(linkText="Checkout")
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[2]/a") 
	public static WebElement checkOutButton;
	
	public static void navigateToCheckoutPage() {
		
	Elements.click(ShoppingCartPage.checkOutButton);
}
	

}
