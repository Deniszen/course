package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement loginHeader = $("h1");

    private SelenideElement loginField = $("[type=text]");

    private SelenideElement passwordField = $("[type=password]");

    public void checkLoginHeader() {
        loginHeader.shouldHave(text("Вход в личный кабинет"));
    }

    public void enterLogin(String login) {
        loginField.setValue(login);
    }

    public void enterPassword(String password) {
        passwordField.setValue(password);
    }
}
