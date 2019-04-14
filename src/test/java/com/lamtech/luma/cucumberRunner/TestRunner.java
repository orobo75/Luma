package com.lamtech.luma.cucumberRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature",
         glue = {"com.lamtech.luma.stepDefinition","com.lamtech.luma.cucumberRunner"},
         tags = {"@Register"},
         format = {

                 "html:target/site/cucumber-pretty"
        })


public class TestRunner {
 }
