package com.stctv.subscribe.browser;

import com.stctv.subscribe.driver.DriverHandler;
import com.stctv.subscribe.stcWebsite.StcTvWeb;
import org.openqa.selenium.WebDriver;

public class Browser {

    private final WebDriver webDriver = DriverHandler.getWebDriver();
    public StcTvWeb stcTv;

    public Browser(){
        stcTv = new StcTvWeb();
    }
}
