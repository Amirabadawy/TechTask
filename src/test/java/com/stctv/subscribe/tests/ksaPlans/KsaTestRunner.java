package com.stctv.subscribe.tests.ksaPlans;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\Amira\\IdeaProjects\\TechTask\\src\\test\\java\\com\\stctv\\subscribe\\tests\\ksaPlans\\KsaPlan.feature",
        glue = {"com/stctv/subscribe/tests"},
        plugin = {"pretty","html:reports/KSAPlans-Report.html"},
        monochrome = true
)
public class KsaTestRunner extends AbstractTestNGCucumberTests {
}
