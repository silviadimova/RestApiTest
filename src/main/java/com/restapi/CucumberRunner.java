package com.restapi;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/features"},
        glue = {"src/main/java/com/restapi/stepDefinitions"},
        tags = {"@Acceptance"}
)

@SuppressWarnings("unused")
public class CucumberRunner {
    //unused
}
