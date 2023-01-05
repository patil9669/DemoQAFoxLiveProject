package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class OrderSuccessPage {
	
	public OrderSuccessPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	//@FindBy(linkText="Success")
	@FindBy(css="div[class$='col-sm-12']")
	public static WebElement successBreadcrumb;

}
