package PagesGAF;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * Created by sergey on 15.12.15.
 */
public class TopMenuPage {

    public static String russianLanguageButton = "//button/span[contains(text(), 'Ru')]";
    public static String englishLanguageButton = "//button/span[contains(text(), 'En')]";


    public static void SelectEnglishLang() {
        $(By.xpath(englishLanguageButton)).shouldBe(visible).click();
    }

    public static void SelectRussianLang() {
        $(By.xpath(russianLanguageButton)).shouldBe(visible).click();
    }

}
