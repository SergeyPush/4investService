package PagesGAF;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * Created by sergey on 15.12.15.
 */
public class MainMenuPage {

    public static String freeTrialButton = "//section[1]/div/div[2]/a/button";
    public static String EquipmentLink = "//div[2]/div/ul/li[4]/a";

    public static void SelectFreeTrial() {
        $(By.xpath(freeTrialButton)).shouldBe(visible, enabled).click();
    }
    public static void openEquipment(){
        $(By.xpath(EquipmentLink)).click();
    }
}
