package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {

	public LoginPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-email")
	public static WebElement email;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	public static WebElement loginButton;
	
	@FindBy(xpath="//*[@id=\"account-login\"]/div[1]")
	public static WebElement mainWarning;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")
	public static WebElement forgotPassword;
	
	public static void doLogin(String username, String password) {
	
	Elements.TypeText(LoginPage.email, username);
	Elements.TypeText(LoginPage.password, password);
	Elements.click(LoginPage.loginButton);
	
	}
}
