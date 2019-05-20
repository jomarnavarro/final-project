package com.imdb.steps;

import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeSteps extends BaseSteps {
	@Given("I navigate to Home Page")
	public void i_navigate_to_Home_Page() {
	    home.goTo();
	}

	
	@Then("I will be in Home Page")
	public void i_will_be_in_Home_Page() {
	    assertTrue(home.isAt());
	}
}
