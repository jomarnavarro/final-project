package com.imdb.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
			"src/test/resources/features/login.feature"
		},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/login.json",
        "html:target/login-html"},
        glue = {"com.imdb.sites",
				"com.imdb.pages",
                "com.imdb.steps",
                "com.imdb.utils",
                "com.imdb.hooks"})


public class LoginRunner {}
