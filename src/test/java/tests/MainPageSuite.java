package tests;

import enums.SocialNetwork;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.BoltMainPage;

public class MainPageSuite extends TestBase {

    BoltMainPage mainPage = new BoltMainPage();

    @Test
    @AllureId("6226")
    @DisplayName("Open main page")
    @Description("Open main page and check if navbar items exist")
    public void openMainPage() {
        mainPage.openPage();
    }

    @Test
    @AllureId("6227")
    @DisplayName("Open drivers page")
    @Description("Open drivers page and check if it contains text for drivers")
    public void openDriversPage() {
        mainPage
                .openPage()
                .acceptCookies()
                .openDriversPage();
    }

    @Test
    @AllureId("6228")
    @DisplayName("Open fleets page")
    @Description("Open fleets page and check if it contains text for fleets")
    public void openFleetsPage() {
        mainPage
                .openPage()
                .acceptCookies()
                .openFleetsPage();
    }

    @Test
    @AllureId("6235")
    @DisplayName("Open business page")
    @Description("Open business page and check is title contains business")
    public void openBusinessPage() {
        mainPage
                .openPage()
                .acceptCookies()
                .openBusinessPage();
    }

    @Test
    @AllureId("6236")
    @DisplayName("Open scooters page")
    @Description("Open scooters page and check if title contains business")
    public void openScootersPage() {
        mainPage
                .openPage()
                .acceptCookies()
                .openScootersPage();
    }

    @Test
    @AllureId("6237")
    @DisplayName("Open food page")
    @Description("Open food page and check if it contains Food in title")
    public void openDeliveryPage() {
        mainPage
                .openPage()
                .acceptCookies()
                .openFoodPage();
    }

    @Test
    @AllureId("6238")
    @DisplayName("Open cities page")
    @Description("Open cities page and check if it contains cities")
    public void openCitiesPage() {
        mainPage
                .openPage()
                .acceptCookies()
                .openCitiesPage();
    }

    @Test
    @AllureId("6229")
    @DisplayName("Open App Store")
    @Description("Open App Store and check if app is there")
    public void openAppStore() {
        mainPage
                .openPage()
                .acceptCookies()
                .openAppStore();
    }

    @Test
    @AllureId("6230")
    @DisplayName("Open Google Play")
    @Description("Open Google Play and check if app is there")
    public void openGooglePlay() {
        mainPage
                .openPage()
                .acceptCookies()
                .openGooglePlay();
    }

    @Test
    @AllureId("")
    @DisplayName("Open drivers page from main page")
    @Description("Open drivers page and check it's opened")
    public void openDriversPageFromMain() {
        mainPage
                .openPage()
                .acceptCookies()
                .openDriversPageFromMainPage();
    }

    @Test
    @AllureId("")
    @DisplayName("Open support center")
    @Description("Check if support center opens by click on text close to support icon ")
    public void openSupportCenter() {
        mainPage
                .openPage()
                .acceptCookies()
                .clickOnSupportCenterButton();
    }

    @Test
    @AllureId("")
    @DisplayName("Check copyright year")
    @Description("Check if copyright displays current year")
    public void checkIfCopyrightDisplaysCurrentYear() {
        mainPage
                .openPage()
                .acceptCookies()
                .checkCopyrightYear();
    }

    @Test
    @AllureId("")
    @DisplayName("Open legal page")
    @Description("Click on link in footer and check and check if page opened")
    public void openLegalPage() {
        mainPage
                .openPage()
                .acceptCookies()
                .clickOnLegalButton();
    }

    @Test
    @AllureId("6231")
    @DisplayName("Open Twitter")
    @Description("Check if twitter icon leads to twitter page")
    public void openTwitter() {
        mainPage
                .openPage()
                .acceptCookies()
                .openSocialNetworkPage(SocialNetwork.TWITTER.getName())
                .assertTwitterIsOpened();
    }

    @Disabled
    @AllureId("6232")
    @DisplayName("Open Instagram")
    @Description("Check if Instagram icon leads to Instagram page")
    public void openInstagram() {
        mainPage
                .openPage()
                .acceptCookies()
                .openSocialNetworkPage(SocialNetwork.INSTAGRAM.getName())
                .assertInstagramIsOpened();
    }

    @Disabled
    @Test
    @AllureId("6233")
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
    @AllureId("6234")
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