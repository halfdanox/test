package com.HepsiBurada.bdd.runner;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "com.HepsiBurada.bdd.steps",
        features = "src/test/resources"
)
public class CucumberRunnerTest  {
}
