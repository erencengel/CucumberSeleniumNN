package com.cyber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/cyber/step_definitions",
        dryRun = false,
        tags = "@login_functionality"
)
public class CukesRunner {
}
