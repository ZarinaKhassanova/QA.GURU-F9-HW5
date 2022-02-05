package guru.qa;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

/**
 * Перемещение объектов с помощью Selenide.actions()
 */
public class TestDragAndDrop extends BaseTest {

    @Test
    void testDragAndDrop(){

        //region
        open("https://the-internet.herokuapp.com/drag_and_drop");

        SelenideElement elementA = $("#column-a");
        SelenideElement elementB = $("#column-b");

        //Переносим прямоугольник А на место В с помощью Selenide.actions() - не смогла побороть:(((
        //actions().moveToElement(elementA).clickAndHold().moveByOffset(150,0).release().perform();

        //Вариант dragAndDrop самый быстрый и работает
        elementA.dragAndDropTo(elementB);

        // Проверяем, что прямоугольники действительно поменялись
        elementA.$("header").shouldHave(text("B"));
        elementB.$("header").shouldHave(text("A"));
        //endregion

    }
}
