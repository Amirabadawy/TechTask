package com.stctv.subscribe.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverHandler {

    private static WebDriver webDriver;

    public DriverHandler(){
        getDriverType();
    }

    public void getDriverType(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public void navigate(String link){
        webDriver.navigate().to(link);
    }

    public void close(){
        webDriver.quit();
    }

}
