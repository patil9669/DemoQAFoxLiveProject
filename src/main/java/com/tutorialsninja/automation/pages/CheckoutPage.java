package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckoutPage {
	
public CheckoutPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	//@FindBy(id="button-payment-address")
	@FindBy(xpath="//*[@id=\"button-payment-address\"]")
	public static WebElement continueButtonOfBillingDetailsSection;
	
	//@FindBy(id="button-shipping-address")
	@FindBy(xpath="//*[@id='button-shipping-address']")
	public static WebElement continueButtonOfDeliveryDetailsSection;
	
	//@FindBy(id="button-shipping-method")
	@FindBy(xpath="//*[@id='button-shipping-method']")
	public static WebElement continueButtonOfDeliveryMethodSection;
	
	//@FindBy(name="agree")
	@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")
	public static WebElement termsAndConditionsCheckbox;
	
	//@FindBy(id="button-payment-method")
	@FindBy(xpath="//*[@id='button-payment-method']")
	public static WebElement continueButtonOfPaymentMethodSection;
	
	//@FindBy(id="button-confirm")
	@FindBy(xpath="//*[@id='button-confirm']")
	public static WebElement confirmOrderButton;
	
	public static void placeAnOrder() throws InterruptedException {
		
		Elements.click(CheckoutPage.continueButtonOfBillingDetailsSection);
	    Elements.click(CheckoutPage.continueButtonOfDeliveryDetailsSection);
	    Elements.click(CheckoutPage.continueButtonOfDeliveryMethodSection);
	    Elements.click(CheckoutPage.termsAndConditionsCheckbox);
	    Elements.click(CheckoutPage.continueButtonOfPaymentMethodSection);
	    Elements.click(CheckoutPage.confirmOrderButton);
	}
	

}
