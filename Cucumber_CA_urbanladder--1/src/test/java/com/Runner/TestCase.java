package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features",
				 glue="stepDef",
				 dryRun=false,
				 plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

					
public class TestCase {

}
