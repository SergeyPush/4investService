package PagesGAF;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by sergey on 15.12.15.
 */
public class MailFormPage {

    public static String eMailEnvelope = "(//div/div[2]/div/a[2]/i)[1]";
    public static String nameField = ".//*[@id='Contacts_name']/input";
    public static String emailField = ".//*[@id='Contacts_email']/input";
    public static String commentField = ".//*[@id='Contacts_body']/textarea";
    public static String submitButton = ".//*[@id='feedback-form']/button";


    public static void openMailForm() {
        $(By.xpath(eMailEnvelope)).click();
    }

    public static void enterName(String name) {
        $(By.xpath(nameField)).sendKeys(name);
    }

    public static void enterEmail(String mail) {
        $(By.xpath(emailField)).sendKeys(mail);
    }

    public static void enterMessage(String message) {
        $(By.xpath(commentField)).sendKeys(message);
    }

    public static void submitMailForm() {
        $(By.xpath(submitButton)).click();
    }
}
