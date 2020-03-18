package com.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources"},
		glue = {"com.sapient.steps"},
		plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber-json-report"},
		monochrome = true
)


public class TestRunner {

}
