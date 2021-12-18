package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class BoltMainPage {

    @Step("Open main page")
    public BoltMainPage openPage() {
        open("https://bolt.eu/ru/");
        String expectedTitle = "Bolt | Быстрые и доступные поездки";
        String actualTitle = title();
        assertThat(actualTitle).isEqualTo(expectedTitle);

        $(withText("Быстрые и доступные поездки.")).shouldBe(visible);

        checkNavbarItems();

        return this;
    }

    @Step("Open drivers page")
    public void openDriversPage() {
        executeJavaScript("document.getElementsByClassName('menu-item')[1].click()"); // Yes, it's a bad practice to use indexes
        $(byText("Зарегистрируйтесь в качестве водителя")).shouldBe(visible);
    }

    @Step("Open fleets page")
    public void openFleetsPage() {
        executeJavaScript("document.getElementsByClassName('menu-item')[2].click()"); // Yes, it's a bad practice to use indexes
        $(byText("Станьте партнером Bolt")).shouldBe(visible);
        $(byText("Подключайте водителей и автомобили")).shouldBe(visible);
    }

    @Step("Open business page")
    public void openBusinessPage() {
        executeJavaScript("document.getElementsByClassName('menu-item')[3].click()"); // Yes, it's a bad practice to use indexes
        $(byText("Быстрые, удобные и доступные деловые поездки")).shouldBe(visible);
        $(byText("Контролируйте передвижение вашей команды. Поездки на работу, встречи, трансферы в аэропорт," +
                " поездки для гостей компании. Управляйте всем на одной платформе.")).shouldBe(visible);
    }

    @Step("Open scooters page")
    public void openScootersPage() {
        executeJavaScript("document.getElementsByClassName('menu-item')[4].click()"); // Yes, it's a bad practice to use indexes
        $(byText("Безопасно.")).shouldBe(visible);
        $(byText("Доступно.")).shouldBe(visible);
        $(byText("С заботой об окружающей среде.")).shouldBe(visible);
    }

    @Step("Open food page")
    public void openFoodPage() {
        executeJavaScript("document.getElementsByClassName('menu-item')[5].click()"); // Yes, it's a bad practice to use indexes
        assertThat(title()).isEqualTo("Bolt Food - Bolt Food");
    }

    @Step("Open cities page")
    public void openCitiesPage() {
        executeJavaScript("document.getElementsByClassName('menu-item')[6].click()"); // Yes, it's a bad practice to use indexes
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

    @Step("Check the presence of navbar items")
    public void checkNavbarItems() {
        Navbar.logo.should(exist);
        Navbar.ride.should(exist);
        Navbar.drivers.should(exist);
        Navbar.fleets.should(exist);
        Navbar.business.should(exist);
        Navbar.scooters.should(exist);
        Navbar.food.should(exist);
        Navbar.cities.should(exist);
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
        // Page is unavailable
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

    public static class Navbar {
        static SelenideElement logo = $(".logo");
        static SelenideElement ride = $(withText("Клиентам"));
        static SelenideElement drivers = $(withText("Стать водителем"));
        static SelenideElement fleets = $(withText("Перевозчикам"));
        static SelenideElement business = $(withText("Для бизнеса"));
        static SelenideElement scooters = $(withText("Самокаты"));
        static SelenideElement food = $(withText("Доставка еды"));
        static SelenideElement cities = $(withText("Города"));
    }
}
