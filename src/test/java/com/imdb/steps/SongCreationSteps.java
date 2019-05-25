package com.imdb.steps;

import cucumber.api.java.en.Then;

public class SongCreationSteps extends BaseSteps {

	@Then("I will be able to Add a Song")
	public void i_will_be_able_to_Add_a_Song() {
	    // trabajamos en dos paginas: Home page y SongsListPage
		home.listSongs();
		songList.validateCreateSongLinkDisplayed();
	}
}
