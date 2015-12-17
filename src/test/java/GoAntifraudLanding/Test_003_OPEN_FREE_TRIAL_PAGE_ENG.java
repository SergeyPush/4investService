package GoAntifraudLanding;


import PagesGAF.MainMenuPage;
import PagesGAF.TopMenuPage;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * Created by sergey on 15.12.15.
 */
public class Test_003_OPEN_FREE_TRIAL_PAGE_ENG {

    String BaseURL = "https://landing.goantifraud.com/";

    @Test
    @Title("Нажать кнопку TRY IT NOW")
    public void testOpenFreeTrial() throws Exception {


        open(BaseURL);
        TopMenuPage.SelectEnglishLang();
        MainMenuPage.SelectFreeTrial();

        $(".title.title_step1").shouldBe(visible).shouldHave(text("Registration"));
        $(".register-trial-offer-title").shouldBe(visible).shouldHave(text("7 DAYS FREE:"));



    }
}
