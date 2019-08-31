package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class SongsListPage extends BasePage {
	
	@FindBy(how = How.XPATH, using =  "//a[contains(@href, 'new')]")
	WebElement createNewSongLink;

	public SongsListPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void validateCreateSongLinkDisplayed() {
		// validate 'Create a new Song exists.
		assertTrue(createNewSongLink.isDisplayed());
	}

}
