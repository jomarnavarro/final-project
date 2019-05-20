package com.imdb.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	
	@Before
	public void before() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
		home = new HomePage(driver);
		login = new LoginPage(driver);
	}
	
	@After
	public void after() {
		//code goes here
	}

}
