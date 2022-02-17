package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement headerLogin = $(".header__login");

    private SelenideElement headerLoginText = $(".header__login-text");

    public void checkHeaderLogin() {
        headerLogin.shouldBe(visible);
    }

    public void hoverHeaderLogin() {
        headerLogin.hover();
    }

    public void checkHeaderLoginText() {
        headerLoginText.shouldBe(text("Личный кабинет"));
    }

    public void clickOnHeader() {
        headerLoginText.click();
    }
}