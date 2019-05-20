package com.imdb.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseSteps {
	
	@When("I log into the site with credentials {word}")
	public void i_log_into_the_site_with_credentials_frank_sinatra(String credentials) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	@When("I log into the site with credentials frank")
	public void i_log_into_the_site_with_credentials_frank() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	@Then("I will see a login error")
	public void i_will_see_an_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
