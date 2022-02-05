package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {

    @BeforeAll
    static void settings() {
        System.setProperty("webdriver.chrome.driver","src/tools/chromedriver.exe");
        Configuration.browserSize = "1440x900";
    }

    @AfterEach
    void closeBrowser(){
        //После тестов закрываем веб-дайвер
        closeWebDriver();
    }

}
