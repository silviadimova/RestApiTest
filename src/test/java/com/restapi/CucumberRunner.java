package com.restapi;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/test/resources/features" },
        glue = { "src/test/java/com/restapi/stepDefinitions" },
        tags = { "@acceptance, @smoke" },
        plugin = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber-json-report.json" },
        dryRun = true
)

@SuppressWarnings("unused")
public class CucumberRunner {
    //unused
}
