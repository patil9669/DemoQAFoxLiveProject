package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features={ "D:\\Automation\\DATA NEW\\GitHubRepo\\DemoQAFoxLiveProject\\src\\test\\resources\\FeatureFiles\\Register.feature",
			"D:\\Automation\\DATA NEW\\GitHubRepo\\DemoQAFoxLiveProject\\src\\test\\resources\\FeatureFiles\\Login.feature",
			"D:\\Automation\\DATA NEW\\GitHubRepo\\DemoQAFoxLiveProject\\src\\test\\resources\\FeatureFiles\\Search.feature",
			"D:\\Automation\\DATA NEW\\GitHubRepo\\DemoQAFoxLiveProject\\src\\test\\resources\\FeatureFiles\\Orders.feature"
},
		glue={"com.tutorialsninja.automation.stepdef"},
		plugin={"html:target/cucumber_html_report"}
		//tags= {"@Search","@One"}
		
		)

public class TestRunner {

}
