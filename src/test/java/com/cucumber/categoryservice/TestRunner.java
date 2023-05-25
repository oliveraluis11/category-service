package com.cucumber.categoryservice;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/",
                glue={"com.cucumber.categoryservice.steps",
                "com.cucumber.categoryservice"})
public class TestRunner {
}
