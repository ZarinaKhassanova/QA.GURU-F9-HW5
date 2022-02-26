package guru.qa.pages;

import static com.codeborne.selenide.Selenide.open;

public class StudentRegistrationForm {

    //region actions
    public StudentRegistrationForm openPage(String url) {
        // Открываем браузер
        open(url);
        return this;
    }
    //endregion

}
