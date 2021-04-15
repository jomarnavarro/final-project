package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.imdb.utils.Properties;

public class HomePage extends BasePage {

	// page members
	@FindBy(xpath ="//h1")
	WebElement pageTitle;
	
	@FindBy(xpath = "//ul")
	WebElement linksMenu;
	
	@FindBy(xpath ="//img")
	WebElement sinatraImg;
	
	@FindBy(xpath ="//a[contains(@href,'login')]")
	WebElement loginLink;
	
	@FindBy(linkText = "log out")
	WebElement logoutLink;
	
	@FindBy(xpath = "//a[@title='Songs']")
	WebElement songsLink;

	@FindBy(id = "flash")
	public WebElement welcomeLbl; //id = "flash"

	public HomePage(WebDriver driver) {
		super(driver);
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
