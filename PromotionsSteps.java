package com.bellatrix.steps;
import org.apache.log4j.Logger;

import com.bellatrix.base.Keyword;
import com.bellatrix.config.Configuration;
import com.bellatrix.pages.PromotionsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PromotionsSteps {
	Keyword keyword = new Keyword();
	Configuration config= new Configuration();
	PromotionsPage promo= new PromotionsPage();
	private static final Logger LOG = Logger.getLogger(PromotionsSteps.class);
	@Given("Application Url is launched and Clicked on Promotions Bar")
	public void clickingOnPromotions() {
		LOG.info(" logg before");
		promo.ClickOnPromotions();
		System.out.println("after");
		}
	
	
	
	@When("Clicked on the question alert should be displayed,Click on the Ok button")
	public void alertOfCoupon() {
	promo.AlertClickOnCoupon();
	}
	
}
