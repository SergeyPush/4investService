package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * Created by sergey on 16.12.15.
 */
public class LoginFormPage {

    public static String LoginField = "login";
    public static String PasswordField = "password";
    public static String LoginButton = "button-1946-btnInnerEl";

    public static void enterCredentials(String login, String pass) {
        $(By.name(LoginField)).waitUntil(visible, 10000).shouldBe(visible).sendKeys(login);
        $(By.name(PasswordField)).waitUntil(visible, 10000).shouldBe(visible).sendKeys(pass);
    }

    public static void clickLoginButton() {
        $(By.id(LoginButton)).shouldBe(enabled, visible).click();
    }
}
