package tests;

import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class MainTest {

    public static void main(String[] args) {
        MainPage mainPage = new MainPage();
        open("https://opti-24.com/");
        mainPage.checkHeaderLogin();
        mainPage.hoverHeaderLogin();
        mainPage.checkHeaderLoginText();
    }
}
