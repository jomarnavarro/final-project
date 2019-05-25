package com.imdb.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.imdb.hooks.Hooks;
import com.imdb.pages.HomePage;
import com.imdb.pages.LoginPage;
import com.imdb.pages.SongCreationPage;
import com.imdb.pages.SongInfoPage;
import com.imdb.pages.SongsListPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseSteps {
	protected WebDriver driver;
	public HomePage home;
	public LoginPage login;
	public SongCreationPage songCreation;
	public SongInfoPage songInfo;
	public SongsListPage songList;
	
	public BaseSteps() {
		this.driver = Hooks.driver;
		home = new HomePage(driver);
		login = new LoginPage(driver);
		songCreation = new SongCreationPage(driver);
		songInfo = new SongInfoPage(driver);
		songList = new SongsListPage(driver);
	}
}
