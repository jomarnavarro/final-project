package com.imdb.steps;

import com.imdb.hooks.Hooks;
import com.imdb.sites.SinatraSite;
import cucumber.api.java.en.Then;

public class SongCreationSteps {

	SinatraSite sinatraSite;

	public SongCreationSteps(Hooks hooksClass) {
		this.sinatraSite = hooksClass.getSinatraSite();
	}
	@Then("I will be able to Add a Song")
	public void i_will_be_able_to_Add_a_Song() {
	    // trabajamos en dos paginas: Home page y SongsListPage
		sinatraSite.home().listSongs();
		sinatraSite.songList().validateCreateSongLinkDisplayed();
	}
}
