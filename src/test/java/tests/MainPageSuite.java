package tests;

import io.qameta.allure.Description;
import models.SocialNetwork;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import web.pages.BoltMainPage;

public class MainPageSuite {

    BoltMainPage mainPage = new BoltMainPage();

    @Test
    @DisplayName("Open main page")
    @Description("Open main page and check if navbar items exist")
    public void openMainPage() {
        mainPage.openPage();
    }

    @Test
    @DisplayName("Open drivers page")
    @Description("Open App Store and check if app is there")
    public void openDriversPage() {
        mainPage
                .openPage()
                .acceptCookies()
                .openDriversPage();
    }

    @Test
    @DisplayName("Open App Store")
    @Description("Open App Store and check if app is there")
    public void openAppStore() {
        mainPage
                .openPage()
                .acceptCookies()
                .openAppStore();
    }

    @Test
    @DisplayName("Open Google Play")
    @Description("Open Google Play and check if app is there")
    public void openGooglePlay() {
        mainPage
                .openPage()
                .acceptCookies()
                .openGooglePlay();
    }

    /**
        Ignored, since page is unavailable
     */
//    @Test
//    @DisplayName("Open Facebook")
//    @Description("Check if Facebook icon leads to Facebook page")
//    public void openFacebook() {
//        mainPage
//                .openPage()
//                .acceptCookies()
//                .openSocialNetworkPage(SocialNetwork.FACEBOOK.getName());
//    }

    @Test
    @DisplayName("Open Twitter")
    @Description("Check if twitter icon leads to twitter page")
    public void openTwitter() {
        mainPage
                .openPage()
                .acceptCookies()
                .openSocialNetworkPage(SocialNetwork.TWITTER.getName())
                .assertTwitterIsOpened();
    }

    @Test
    @DisplayName("Open Instagram")
    @Description("Check if Instagram icon leads to Instagram page")
    public void openInstagram() {
        mainPage
                .openPage()
                .acceptCookies()
                .openSocialNetworkPage(SocialNetwork.INSTAGRAM.getName())
                .assertInstagramIsOpened();
    }

    @Test
    @DisplayName("Open Linkedin")
    @Description("Check if Linkedin icon leads to Linkedin page")
    public void openLinkedin() {
        mainPage
                .openPage()
                .acceptCookies()
                .openSocialNetworkPage(SocialNetwork.LINKEDIN.getName())
                .assertLinkedinIsOpened();
    }

    @Test
    @DisplayName("Open TikTok")
    @Description("Check if TikTok icon leads to TikTok page")
    public void openTikTok() {
        mainPage
                .openPage()
                .acceptCookies()
                .openSocialNetworkPage(SocialNetwork.TIKTOK.getName())
                .assertTiktokIsOpened();
    }
}
