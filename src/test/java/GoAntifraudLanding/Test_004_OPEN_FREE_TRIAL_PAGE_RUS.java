package GoAntifraudLanding;

import PagesGAF.MainMenuPage;
import PagesGAF.TopMenuPage;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by sergey on 15.12.15.
 */
public class Test_004_OPEN_FREE_TRIAL_PAGE_RUS {

    String BaseURL = "https://landing.goantifraud.com/";

    @Test
    @Title("Нажать кнопку ПОПРОБОВАТЬ")
    public void testOpenFreeTrial() throws Exception {


        open(BaseURL);
        TopMenuPage.SelectRussianLang();
        MainMenuPage.SelectFreeTrial();

        $(".title.title_step1").shouldBe(visible).shouldHave(text("Регистрация учетной записи"));
        $(".register-trial-offer-title").shouldBe(visible).shouldHave(text("7 ДНЕЙ БЕСПЛАТНО:"));


    }
}
