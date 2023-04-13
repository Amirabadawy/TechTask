package com.stctv.subscribe.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class Home extends BasePage{

    @FindBy(id="country-name")
    private WebElement countryName;

    @FindBy(id="name-lite")
    private WebElement litePlan;

    @FindBy(id="name-classic")
    private WebElement classicPlan;

    @FindBy(id="name-premium")
    private WebElement premiumPlan;

    @FindBy(xpath = "//*[@id= \"currency-lite\"]/i")
    private WebElement liteCurrency;

    @FindBy(id="currency-lite")
    private WebElement litePrice;

    @FindBy(id="currency-classic")
    private WebElement classicPrice;

    @FindBy(xpath = "//*[@id=\"currency-classic\"]/i")
    private WebElement classicCurrency;

    @FindBy(id="currency-premium")
    private WebElement premiumPrice;

    @FindBy(id="arrow")
    private WebElement arrow;

    @FindBy(id="bh")
    private WebElement Bahrain;

    @FindBy(id="sa")
    private WebElement Ksa;

    @FindBy(id="kw")
    private WebElement Kuwait;

    public void clickOnArrow(){
       arrow.click();
    }

    public void clickOnBahrain(){
        Bahrain.click();
    }

    public void clickOnKuwait(){
        Kuwait.click();
    }
    public WebElement getCountryName() {
        return countryName;
    }

    public WebElement getLitePlan() {
        return litePlan;
    }

    public WebElement getLitePrice() {
        return litePrice;
    }

    public WebElement getClassicPlan() {
        return classicPlan;
    }

    public WebElement getClassicPrice() {
        return classicPrice;
    }
    public WebElement getPremiumPlan() {
        return premiumPlan;
    }
    public WebElement getPremiumPrice() {
        return premiumPrice;
    }

    public List<String> getPrice(String planPrice) {
        String[] strParts= null;
        List<String> list = null;
//        strParts = planPrice.split("[SAR,/,month]");
        strParts = planPrice.split("[SAR |/|[ | ] |month]");
        list = Arrays.asList(strParts);
        return list;
    }


}
