package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * Created by sergey on 16.12.15.
 */
public class LandingPage {

    public static String EnglishLanguageButton = "//span[contains(text(), 'En')]";
    public static String RussinLanguageButton = "//span[contains(text(), 'Ru')]";
    public static String LoginButton = "//nav[2]/ul/li[2]/a/span";


    public static void selectEnglishLang() {
        $(By.xpath(EnglishLanguageButton)).shouldBe(visible).click();
    }

    public static void selectRussianLang() {
        $(By.xpath(EnglishLanguageButton)).shouldBe(visible).click();
    }

    public static void clickLoginButton() {
        $(By.xpath(LoginButton)).shouldBe(visible).click();
    }
}
