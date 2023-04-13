package com.stctv.subscribe.tests;

import com.stctv.subscribe.browser.Browser;
import com.stctv.subscribe.pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class PlansStepDefs extends BaseTest {
    List<String> list;

    @Given("website is opened")
    public void websiteIsOpened() {
        browser = new Browser();
        BasePage.waitUntilPageLoaded();
    }

    @When("click on arrow button in home page")
    public void clickOnSearchButton(){
        browser.stcTv.home.clickOnArrow();
    }

    @When("click on Bahrain country in popUp")
    public void clickOnBahrainCountry(){
        browser.stcTv.home.clickOnBahrain();
    }

    @When("click on Kuwait country in popUp")
    public void clickOnKuwaitCountry(){
        browser.stcTv.home.clickOnKuwait();
    }

    @Then("country Name {string} should be displayed in home page")
    public void KSACountryShouldBeDisplayed(String countryName){
        Assert.assertEquals(browser.stcTv.home.getCountryName().getText(),countryName);
    }

    @Then("plan type should be lite {string} in home page")
    public void planTypeShouldBeDisplayedLite(String planType){
        Assert.assertEquals(browser.stcTv.home.getLitePlan().getText(),planType);
    }

    @Then("plan type should be classic {string} in home page")
    public void planTypeShouldBeDisplayedClassic(String planType){
        Assert.assertEquals(browser.stcTv.home.getClassicPlan().getText(),planType);
    }

    @Then("plan type should be premium {string} in home page")
    public void planTypeShouldBeDisplayedPremium(String planType){
        Assert.assertEquals(browser.stcTv.home.getPremiumPlan().getText(),planType);
    }


    @Then("price of lite plan should be {string} in home page")
    public void priceOfLitePlanShouldBe(String planPrice){
//        list = browser.stcTv.home.getPrice(browser.stcTv.home.getLitePrice().getText());
//        list.toString();
//        Assert.assertEquals(list, planPrice);
        Assert.assertTrue(browser.stcTv.home.getLitePrice().getText().contains(planPrice));
    }

    @Then("currency should be {string} in home page")
    public void currencyShouldBe(String currency){
        Assert.assertTrue(browser.stcTv.home.getLitePrice().getText().contains(currency));
    }

    @Then("price of classic plan should be {string} in home page")
    public void priceOfClassicPlanShouldBe(String planPrice){
        Assert.assertTrue(browser.stcTv.home.getClassicPrice().getText().contains(planPrice));
    }

    @Then("price of premium plan should be {string} in home page")
    public void priceOfPremiumPlanShouldBe(String planPrice){
        Assert.assertTrue(browser.stcTv.home.getPremiumPrice().getText().contains(planPrice));
    }


}
