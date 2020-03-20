package com.imdb.steps;

import com.imdb.hooks.Hooks;
import com.imdb.sites.SinatraSite;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	SinatraSite sinatraSite;

	public LoginSteps(Hooks hooksClass) {
		this.sinatraSite = hooksClass.getSinatraSite();
	}

	@When("I log into the site with credentials {word}")
	public void i_log_into_the_site_with_credentials_frank_sinatra(String credentials) {
		//trabajo en dos paginas.  la home page, y la login page
		sinatraSite.home().startLogin();
		sinatraSite.login().loginCorrecto(credentials);
	    
	}

	@Then("I will see a login error")
	public void i_will_see_an_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
