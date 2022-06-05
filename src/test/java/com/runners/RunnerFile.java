package com.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features/",
				 glue="com.steps",
				 dryRun=false,
				 monochrome=true)
	
public class RunnerFile extends AbstractTestNGCucumberTests{

}
