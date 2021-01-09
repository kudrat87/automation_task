package com.tipico.test_runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/rerun.txt", glue = "com/tipico/step_definition")
public class FailedTestRunner {
}
