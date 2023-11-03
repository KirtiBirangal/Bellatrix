package com.bellatrix.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bellatrix.base.Keyword;
import com.bellatrix.config.Configuration;
import com.bellatrix.stepdefinitions.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PromotionsPage {
	Keyword keyword = new Keyword();
	Configuration config= new Configuration();
	
	public PromotionsPage() {
		PageFactory.initElements(TestBase.getDriver(),this);
	}
	//site-navigation div:nth-of-type(1) ul li:nth-of-type(7) a
	// html > body > div:first-of-type > header > div:nth-of-type(2) > div > nav > div:first-of-type > ul > li:nth-of-type(7) > a
	@FindBy(xpath ="//a[contains(@href,\"welcome\")]")
	WebElement promotions;

	@FindBy(css = "button#couponBtn")
	WebElement coupon;

	
	public void ClickOnPromotions() {
		keyword.launchUrl(config.getAppUrl("beta"));
		promotions.click();
		
	}
	public void AlertClickOnCoupon() {

		coupon.click();
	//	keyword.alertAccept();
	//	keyword.alertGetText();
	}
}
