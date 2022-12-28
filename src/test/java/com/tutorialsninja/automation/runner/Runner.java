package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features={"D:\\Automation\\DATA NEW\\GitHubRepo\\DemoQAFoxLiveProject\\src\\test\\resources\\FeatureFiles\\register.feature"},
		glue={"com.tutorialsninja.automation.stepdef"},
		plugin={"html:target/cucumber_html_report"},
		dryRun=false,
		tags={"@Register"},
		strict=true
		)

public class Runner {

}
