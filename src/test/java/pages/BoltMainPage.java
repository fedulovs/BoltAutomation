package pages;

import config.App;
import io.qameta.allure.Step;
import pages.components.Navbar;

import java.util.Calendar;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class BoltMainPage {

    String url = App.config.webUrl();
    Navbar navbar = new Navbar();

    @Step("Open url and check it's items")
    public BoltMainPage openPage() {
        openUrl();
        navbar.checkNavbarItems();
        return this;
    }

    @Step("Open url")
    public BoltMainPage openUrl() {
        open(url);
        String actualTitle = title();
        String expectedTitle = "Bolt | Быстрые и доступные поездки";
        assertThat(actualTitle).isEqualTo(expectedTitle);
        return this;
    }

    @Step("Open drivers page")
    public void openDriversPage() {
        navbar.openTabWithJS(1);
        $(byText("Зарегистрируйтесь в качестве водителя")).shouldBe(visible);
    }

    @Step("Open fleets page")
    public void openFleetsPage() {
        navbar.openTabWithJS(2);
        $(byText("Add your Fleet to Bolt")).shouldBe(visible);
        $(byText("Manage drivers, vehicles and documents.")).shouldBe(visible);
    }

    @Step("Open business page")
    public void openBusinessPage() {
        navbar.openTabWithJS(3);
        $(byText("Быстрые, удобные и доступные деловые поездки")).shouldBe(visible);
        $(byText("Контролируйте передвижение вашей команды. Поездки на работу, встречи, трансферы в аэропорт," +
                " поездки для гостей компании. Управляйте всем на одной платформе.")).shouldBe(visible);
    }

    @Step("Open scooters page")
    public void openScootersPage() {
        navbar.openTabWithJS(4);
        $(byText("Безопасно.")).shouldBe(visible);
        $(byText("Доступно.")).shouldBe(visible);
        $(byText("С заботой об окружающей среде.")).shouldBe(visible);
    }

    @Step("Open food page")
    public void openFoodPage() {
        navbar.openTabWithJS(5);
        assertThat(title()).isEqualTo("Bolt Food - Bolt Food");
    }

    @Step("Open cities page")
    public void openCitiesPage() {
        navbar.openTabWithJS(6);
        $("[aria-atomic='true']").shouldHave(text("Navigated to Найти город"));
    }

    @Step("Open App Store")
    public BoltMainPage openAppStore() {
        $(".app-store-button").click();
        $(".we-localnav__title__product").shouldHave(text("App Store"));
        $(".app-header__title").shouldHave(text("Bolt: Fast, Affordable Rides"));
        return this;
    }

    @Step("Open Google Play and check if app is there")
    public BoltMainPage openGooglePlay() {
        $(".play-store-button").click();
        $("[aria-label='Google Play Logo']").shouldBe(visible);
        $("[itemprop=name]").shouldHave(text("Bolt: Доступные Поездки"));
        return this;
    }

    @Step("Click on drivers button")
    public BoltMainPage openDriversPageFromMainPage() {
        $(byText("Зарегистрируйтесь в качестве водителя")).click();
        // This time text is on drivers page
        $(byText("Зарегистрируйтесь в качестве водителя")).shouldBe(visible);
        return this;
    }

    @Step("Click on support center button")
    public BoltMainPage clickOnSupportCenterButton() {
        $("[alt='help icon']").sibling(0).click();
        $(byText("Bolt Food")).shouldBe(visible);
        $(byText("Bolt Business")).shouldBe(visible);
        return this;
    }

    @Step("Click on support legal button")
    public BoltMainPage clickOnLegalButton() {
        $(byText("Правовая информация")).click();
        $(byText("Правовая информация")).shouldBe(visible);
        return this;
    }

    @Step("Accept all cookies")
    public BoltMainPage acceptCookies() {
        $(".cb-bolt-btn-accept").click();
        return this;
    }

    @Step("Switch to opened tab")
    public void switchToOpenedTab() {
        switchTo().window(1);
    }

    @Step("Click on network icon")
    public BoltMainPage openSocialNetworkPage(String network) {
        $("[alt='Bolt on " + network + "']").click();
        return this;
    }

    @Step("Check if Facebook is opened")
    public BoltMainPage assertFacebookIsOpened() {
        // TODO add assertion when page will be restored
        return this;
    }

    @Step("Check if Twitter is opened")
    public BoltMainPage assertTwitterIsOpened() {
        $("[placeholder='Поиск в Твиттере']").shouldBe(visible);
        return this;
    }

    @Step("Check if Instagram page contains word bolt")
    public BoltMainPage assertInstagramIsOpened() {
        $(byText("bolt")).shouldBe(visible);
        return this;
    }

    @Step("Check if Linkedin title contains Bolt")
    public BoltMainPage assertLinkedinIsOpened() {
        assertThat(title()).isEqualTo("Sign Up | LinkedIn");
        return this;
    }

    @Step("Check if Tiktok page has bolt in title")
    public BoltMainPage assertTiktokIsOpened() {
        assertThat(title()).isEqualTo("Bolt (@bolt) Official TikTok | Watch Bolt's Newest TikTok Videos");
        return this;
    }

    @Step("Check that copyright shows current year")
    public void checkCopyrightYear() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        String copyrightText = "© " + year + " Bolt Technology OÜ";
        $(byText(copyrightText)).shouldBe(visible);
    }
}