package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    static void settings() {
        //ps: Веб-драйвер скачала локально, чтобы поберечь ресурсы ПК
        System.setProperty("webdriver.chrome.driver","src/tools/chromedriver.exe");
        Configuration.browserSize = "1440x900";
    }

    @BeforeEach
    void openBrowser() {
        //Открываем браузер
        open("https://demoqa.com/automation-practice-form");
    }

    @AfterEach
    void closeBrowser(){
        //После каждого теста закрываем веб-дайвер
        closeWebDriver();
    }

}
