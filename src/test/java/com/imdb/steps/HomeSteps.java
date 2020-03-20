package com.imdb.steps;

import static org.junit.Assert.*;

import com.imdb.hooks.Hooks;
import com.imdb.sites.SinatraSite;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomeSteps {
	SinatraSite sinatraSite;

	public HomeSteps(Hooks hooksClass) {
		this.sinatraSite = hooksClass.getSinatraSite();
	}

	@Given("I navigate to Home Page")
	public void i_navigate_to_Home_Page() {
	    sinatraSite.home().goTo();
	}

	
	@Then("I will be in Home Page")
	public void i_will_be_in_Home_Page() {
	    assertTrue(sinatraSite.home().isAt());
	}
}
