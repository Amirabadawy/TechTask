package com.stctv.subscribe.tests.kuwaitPlans;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\Amira\\IdeaProjects\\TechTask\\src\\test\\java\\com\\stctv\\subscribe\\tests\\kuwaitPlans\\KuwaitPlans.feature",
        glue = {"com/stctv/subscribe/tests"},
        plugin = {"pretty","html:reports/KuwaitPlans-Report.html"},
        monochrome = true
)
public class KuwaitTestRunner extends AbstractTestNGCucumberTests {
}
