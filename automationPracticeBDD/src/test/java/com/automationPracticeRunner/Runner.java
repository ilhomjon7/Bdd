package com.automationPracticeRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith( Cucumber.class)
@CucumberOptions (
		plugin = {
				"html:target/cucumber_report",
				"json:target/cucumber_report/cucumber.json",
				"rerun:target/failed_scenarios/rerun.txt"
		},
		features = {"src/test/resources/featurs"},
		glue = {
				"com.automationPractice.steps"}, 
		tags = {//"@negative"},
				//"@contactUs"},
				"@multipExamples"},
				//"@login"},
		//@contactUs--- uses to select scenarios/feature
		//  ~@contactUs----uses to skip scenarios/feature  (~ this call`s tilde)
		monochrome = true
		//,dryRun = true
		//dryRun = true-->get step implementation for unimplemented in feature file
		)

public class Runner {
	

}
	