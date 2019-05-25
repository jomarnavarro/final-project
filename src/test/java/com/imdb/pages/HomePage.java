package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.imdb.utils.Properties;

public class HomePage extends BasePage {

	// page members
	@FindBy(how = How.XPATH, using =  "//h1")
	WebElement pageTitle;
	
	@FindBy(how = How.XPATH, using = "//ul")
	WebElement linksMenu;
	
	@FindBy(how=How.XPATH, using ="//img")
	WebElement sinatraImg;
	
	@FindBy(how=How.XPATH, using="//a[contains(@href,'login')]")
	WebElement loginLink;
	
	@FindBy(how=How.LINK_TEXT, using="log out")
	WebElement logoutLink;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Songs']")
	WebElement songsLink;

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void goTo() {
		driver.get(Properties.SONGS_BY_SINATRA_URL);
	}

	public boolean isAt() {
		return pageTitle.isDisplayed() &&
				linksMenu.isDisplayed() &&
				sinatraImg.isDisplayed();
	}

	public boolean isLogged() {
		return false;
	}

	public void startLogin() {
		loginLink.click();
	}

	public void startLogout() {
	}

	public void listSongs() {
		// dar click en Songs
		this.songsLink.click();
		
	}
}
