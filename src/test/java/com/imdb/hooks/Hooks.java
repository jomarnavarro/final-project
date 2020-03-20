package com.imdb.hooks;

import java.util.concurrent.TimeUnit;

import com.imdb.sites.SinatraSite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public  WebDriver driver;
	public  WebDriverWait wait;

	public SinatraSite sinatraSite;
	
	@Before
	public void before() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 15);
		sinatraSite = new SinatraSite(driver);
	}
	
	@After
	public void after() {
		driver.quit();
	}

	public WebDriver getWebDriver() {
		return driver;
	}

	public SinatraSite getSinatraSite() {
		return sinatraSite;
	}

}
