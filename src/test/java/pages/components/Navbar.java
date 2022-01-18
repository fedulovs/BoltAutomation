package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class Navbar {
    static SelenideElement logo = $(".logo");
    static SelenideElement ride = $(withText("Клиентам"));
    static SelenideElement drivers = $(withText("Стать водителем"));
    static SelenideElement fleets = $(withText("Перевозчикам"));
    static SelenideElement business = $(withText("Для бизнеса"));
    static SelenideElement scooters = $(withText("Самокаты"));
    static SelenideElement food = $(withText("Доставка еды"));
    static SelenideElement cities = $(withText("Города"));

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

    @Step("Open tab with js")
    // TODO change method to one which doesn't use index
    public void openTabWithJS(int index) {
        executeJavaScript("document.getElementsByClassName('menu-item')[" + index + "].click()");
    }
}
