package com.stctv.subscribe.tests.bahrainPlans;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\Amira\\IdeaProjects\\TechTask\\src\\test\\java\\com\\stctv\\subscribe\\tests\\bahrainPlans\\BahrainPlans.feature",
        glue = {"com/stctv/subscribe/tests"},
        plugin = {"pretty","html:reports/BahrainPlans-Report.html"},
        monochrome = true
)
public class BahrainTestRunner extends AbstractTestNGCucumberTests {
}
