package GoAntifraudLanding;


import PagesGAF.MainMenuPage;
import PagesGAF.TopMenuPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by sergey on 15.12.15.
 */
public class Test_006_OPEN_EQUIPEMENT_RUS {

    String BaseURL = "https://landing.goantifraud.com";

    @Test
    @Title("Открыть страницу оборудование RUSSIAN")
    public void testOpenEquipment() throws Exception {

        open(BaseURL);
        TopMenuPage.SelectRussianLang();
        MainMenuPage.openEquipment();

        $(By.xpath("//h1/span")).shouldHave(text("Оборудование")).shouldBe(visible);

    }
}
