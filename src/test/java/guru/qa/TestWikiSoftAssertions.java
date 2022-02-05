package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Проверка на наличие кода для JUnit5 на странице SoftAssertions
 * раздела Wiki проекта Selenide в Github
 */
public class TestWikiSoftAssertions extends BaseTest {

    @Test
    void checkWikiSoftAssertions(){

        //region Selenide in Github
        // Открываем страницу Selenide в Github
        open("https://github.com/selenide/selenide");

        // Переходим в раздел Wiki
        $("#wiki-tab").click();

        // Проверяем, что в списке страниц есть SoftAssertions
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));

        // Переходим в SoftAssertions
        $(byText("SoftAssertions")).click();

        // Проверяем пример кода для JUnit5
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class"));
        //endregion
    }
}
