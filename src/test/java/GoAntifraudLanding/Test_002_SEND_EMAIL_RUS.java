package GoAntifraudLanding;


import PagesGAF.MailFormPage;
import PagesGAF.TopMenuPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class Test_002_SEND_EMAIL_RUS {

    String BaseURL = "https://landing.goantifraud.com/";

    @Test
    @Title("Отправка сообщения с текстом меньше 20 символов РУССКИЙ")
    public void testName() throws Exception {


        open(BaseURL);
        TopMenuPage.SelectRussianLang();
        MailFormPage.openMailForm();
        MailFormPage.enterName("testUser");
        MailFormPage.enterEmail("testUser@mail.ru");
        MailFormPage.enterMessage("текст");
        MailFormPage.submitMailForm();


        String expectedMessage = "Сообщение должно содержать как минимум 20 символов";
        String actualMessage = $(By.xpath(".//*[@id='Contacts_body']/span")).shouldBe(visible).text();

        Assert.assertEquals(expectedMessage, actualMessage);

    }
}
