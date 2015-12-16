package test4invest;

import Pages.LandingPage;
import Pages.LoginFormPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * Created by sergey on 16.12.15.
 */
public class Test_001_OPEN_LOGIN_FORM_ENG {

    String BaseURL = "https://www.4invest.net/";

    @Test
    @Title("Открытие формы логина ENG")
    public void testOpenLoginForm() throws Exception {

        open(BaseURL);
        LandingPage.selectEnglishLang();
        LandingPage.clickLoginButton();
        LoginFormPage.enterCredentials("spushkovskiy", "pass4invest");
        LoginFormPage.clickLoginButton();

        $(By.id("toolbarAvatar")).waitUntil(visible, 6000).shouldBe(visible);
        close();

    }
}
