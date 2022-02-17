package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;
import pages.LoginPage;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainJunitTest {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @BeforeAll
    public static void setup() {
        System.out.println("BeforeAll method");
        open("https://opti-24.com/");
    }

    @BeforeEach
    public void init() {
        System.out.println("BeforeEach");
    }

    @Description("Check header login test")
    @Test
    @Order(1)
    public void testCheckHeaderLogin() {
        mainPage.checkHeaderLogin();
    }

    @Description("Check header login text test")
    @Test
    @Order(2)
    public void testCheckHeaderText() {
        mainPage.checkHeaderLogin();
        mainPage.hoverHeaderLogin();
        mainPage.checkHeaderLoginText();
        mainPage.clickOnHeader();
        loginPage.checkLoginHeader();
        loginPage.enterLogin("login");
        loginPage.enterPassword("login");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach method");
    }

    @AfterAll
    static void done() {
        System.out.println("AfterAll method");
    }
}
