package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.imdb.utils.Properties;

public class HomePage extends BasePage {

	// page members
	WebElement pageTitle;
	WebElement linksMenu;
	WebElement sinatraImg;
	WebElement loginLink;
	WebElement logoutLink;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void goTo() {
		driver.get(Properties.SONGS_BY_SINATRA_URL);
	}

	public boolean isAt() {
		return pageTitle.isDisplayed() &&
				linksMenu.isDisplayed() &&
				sinatraImg.isDisplayed() &&
				loginLink.isDisplayed();
	}

	public boolean isLogged() {
		return false;
	}

	public void startLogin() {
	}

	public void startLogout() {
	}
}
