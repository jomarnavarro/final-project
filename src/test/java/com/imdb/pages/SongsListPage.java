package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.*;

public class SongsListPage extends BasePage {
	
	@FindBy(xpath =  "//a[contains(@href, 'new')]")
	WebElement createNewSongLink;

	public SongsListPage(WebDriver driver) {
		super(driver);
	}

	public void validateCreateSongLinkDisplayed() {
		// validate 'Create a new Song exists.
		assertTrue(createNewSongLink.isDisplayed());
	}
}
