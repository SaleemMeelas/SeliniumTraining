package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "org.stepdefinition", 
monochrome = true,
dryRun = false,
strict = true,
snippets = SnippetType.UNDERSCORE,
tags = "@Login",
plugin = {"html:Report", 
		"junit:Report\\Junitreport.xml", 
		"json:Report\\Jsonreport.json"})

public class TestRunnerClass {

}