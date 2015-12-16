package test4invest.LOGIN_TESTS;

import Pages.LandingPage;
import Pages.LoginFormPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
/**
 * Created by sergey on 16.12.15.
 */
public class Test_002_LOGIN_WRONG_PASS_ENG {

    String BaseURL = "https://www.4invest.net";

    @Test
    @Title("Проверка ввода неправильного пароля ENG")
    public void testEnterInvalidPassword() throws Exception {
        open(BaseURL);
        LandingPage.selectEnglishLang();
        LandingPage.clickLoginButton();
        LoginFormPage.enterCredentials("spushkovskiy", "123");
        LoginFormPage.clickLoginButton();

        $(By.cssSelector(".x-list-plain>li")).shouldBe(visible).shouldHave(text("Incorrect login or password"));

        close();
    }
}
