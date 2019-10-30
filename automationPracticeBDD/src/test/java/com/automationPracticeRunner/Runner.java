package com.automationPracticeRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith( Cucumber.class)
@CucumberOptions (
		features = {"src/test/resources/featurs/login.feature"},
		glue = {"com.automationPracticeLogin"},
		monochrome = true
		//dryRun = true-->get step implementation for unimplemented in feature file
		)

public class Runner {
	

}
	