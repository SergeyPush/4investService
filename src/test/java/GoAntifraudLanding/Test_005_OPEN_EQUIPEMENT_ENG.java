package GoAntifraudLanding;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import PagesGAF.MainMenuPage;
import PagesGAF.TopMenuPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by sergey on 15.12.15.
 */
public class Test_005_OPEN_EQUIPEMENT_ENG {

    String BaseURL = "https://landing.goantifraud.com";

    @Test
    @Title("Открыть страницу оборудование ENGLISH")
    public void testOpenEquipement() throws Exception {

        open(BaseURL);
        TopMenuPage.SelectEnglishLang();
        MainMenuPage.openEquipment();

        $(By.xpath("//h1/span")).shouldHave(text("Equipment")).shouldBe(visible);

    }
}
