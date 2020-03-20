package com.imdb.sites;

import com.imdb.pages.*;
import org.openqa.selenium.WebDriver;

public class SinatraSite {
    private HomePage home;
    private LoginPage login;
    private SongInfoPage songInfo;
    private SongsListPage songList;
    private SongCreationPage songCreation;
    private WebDriver driver;

    public SinatraSite(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage home() {
        if(home == null) {
            return new HomePage(driver);
        }
        return home;
    }

    public LoginPage login() {
        if(home == null) {
            return new LoginPage(driver);
        }
        return login;
    }

    public SongInfoPage songInfo() {
        if(songInfo == null) {
            return new SongInfoPage(driver);
        }
        return songInfo;
    }

    public SongsListPage songList() {
        if(songList == null) {
            return new SongsListPage(driver);
        }
        return songList;
    }

    public SongCreationPage songCreation() {
        if(songCreation == null) {
            return new SongCreationPage(driver);
        }
        return songCreation;
    }
}
