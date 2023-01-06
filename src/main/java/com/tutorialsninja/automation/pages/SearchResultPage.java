package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class SearchResultPage {
	
	public SearchResultPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"search\"]/input")
	public static WebElement searchBoxField;
	
	//@FindBy(linkText="HP LP3065")
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a")
	public static WebElement hPLP3065;
	
	@FindBy(xpath="//*[@id=\"search\"]/span/button")
	public static WebElement searchButtton;
	
	@FindBy(css="input[id='button-search']+h2+p")
	public static WebElement noResultsMessage;
	
	@FindBy(xpath = "//span[text()='Add to Cart'][1]")
	//@FindBy(xpath ="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]")
	public static WebElement firstAddToCartOption;
	
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	public static WebElement addToCartOption;
	
	public static void addFirstProductInTheSearchResultToCart() {
		Elements.click(SearchResultPage.firstAddToCartOption);
	}


	public static void addToCartOption() {

		Elements.click(SearchResultPage.addToCartOption);
		
	}

}
