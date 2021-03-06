package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucmber-report.html",
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        monochrome = false,
        dryRun = false,
        tags = "@wip"
)
public class NewRunner {
}
