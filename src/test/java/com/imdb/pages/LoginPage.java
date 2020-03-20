package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.imdb.utils.Locators;
import com.imdb.utils.Utils;

public class LoginPage extends BasePage {

	@FindBy(how = How.ID, using =  Locators.USER_FIELD_ID)
	WebElement userField;// : id="username"
	
	@FindBy(how = How.ID, using =  Locators.PASS_FIELD_ID)
	WebElement passField;// : id="password"
	
	@FindBy(how = How.XPATH, using =  "//input[@value = 'Log In' ]")
	WebElement loginButton;// : xpath = "//input[@value = 'Log In' ]"

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void loginCorrecto(String credentials) {
		
		userField.sendKeys(Utils.getUser(credentials));
		passField.sendKeys(Utils.getPassword(credentials));
		loginButton.click();

	}
}
