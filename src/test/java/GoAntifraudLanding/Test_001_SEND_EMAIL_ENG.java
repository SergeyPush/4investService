package GoAntifraudLanding;

import PagesGAF.MailFormPage;
import PagesGAF.TopMenuPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Test_001_SEND_EMAIL_ENG {

    String BaseURL = "https://landing.goantifraud.com/";

    @Test
    @Title("Отправка сообщения с текстом меньше 20 символов АНГЛИЙСКИЙ")
    public void testName() throws Exception {


        open(BaseURL);
        TopMenuPage.SelectEnglishLang();
        MailFormPage.openMailForm();
        MailFormPage.enterName("testUser");
        MailFormPage.enterEmail("testUser@mail.ru");
        MailFormPage.enterMessage("This is test text");
        MailFormPage.submitMailForm();


        String expectedMessage = "The message must contain at least 20 characters";
        String actualMessage = $(By.xpath(".//*[@id='Contacts_body']/span")).shouldBe(visible).text();

        Assert.assertEquals(expectedMessage, actualMessage);

    }
}
